package BusApplication.Controller;

import BusApplication.DBConnection.DBHandler;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class NewYorkController {
    @FXML
    private ComboBox destinationChoice;
    @FXML
    private DatePicker departureDate;
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField phoneNumber;
    @FXML
    private Button purchaseButton;
    @FXML
    private ComboBox price;
    @FXML
    private Button backButton;

    private Connection connection;
    private DBHandler handler;
    private java.sql.PreparedStatement pst;

    public void initialize(){
        destinationChoice.setItems(FXCollections.observableArrayList("Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia",
                "San Antonio", "San Diego", "Dallas", "San Jose", "Austin", "Jacksonville", "Forth Worth", "Columbus", "Seattle", "Indianapolis"));
        price.setItems(FXCollections.observableArrayList("Common ticket: 15$", "Veteran ticket: 10$", "Child ticket: 5$"));

        handler = new DBHandler();

    }
    public void onBackButton() throws IOException {
        backButton.getScene().getWindow().hide();
        Stage destination = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/BusApplication/FXML/DepartureCity.fxml"));
        destination.setScene(new Scene(root, 600, 400));
        destination.setResizable(false);
        destination.show();
    }
    public void onPurchaseButton(){
        LocalDate now = LocalDate.now();
        LocalDate date = departureDate.getValue();
        String ticketPrice = price.getSelectionModel().getSelectedItem().toString();

        if(destinationChoice == null || date == null || destinationChoice.getSelectionModel().isEmpty() || date.isBefore(now) || firstName.getText().isEmpty() ||
                lastName.getText().isEmpty() || phoneNumber.getText().isEmpty() || price.getSelectionModel().isEmpty()){
            Window window = purchaseButton.getScene().getWindow();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter correct information");
            alert.initOwner(window);
            alert.show();
        } else {
            String selectedChoice = destinationChoice.getSelectionModel().getSelectedItem().toString();
            Window window = purchaseButton.getScene().getWindow();
            Alert purchase = new Alert(Alert.AlertType.INFORMATION);
            purchase.setHeaderText("Ticket");
            purchase.setContentText("Departure: New York\nDestination: " + selectedChoice + "\nDeparture date: " + date +
                    "\nFirst Name: " + firstName.getText() + "\nLast Name: " + lastName.getText() + "\nPhone Number: " +
                    phoneNumber.getText() + "\nPurchase date: " + now +
                    "\nTicket price: " + ticketPrice.substring(ticketPrice.length()-3));
            purchase.initOwner(window);
            purchase.show();
        }

        String insert = "INSERT INTO purchase(departure, arrival, firstName, lastName, date, phoneNumber, price)" +
                "VALUES (?,?,?,?,?,?, ?)";
        connection = handler.getConnection();
        try {
            pst = connection.prepareStatement(insert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pst.setString(1, "New York");
            pst.setString(2, destinationChoice.getSelectionModel().getSelectedItem().toString());
            pst.setString(3, firstName.getText());
            pst.setString(4, lastName.getText());
            pst.setString(5, date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            pst.setString(6, phoneNumber.getText());
            pst.setString(7, ticketPrice.substring(ticketPrice.length()-3, ticketPrice.length()-1));
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
