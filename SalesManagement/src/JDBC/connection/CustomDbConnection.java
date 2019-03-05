package JDBC.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomDbConnection {

    static Connection conn = null;

    public static Connection getDbConnection(String host, String port, String dbname, String username, String password) {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + dbname, username, password);
            System.out.println("Connected");
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
