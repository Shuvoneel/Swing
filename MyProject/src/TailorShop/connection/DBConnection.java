package TailorShop.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {

    static Connection conn = null;

    public static Connection getDBConnection() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shuvo_project", "root", "1234");
            System.out.println("Connected");
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
