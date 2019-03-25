package TailorShop.service;

import TailorShop.dao.VoucherDao;
import TailorShop.pojo.Voucher;
import TailorShop.tables.CreateTables;
import java.util.List;

public class VoucherDaoImpl implements VoucherDao {

    @Override
    public void createTable() {
        CreateTables.voucherTable();
    }

    @Override
    public void save(Voucher v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Voucher v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Voucher getVoucherById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Voucher> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
