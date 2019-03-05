package JDBC.service;

import JDBC.connection.DBConnection;
import JDBC.dao.RoleDao;
import JDBC.pojo.Role;
import JDBC.view.DatabaseTool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class RoleDaoImp implements RoleDao {



    @Override
    public void createTable(String sql) {
//        String sql = "create table IF NOT EXISTS role(id int(2) auto_increment primary key, role_name varchar(20) not null unique)";
        try {
            PreparedStatement pstm = DatabaseTool.conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("Table Created");
        } catch (Exception e) {
        }
    }

    @Override
    public void save(Role role) {
        String sql = "insert into role(role_name) values(?)";
        try {
            PreparedStatement pstm = DatabaseTool.conn.prepareCall(sql);
            pstm.setString(1, role.getRoleName());
            pstm.execute();
            System.out.println("Data Inserted");
        } catch (Exception e) {
        }
    }

    public void update(Role role) {
    }

    @Override
    public Role getRoleByID(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Role getRoleByRoleName(String roleName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(int id) {
    }

    @Override
    public List<Role> getRoles() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
