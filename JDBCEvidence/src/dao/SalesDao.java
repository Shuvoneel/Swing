package dao;

import connection.CustomConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pojo.Sales;

public class SalesDao {

    Connection con = CustomConnection.connect();

    public void save(Sales sales) {
        String sql = "insert into sales(id, p_id, c_id, quantity, price) values(?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, sales.getId());
            ps.setInt(2, sales.getProduct().getId());
            ps.setInt(3, sales.getCustomer().getId());
            ps.setInt(4, sales.getQuantity());
            ps.setDouble(5, sales.getPrice());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Integer> getSalesId() {
        List<Integer> salesId = new ArrayList<>();
        String sql = "select * from sales";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                salesId.add(rs.getInt(1));
            }
        } catch (Exception e) {
        }
        return salesId;
    }
}
