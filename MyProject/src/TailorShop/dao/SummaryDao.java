package TailorShop.dao;

import TailorShop.pojo.Summary;
import java.util.Date;
import java.util.List;

public interface SummaryDao {

    void createTable();

    void save(Summary s);

    void update(Summary s);

    Summary getSummaryById(int id);

    List<Summary> getList();
}
