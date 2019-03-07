
package JDBC.test;

import JDBC.connection.CustomDbConnection;
import JDBC.connection.DBConnection;

public class TestConn {
    public static void main(String[] args) {
        System.out.println("Main DB Connected");
        DBConnection.getDBConnection();
        System.out.println("Custom DB Connected");
        
    }
}
