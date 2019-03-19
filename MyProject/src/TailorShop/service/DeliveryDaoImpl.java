package TailorShop.service;

import TailorShop.dao.DeliveryDao;
import TailorShop.pojo.Delivery;
import TailorShop.tables.CreateTables;
import java.util.List;

public class DeliveryDaoImpl implements DeliveryDao {

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
    public List<Delivery> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
