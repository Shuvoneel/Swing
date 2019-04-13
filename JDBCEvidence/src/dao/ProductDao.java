/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.CustomConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pojo.Product;

/**
 *
 * @author mhshu
 */
public class ProductDao {

    Connection con = CustomConnection.connect();

    public List<Integer> getProductId() {
        List<Integer> productId = new ArrayList<>();
        String sql = "select * from product";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                productId.add(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productId;
    }

    public int getStock(int id) {
        int stock = 0;
        String sql = "select stock from product";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                stock = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stock;
    }

    public void addStock(int id, int addQty) {
        String sql = "update product set stock=? where id = ?";
        int newQty = addQty + getStock(id);
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, newQty);
            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deductStock(int id, int deductQty) {
        String sql = "update product set stock=? where id = ?";
        int newQty = getStock(id) - deductQty;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, newQty);
            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Product getProductById(int id) {
        Product product = null;
        String sql = "select * from product where id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                product = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4));
            }
        } catch (Exception e) {
        }
        return product;
    }
}
