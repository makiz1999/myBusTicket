package BusApplication.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHandler extends Configs {
    Connection dbconnection;

    public Connection getConnection()
    {
        String connectionString = "jdbc:mysql://"+ dbhost + ":" + dbport + "/" + dbname +"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";


        try {
            dbconnection = DriverManager.getConnection(connectionString, dbuser, dbpass);
            //dbconnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myBusTicket?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
            //        "root", "maksim19999");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dbconnection;

    }

}
