package TailorShop.dao;

import TailorShop.pojo.Summary;
import java.util.List;

public interface SummaryDao {

    void createTable();

    void save(Summary s);

    Summary getSummaryById(int id);

    Summary getSummaryByClientId(int id);

    List<Summary> getList();
}
