/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OLEE
 */
public class CustomerDAO {

    public List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<>();
        String sql = "select * from customer";
        Connection conn = ConnectionToDB.connect();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer(rs.getInt(1), rs.getString(2), rs.getString(2));
            }
        } catch (Exception e) {
        }

        return customers;
    }

    public Customer getCustomerByID(int c_id) {
        Customer customer = null;
        String sql = "select * from customer where cust_id=?";
        Connection conn = ConnectionToDB.connect();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, c_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                customer = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
        } catch (Exception e) {
        }
        return customer;
    }

    public List<Integer> getCustomerID() {
        List<Integer> productID = new ArrayList<>();
        String sql = "select * from customer";
        Connection conn = ConnectionToDB.connect();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                productID.add(rs.getInt(1));
            }
        } catch (Exception e) {
        }

        return productID;
    }
}
