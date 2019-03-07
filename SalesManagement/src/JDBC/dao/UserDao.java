package JDBC.dao;

import JDBC.pojo.Role;
import JDBC.pojo.User;
import java.util.List;

public interface UserDao {

    void createTable();

    void save(User user);

    void update(User user);

    User getUserByID(int id);

    User getUserByUserName(String username);

    void delete(int id);

    List<User> getUsers();
}
