package TailorShop.service;

import TailorShop.connection.DBConnection;
import TailorShop.dao.MeasurementDao;
import TailorShop.pojo.Category;
import TailorShop.pojo.Client;
import TailorShop.pojo.Measurement;
import TailorShop.tables.CreateTables;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MeasurementDaoImpl implements MeasurementDao {

    Connection conn = DBConnection.getDBConnection();

    @Override
    public void createTable() {
        CreateTables.measurementTable();
    }

    @Override
    public void save(Measurement m) {
        String sql = "insert into measurement(id, length, width, shoulder, waist, chest, cat_name, client_id) values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, m.getId());
            ps.setDouble(2, m.getLength());
            ps.setDouble(3, m.getWidth());
            ps.setDouble(4, m.getShoulder());
            ps.setDouble(5, m.getWaist());
            ps.setDouble(6, m.getChest());
            ps.setString(7, m.getCategory().getCatName());
            ps.setInt(8, m.getClient().getId());
            ps.executeUpdate();
            System.out.println("Successfully Saved !");
        } catch (SQLException se) {
            Logger.getLogger(MeasurementDaoImpl.class.getName()).log(Level.SEVERE, null, se);
        }
    }

    @Override
    public void update(Measurement m) {
        String sql = "update measurement set length=?, width=?, shoulder=?, waist=?, chest=?, cat_name=? where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDouble(1, m.getLength());
            ps.setDouble(2, m.getWidth());
            ps.setDouble(3, m.getShoulder());
            ps.setDouble(4, m.getWaist());
            ps.setDouble(5, m.getChest());
            ps.setString(6, m.getCategory().getCatName());
            ps.setInt(7, m.getId());
            ps.executeUpdate();
            System.out.println("Successfully Updated !");
        } catch (SQLException se) {
            Logger.getLogger(MeasurementDaoImpl.class.getName()).log(Level.SEVERE, null, se);
        }
    }

    @Override
    public Measurement getMeasurementById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Measurement> getMeasurements() {
        List<Measurement> measurements = new ArrayList();
        Measurement measurement;
        String sql = "select * from measurement";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category category = new Category(rs.getString(7));
                Client client = new Client(rs.getInt(8));
                measurement = new Measurement(rs.getInt(1), rs.getDouble(2), rs.getDouble(3), rs.getDouble(4), rs.getDouble(5), rs.getDouble(6), category, client);
                measurements.add(measurement);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MeasurementDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return measurements;
    }

    @Override
    public Measurement getCatNameByMsId(int id) {
        Measurement measurement = new Measurement();
        String sql = "select * from measurement where id=?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                measurement.setId(rs.getInt(1));
                measurement.setLength(rs.getDouble(2));
                measurement.setWidth(rs.getDouble(3));
                measurement.setShoulder(rs.getDouble(4));
                measurement.setWaist(rs.getDouble(5));
                measurement.setChest(rs.getDouble(6));
                measurement.setCategory(new Category(rs.getString(7)));
                measurement.setClient(new Client(rs.getInt(8)));
            }

        } catch (SQLException ex) {
            Logger.getLogger(MeasurementDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return measurement;
    }

}
