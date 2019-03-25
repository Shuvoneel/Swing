package TailorShop.dao;

import TailorShop.pojo.Voucher;
import java.util.List;

public interface VoucherDao {

    void createTable();

    void save(Voucher v);

    void update(Voucher v);

    Voucher getVoucherById(int id);

    void delete(int id);

    List<Voucher> getList();
}
