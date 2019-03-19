
package TailorShop.service;

import TailorShop.dao.MeasurementDao;
import TailorShop.pojo.Measurement;
import TailorShop.tables.CreateTables;
import java.util.List;

public class MeasurementDaoImpl implements MeasurementDao{

    @Override
    public void createTable() {
        CreateTables.measurementTable();
    }

    @Override
    public void save(Measurement m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Measurement m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Measurement getMeasurementByClientId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Measurement getMeasurementByOrderId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Measurement> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
