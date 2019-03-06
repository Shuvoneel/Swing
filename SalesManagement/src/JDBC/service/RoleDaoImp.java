package JDBC.service;

import JDBC.connection.DBConnection;
import JDBC.dao.RoleDao;
import JDBC.pojo.Role;
import JDBC.view.DatabaseTool;
import com.mysql.jdbc.Util;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            PreparedStatement pstm = DatabaseTool.conn.prepareStatement(sql);
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
        List<Role> list = new ArrayList<>();
        String sql = "select * from role";
        try {
            PreparedStatement ps = DBConnection.getDBConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Role role = new Role(rs.getInt(1), rs.getString(2));
                list.add(role);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoleDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
