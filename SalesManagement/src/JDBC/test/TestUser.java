
package JDBC.test;

import JDBC.service.UserDaoImp;

public class TestUser {
    public static void main(String[] args) {
        UserDaoImp userDao = new UserDaoImp();
        userDao.createTable();
    }
   
}
