module myBusTicket {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    opens BusApplication;
    opens BusApplication.DBConnection;
    opens BusApplication.Controller;
    opens BusApplication.FXML;
    opens BusApplication.LoginConfig;
}