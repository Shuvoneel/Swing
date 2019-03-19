package TailorShop.service;

import TailorShop.dao.SummaryDao;
import TailorShop.pojo.Summary;
import TailorShop.tables.CreateTables;
import java.util.List;

public class SummaryDaoImpl implements SummaryDao {

    @Override
    public void createTable() {
        CreateTables.summaryTable();
    }

    @Override
    public void save(Summary s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Summary getSummaryById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Summary getSummaryByClientId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Summary> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
