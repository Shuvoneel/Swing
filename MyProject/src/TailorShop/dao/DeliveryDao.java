package TailorShop.dao;

import TailorShop.pojo.Delivery;
import java.util.List;

public interface DeliveryDao {

    void createTable();

    void save(Delivery d);

    Delivery getDeliveryById(int id);

    void delete(int id);

    List<Delivery> getDeliverys();
}
