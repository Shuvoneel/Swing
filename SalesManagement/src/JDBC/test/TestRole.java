package JDBC.test;

import JDBC.dao.RoleDao;
import JDBC.pojo.Role;
import JDBC.service.RoleDaoImp;

public class TestRole {

    public static void main(String[] args) {
        RoleDaoImp roledao = new RoleDaoImp();
        String sql = "create table IF NOT EXISTS role(id int(2) auto_increment primary key, role_name varchar(20) not null unique)";
        roledao.createTable(sql);

        Role role1 = new Role();
        role1.setRoleName("admin");
        RoleDao commonDao = new RoleDaoImp();
        commonDao.save(role1);
    }
}
