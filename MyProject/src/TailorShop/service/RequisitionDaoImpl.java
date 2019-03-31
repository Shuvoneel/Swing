package TailorShop.service;

import TailorShop.connection.DBConnection;
import java.util.List;
import TailorShop.dao.RequisitionDao;
import TailorShop.pojo.Category;
import TailorShop.pojo.Client;
import TailorShop.pojo.Measurement;
import TailorShop.pojo.Requisition;
import TailorShop.tables.CreateTables;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RequisitionDaoImpl implements RequisitionDao {

    Connection conn = DBConnection.getDBConnection();

    @Override
    public void createTable() {
        CreateTables.requisitionTable();
    }

    @Override
    public void save(Requisition r) {
        String sql = "insert into requisition(id, quantity, unit_price, total_price, advance, due, order_date, delivery_date, client_id, cat_id, measurement_id) values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, r.getId());
            ps.setInt(2, r.getQty());
            ps.setDouble(3, r.getUnitPrice());
            ps.setDouble(4, r.getTotalPrice());
            ps.setDouble(5, r.getAdvance());
            ps.setDouble(6, r.getDue());
            ps.setDate(7, new java.sql.Date(r.getOrderDate().getTime()));
            ps.setDate(8, new java.sql.Date(r.getDeliveryDate().getTime()));
            ps.setInt(9, r.getClient().getId());
            ps.setInt(10, r.getCategory().getId());
            ps.setInt(11, r.getMeasurement().getId());
            ps.executeUpdate();
            System.out.println("Successfully Saved !");
        } catch (SQLException se) {
            Logger.getLogger(RequisitionDaoImpl.class.getName()).log(Level.SEVERE, null, se);
        }
    }

    @Override
    public void update(Requisition r) {
        String sql = "update requisition set quantity=?, unit_price=?, total_price=?, advance=?, due=?, order_date=?, delivery_date=?, client_id=?, cat_id=?, measurement_id=? where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, r.getQty());
            ps.setDouble(2, r.getUnitPrice());
            ps.setDouble(3, r.getTotalPrice());
            ps.setDouble(4, r.getAdvance());
            ps.setDouble(5, r.getDue());
            ps.setDate(6, new java.sql.Date(r.getOrderDate().getTime()));
            ps.setDate(7, new java.sql.Date(r.getDeliveryDate().getTime()));
            ps.setInt(8, r.getClient().getId());
            ps.setInt(9, r.getCategory().getId());
            ps.setInt(10, r.getMeasurement().getId());
            ps.setInt(11, r.getId());
            ps.executeUpdate();
            System.out.println("Successfully Updated !");
        } catch (SQLException se) {
            Logger.getLogger(RequisitionDaoImpl.class.getName()).log(Level.SEVERE, null, se);
        }
    }

    @Override
    public Requisition getRequisitionById(int id) {
        Requisition requisition = new Requisition();
        String sql = "select * from requisition where id=?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                requisition.setId(rs.getInt(1));
                requisition.setQty(rs.getInt(2));
                requisition.setUnitPrice(rs.getDouble(3));
                requisition.setTotalPrice(rs.getDouble(4));
                requisition.setAdvance(rs.getDouble(5));
                requisition.setDue(rs.getDouble(6));
                requisition.setOrderDate(rs.getDate(7));
                requisition.setDeliveryDate(rs.getDate(8));
                requisition.setClient(new Client(rs.getInt(9)));
                requisition.setCategory(new Category(rs.getInt(10)));
                requisition.setMeasurement(new Measurement(rs.getInt(11)));
            }

        } catch (SQLException ex) {
            Logger.getLogger(RequisitionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return requisition;
    }

    @Override
    public Requisition getRequisitionByClientMobile(int mobile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Requisition> getRequisitions() {
        List<Requisition> requisitions = new ArrayList();
        Requisition requisition;
        String sql = "select * from requisition";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Client client = new Client(rs.getInt(9));
                Measurement measurement = new Measurement(rs.getInt(10));
                Category category = new Category(rs.getInt(11));
                requisition = new Requisition(rs.getInt(1), rs.getInt(2), rs.getDouble(3), rs.getDouble(4), rs.getDouble(5), rs.getDouble(6), rs.getDate(7), rs.getDate(8), client, measurement, category);
                requisitions.add(requisition);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RequisitionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return requisitions;
    }

    @Override
    public List<Requisition> getRequisitionsById(int id) {
        List<Requisition> requisitions = new ArrayList();
        String sql = "select * from requisition where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Client client = new Client(rs.getInt(9));
                Measurement measurement = new Measurement(rs.getInt(10));
                Category category = new Category(rs.getInt(11));
                Requisition requisition = new Requisition(rs.getInt(1), rs.getInt(2), rs.getDouble(3), rs.getDouble(4), rs.getDouble(5), rs.getDouble(6), rs.getDate(7), rs.getDate(8), client, measurement, category);
                requisitions.add(requisition);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RequisitionDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return requisitions;
    }

    public int getLastRow() {
        int idNo = 0;
        String sql = "select * from requisition ORDER BY id DESC LIMIT 1;";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                idNo = rs.getInt(1);
            }
            System.out.println("Successfully Retrieved ! ");
        } catch (Exception e) {
            Logger.getLogger(RequisitionDaoImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return idNo;
    }

}
