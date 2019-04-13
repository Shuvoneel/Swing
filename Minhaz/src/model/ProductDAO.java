package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

/**
 *
 * @author OLEE
 */
public class ProductDAO {

    public List<Integer> productID() {
        List<Integer> productID = new ArrayList<>();
        String sql = "select * from product";
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

    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        String sql = "select * from product";
        Connection conn = ConnectionToDB.connect();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product(rs.getInt(1), rs.getString(2), (int) rs.getDouble(3), rs.getDouble(3));
            }
        } catch (Exception e) {
        }

        return products;
    }

    public int getStock(int p_id) {
        int stock = 0;
        String sql = "select p_stoce from product";
        Connection conn = ConnectionToDB.connect();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                stock = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return stock;
    }

    public void addToStock(int p_id, int addQty) {

        String sql = "update product set p_stoce=? where p_id=?";
        int newQty = addQty + getStock(p_id);
        Connection conn = ConnectionToDB.connect();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, newQty);
            ps.setInt(2, p_id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deductFromStock(int p_id, int addQty) {

        String sql = "update product set p_stoce=? where p_id=?";
        int newQty = getStock(p_id) - addQty;
        Connection conn = ConnectionToDB.connect();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, newQty);
            ps.setInt(2, p_id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Product getProductByID(int p_id) {
        Product product = null;
        String sql = "select * from product where p_id=?";
        Connection conn = ConnectionToDB.connect();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, p_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                product = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4));
            }
        } catch (Exception e) {
        }
        return product;
    }

}
