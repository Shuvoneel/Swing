package TailorShop.service;

import TailorShop.connection.DBConnection;
import TailorShop.dao.SummaryDao;
import TailorShop.pojo.Summary;
import TailorShop.tables.CreateTables;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SummaryDaoImpl implements SummaryDao {

    Connection conn = DBConnection.getDBConnection();

    @Override
    public void createTable() {
        CreateTables.summaryTable();
    }

    @Override
    public void save(Summary s) {
        String sql = "insert into summary(date, total_order) values(?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setDate(1, (java.sql.Date) s.getDate());
            pstm.setInt(2, s.getTotalOrder());
            pstm.executeUpdate();
            System.out.println("Insert success !");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Summary s) {
        String sql = "update summary set total_order=? where date=?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);

            pstm.setInt(1, s.getTotalOrder());
            pstm.setDate(2, (java.sql.Date) s.getDate());
            pstm.executeUpdate();
            System.out.println("Update success!");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Summary getSummaryById(int id) {
        Summary summary = null;
        String sql = "select * from summary where id=?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                summary = new Summary(rs.getInt(1), rs.getDate(2), rs.getInt(3));
            }

        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return summary;
    }

//    @Override
//    public Summary getSummaryByDate(Date date) {
//        Summary summary = null;
//        String sql = "select * from summary where date=?";
//        try {
//            PreparedStatement pstm = conn.prepareStatement(sql);
//            pstm.setDate(1, (java.sql.Date) date);
//            ResultSet rs = pstm.executeQuery();
//            while (rs.next()) {
//                summary = new Summary(rs.getInt(1), rs.getDate(2), rs.getInt(3));
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(SummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return summary;
//    }
    public static void main(String[] args) {
        SummaryDaoImpl dao = new SummaryDaoImpl();
        System.out.println(dao.getTotalOrder(new Date()));
    }

    public int getTotalOrder(java.util.Date date) {
        int totalOrder = 0;
        String sql = "select sum(quantity) from requisition where order_date = ?;";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(date.getTime()));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                totalOrder = rs.getInt(1);
            }
            System.out.println("Successfully Retrieved ! ");
        } catch (Exception e) {
            Logger.getLogger(SummaryDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return totalOrder;
    }

    @Override
    public List<Summary> getList() {
        List<Summary> list = new ArrayList<>();
        String sql = "select * from summary";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Summary summary = new Summary(rs.getInt(1), rs.getDate(2), rs.getInt(3));
                list.add(summary);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
