package TailorShop.tables;

import TailorShop.connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateTables {

    static Connection conn = DBConnection.getDBConnection();

    public static void roleTable() {
        String sql = " create table IF NOT EXISTS role(id int(5) auto_increment primary key, role_name varchar(30) unique)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Role Table Created");
        } catch (SQLException se) {
            Logger.getLogger(CreateTables.class.getName()).log(Level.SEVERE, null, se);
        }
    }

    public static void clientTable() {
        String sql = " create table IF NOT EXISTS client(id int(5) auto_increment primary key, name varchar(30), "
                + "mobile int(11) unique, email varchar(30), address varchar(50))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Client Table Created");
        } catch (SQLException se) {
            Logger.getLogger(CreateTables.class.getName()).log(Level.SEVERE, null, se);
        }
    }

    public static void categoryTable() {
        String sql = " create table IF NOT EXISTS category(id int(5) auto_increment primary key, cat_name varchar(30) unique)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Category Table Created");
        } catch (SQLException se) {
            Logger.getLogger(CreateTables.class.getName()).log(Level.SEVERE, null, se);
        }
    }

    public static void measurementTable() {
        String sql = " create table IF NOT EXISTS measurement(id int(5) auto_increment primary key, length double, width double, shoulder double, waist double, chest double, cat_name varchar(30), client_id int(5), FOREIGN KEY (client_id) REFERENCES client(id))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Measurement Table Created");
        } catch (SQLException se) {
            Logger.getLogger(CreateTables.class.getName()).log(Level.SEVERE, null, se);
        }
    }

    public static void requisitionTable() {
        String sql = "create table IF NOT EXISTS requisition(id int(5)  auto_increment primary key, quantity int(3), unit_price double, total_price double, advance double, due double, order_date date, delivery_date date, client_id int(5), cat_id int(5), measurement_id int(5), FOREIGN KEY (client_id) REFERENCES client(id), FOREIGN KEY (cat_id) REFERENCES category(id), FOREIGN KEY (measurement_id) REFERENCES measurement(id))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Requisition Table Created");
        } catch (SQLException se) {
            Logger.getLogger(CreateTables.class.getName()).log(Level.SEVERE, null, se);
        }
    }

    public static void deliveryTable() {
        String sql = "create table IF NOT EXISTS delivery(id int(5) auto_increment primary key, client_name varchar(20), order_id int(5), quantity int(3), category varchar(20), total_price double, due double, order_date date, delivery_date date, FOREIGN KEY (order_id) REFERENCES requisition(id))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Delivery Table Created");
        } catch (SQLException se) {
            Logger.getLogger(CreateTables.class.getName()).log(Level.SEVERE, null, se);
        }
    }

    public static void summaryTable() {
        String sql = "create table IF NOT EXISTS summary(id int(5)  auto_increment primary key, order_date date, quantity int(3), delivery_status varchar(20), client_id int(5), order_id int(5), FOREIGN KEY (client_id) REFERENCES client(id), FOREIGN KEY (order_id) REFERENCES requisition(id))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Summary Table Created");
        } catch (SQLException se) {
            Logger.getLogger(CreateTables.class.getName()).log(Level.SEVERE, null, se);
        }
    }
}
