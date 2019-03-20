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
        String sql = "insert into requisition(id, quantity, unit_price, total_price, advance, due, order_date, delivery_date, client_id, cat_id, measurement) values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, r.getId());
            ps.setInt(2, r.getQty());
            ps.setDouble(3, r.getUnitPrice());
            ps.setDouble(4, r.getTotalPrice());
            ps.setDouble(5, r.getAdvance());
            ps.setDouble(6, r.getDue());
            ps.setDate(7, (Date) r.getOrderDate());
            ps.setDate(8, (Date) r.getDeliveryDate());
            ps.setInt(9, r.getClient().getId());
            ps.setInt(10, r.getCategory().getId());
            ps.setString(11, r.getMeasurement().toString());
            ps.executeUpdate();
            System.out.println("Successfully Saved !");
        } catch (SQLException se) {
            Logger.getLogger(RequisitionDaoImpl.class.getName()).log(Level.SEVERE, null, se);
        }
    }

    @Override
    public void update(Requisition r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Requisition getRequisitionById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

}
