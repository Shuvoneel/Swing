package TailorShop.dao;

import TailorShop.pojo.Requisition;
import java.util.List;

public interface RequisitionDao {

    void createTable();

    void save(Requisition r);

    void update(Requisition r);

    Requisition getRequisitionById(int id);

    Requisition getRequisitionByClientMobile(int mobile);

    void delete(int id);

    List<Requisition> getRequisitions();

    public int getLastRow();
}
