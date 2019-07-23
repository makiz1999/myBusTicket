package BusApplication.Controller;

import BusApplication.LoginConfig.LoginConfig;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class LoginController extends LoginConfig {
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button loginButton;

    @FXML
    public void loginButtonClick() throws IOException{
        if(username.getText().equals(loginName) && password.getText().equals(loginPassword)){

            loginButton.getScene().getWindow().hide();
            Stage departure = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/BusApplication/FXML/DepartureCity.fxml"));
            departure.setScene(new Scene(root, 600, 400));
            departure.setResizable(false);
            departure.show();
        } else {
            Window window = loginButton.getScene().getWindow();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Username or password is incorrect\nPlease try again");
            alert.initOwner(window);
            alert.show();
        }
    }
}
