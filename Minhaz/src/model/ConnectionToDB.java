package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionToDB {

    public static void main(String[] args) {
        connect();
    }

    public static Connection connect() {
        Connection conn = null;

        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "1234");
            System.out.println("Connected...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    String stmt = "create table customer(cust_id int primary key auto_increment,cust_name varchar(55),cust_address varchar(55))";
    String product = " create table product(p_id int primary key auto_increment,p_name varchar(55),p_stoce double,p_price double);";
    String tbl = "create table sales(sale_no int primary key,p_id int,c_id int,p_qnty int,p_price double, foreign key(p_id) references product(p_id), foreign key(c_id) references customer(cust_id))";

}
