package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class CustomConnection {

    public static void main(String[] args) {
        connect();
    }

    public static Connection connect() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/salman", "root", "1234");
            System.out.println("salman connected");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    String cusTab = "create table customer(id int(5) auto_increment primary key, name varchar(30), address varchar(30))"; // id, name, address
    String proTab = "create table product(id int(5) auto_increment primary key, name varchar(30), stock int(5), price double)"; // id, name, stock, price
    String saltab = "create table sales(id int(5) auto_increment primary key, p_id int(5), c_id int(5), quantity int(5), price double, foreign key(p_id) references product(id), foreign key(c_id) references customer(id))"; // id, p_id, c_id, quantity, price
}
