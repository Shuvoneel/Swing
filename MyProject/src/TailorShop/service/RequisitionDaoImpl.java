package TailorShop.service;

import java.util.List;
import TailorShop.dao.RequisitionDao;
import TailorShop.pojo.Requisition;
import TailorShop.tables.CreateTables;

public class RequisitionDaoImpl implements RequisitionDao {

    @Override
    public void createTable() {
        CreateTables.requisitionTable();
    }

    @Override
    public void save(Requisition r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public List<Requisition> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
