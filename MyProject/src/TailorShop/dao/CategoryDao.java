package TailorShop.dao;

import TailorShop.pojo.Category;
import java.util.List;

public interface CategoryDao {

    void createTable();

    void save(Category c);

    Category getCategoryById(int id);

    Category getCategoryByName(String name);

    void delete(int id);

    List<Category> getList();
}
