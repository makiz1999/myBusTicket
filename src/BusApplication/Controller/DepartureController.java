package BusApplication.Controller;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DepartureController {
    @FXML
    private Button newYorkButton;
    @FXML
    private Button losAngelesButton;
    @FXML
    private Button chicagoButton;
    @FXML
    private Button houstonButton;
    @FXML
    private Button phoenixButton;
    @FXML
    private Button philadelphiaButton;
    @FXML
    private Button sanAntonioButton;
    @FXML
    private Button sanDiegoButton;
    @FXML
    private Button dallasButton;
    @FXML
    private Button sanJoseButton;
    @FXML
    private Button austinButton;
    @FXML
    private Button jacksonvilleButton;
    @FXML
    private Button forthWorthButton;
    @FXML
    private Button columbusButton;
    @FXML
    private Button seattleButton;
    @FXML
    private Button indianapolisButton;

    @FXML
    public void newYorkDeparture() throws IOException {
        newYorkButton.getScene().getWindow().hide();
        Stage purchase = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/BusApplication/FXML/NewYorkPurchase.fxml"));
        purchase.setScene(new Scene(root, 600, 400));
        purchase.setResizable(false);
        purchase.show();
    }
    @FXML
    public void losAngelesDeparture() throws IOException {
        losAngelesButton.getScene().getWindow().hide();
        Stage purchase = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/BusApplication/FXML/LosAngelesPurchase.fxml"));
        purchase.setScene(new Scene(root, 600, 400));
        purchase.setResizable(false);
        purchase.show();
    }
    @FXML
    public void chicagoDeparture() throws IOException {
        chicagoButton.getScene().getWindow().hide();
        Stage purchase = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/BusApplication/FXML/ChicagoPurchase.fxml"));
        purchase.setScene(new Scene(root, 600, 400));
        purchase.setResizable(false);
        purchase.show();
    }
    @FXML
    public void houstonDeparture() throws IOException {
        houstonButton.getScene().getWindow().hide();
        Stage purchase = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/BusApplication/FXML/HoustonPurchase.fxml"));
        purchase.setScene(new Scene(root, 600, 400));
        purchase.setResizable(false);
        purchase.show();
    }
    @FXML
    public void phoenixDeparture() throws IOException {
        phoenixButton.getScene().getWindow().hide();
        Stage purchase = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/BusApplication/FXML/PhoenixPurchase.fxml"));
        purchase.setScene(new Scene(root, 600, 400));
        purchase.setResizable(false);
        purchase.show();
    }
    @FXML
    public void philadelphiaDeparture() throws IOException {
        philadelphiaButton.getScene().getWindow().hide();
        Stage purchase = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/BusApplication/FXML/PhiladelphiaPurchase.fxml"));
        purchase.setScene(new Scene(root, 600, 400));
        purchase.setResizable(false);
        purchase.show();
    }
    @FXML
    public void sanAntonioDeparture() throws IOException {
        sanAntonioButton.getScene().getWindow().hide();
        Stage purchase = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/BusApplication/FXML/SanAntonioPurchase.fxml"));
        purchase.setScene(new Scene(root, 600, 400));
        purchase.setResizable(false);
        purchase.show();
    }
    @FXML
    public void sanDiegoDeparture() throws IOException {
        sanDiegoButton.getScene().getWindow().hide();
        Stage purchase = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/BusApplication/FXML/SanDiegoPurchase.fxml"));
        purchase.setScene(new Scene(root, 600, 400));
        purchase.setResizable(false);
        purchase.show();
    }
    @FXML
    public void dallasDeparture() throws IOException {
        dallasButton.getScene().getWindow().hide();
        Stage purchase = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/BusApplication/FXML/DallasPurchase.fxml"));
        purchase.setScene(new Scene(root, 600, 400));
        purchase.setResizable(false);
        purchase.show();
    }
    @FXML
    public void sanJoseDeparture() throws IOException {
        sanJoseButton.getScene().getWindow().hide();
        Stage purchase = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/BusApplication/FXML/SanJosePurchase.fxml"));
        purchase.setScene(new Scene(root, 600, 400));
        purchase.setResizable(false);
        purchase.show();
    }
    @FXML
    public void austinDeparture() throws IOException {
        austinButton.getScene().getWindow().hide();
        Stage purchase = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/BusApplication/FXML/AustinPurchase.fxml"));
        purchase.setScene(new Scene(root, 600, 400));
        purchase.setResizable(false);
        purchase.show();
    }
    @FXML
    public void jacksonvilleDeparture() throws IOException {
        jacksonvilleButton.getScene().getWindow().hide();
        Stage purchase = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/BusApplication/FXML/JacksonvillePurchase.fxml"));
        purchase.setScene(new Scene(root, 600, 400));
        purchase.setResizable(false);
        purchase.show();
    }
    @FXML
    public void forthWorthDeparture() throws IOException {
        forthWorthButton.getScene().getWindow().hide();
        Stage purchase = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/BusApplication/FXML/ForthWorthPurchase.fxml"));
        purchase.setScene(new Scene(root, 600, 400));
        purchase.setResizable(false);
        purchase.show();
    }
    @FXML
    public void columbusDeparture() throws IOException {
        columbusButton.getScene().getWindow().hide();
        Stage purchase = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/BusApplication/FXML/ColumbusPurchase.fxml"));
        purchase.setScene(new Scene(root, 600, 400));
        purchase.setResizable(false);
        purchase.show();
    }
    @FXML
    public void seattleDeparture() throws IOException {
        seattleButton.getScene().getWindow().hide();
        Stage purchase = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/BusApplication/FXML/SeattlePurchase.fxml"));
        purchase.setScene(new Scene(root, 600, 400));
        purchase.setResizable(false);
        purchase.show();
    }
    @FXML
    public void indianapolisDeparture() throws IOException {
        indianapolisButton.getScene().getWindow().hide();
        Stage purchase = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/BusApplication/FXML/IndianapolisPurchase.fxml"));
        purchase.setScene(new Scene(root, 600, 400));
        purchase.setResizable(false);
        purchase.show();
    }
}
