package SalesManagement.dao;

import SalesManagement.pojo.Role;
import SalesManagement.pojo.User;

public interface LoginDao {

    User findByUsernameAndPassword(String username, String password);
}
