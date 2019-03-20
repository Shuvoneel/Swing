package SalesManagement.dao;

import SalesManagement.pojo.Role;
import SalesManagement.pojo.User;
import java.util.List;

public interface UserDao {

    void createTable();

    void save(User user);

    void update(User user);

    User getUserById(int id);

    User getUserByUsername(String username);

    void delete(int id);

    List<User> getUsers();

}
