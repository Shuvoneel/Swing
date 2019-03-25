package TailorShop.dao;

import TailorShop.pojo.Measurement;
import java.util.List;

public interface MeasurementDao {

    void createTable();

    void save(Measurement m);

    void update(Measurement m);

    Measurement getMeasurementById(int id);

    Measurement getCatNameByMsId(int id);

    List<Measurement> getMeasurements();
}
