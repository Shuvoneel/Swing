package dao;

import connection.CustomConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pojo.Customer;

public class CustomerDao {

    Connection con = CustomConnection.connect();

    public Customer getCustomerById(int id) {
        Customer customer = null;
        String sql = "select * from customer where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                customer = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
        } catch (Exception e) {
        }
        return customer;
    }

    public List<Integer> getCustomerId() {
        List<Integer> customerId = new ArrayList<>();
        String sql = "select * from customer";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                customerId.add(rs.getInt(1));
            }
        } catch (Exception e) {
        }
        return customerId;
    }

    public List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<>();
        String sql = "select * from customer";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
        } catch (Exception e) {
        }
        return customers;
    }
}
