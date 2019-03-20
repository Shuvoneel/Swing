package TailorShop.service;

import TailorShop.connection.DBConnection;
import TailorShop.dao.CategoryDao;
import TailorShop.pojo.Category;
import TailorShop.pojo.Client;
import TailorShop.tables.CreateTables;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CategoryDaoImpl implements CategoryDao {

    Connection conn = DBConnection.getDBConnection();

    @Override
    public void createTable() {
        CreateTables.categoryTable();
    }

    @Override
    public void save(Category category) {
        String sql = "insert into category(id, cat_name) values(?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, category.getId());
            ps.setString(2, category.getCatName());
            ps.executeUpdate();
            System.out.println("Successfully Inserted !");
        } catch (SQLException se) {
            Logger.getLogger(CategoryDaoImpl.class.getName()).log(Level.SEVERE, null, se);
        }
    }

    @Override
    public void update(Category category) {
        String sql = "update category set cat_name=? where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, category.getCatName());
            ps.setInt(2, category.getId());
            ps.executeUpdate();
            System.out.println("Successfully Updated !");
        } catch (SQLException se) {
            Logger.getLogger(CategoryDaoImpl.class.getName()).log(Level.SEVERE, null, se);
        }
    }

    @Override
    public Category getCategoryById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Category getCategoryByCatName(String catName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Category> getCategorys() {
        List<Category> categorys = new ArrayList();
        Category category;
        String sql = "select * from category";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                category = new Category(rs.getInt(1), rs.getString(2));
                categorys.add(category);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return categorys;
    }

}
