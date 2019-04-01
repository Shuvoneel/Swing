package TailorShop.service;

import TailorShop.connection.DBConnection;
import TailorShop.dao.DeliveryDao;
import TailorShop.pojo.Delivery;
import TailorShop.tables.CreateTables;
import java.sql.Connection;
import java.util.List;

public class DeliveryDaoImpl implements DeliveryDao {
    Connection conn = DBConnection.getDBConnection();

    @Override
    public void createTable() {
        CreateTables.deliveryTable();
    }

    @Override
    public void save(Delivery d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Delivery getDeliveryById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Delivery> getDeliverys() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
