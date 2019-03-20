package TailorShop.dao;

import TailorShop.pojo.Category;
import java.util.List;

public interface CategoryDao {

    void createTable();

    void save(Category category);

    void update(Category category);

    Category getCategoryById(int id);

    Category getCategoryByCatName(String catName);

    void delete(int id);

    List<Category> getCategorys();
}
