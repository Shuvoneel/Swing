package JDBC.service;

import JDBC.connection.DBConnection;
import JDBC.dao.UserDao;
import JDBC.pojo.Role;
import JDBC.pojo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDaoImp implements UserDao {

    Connection conn = DBConnection.getDBConnection();

    @Override
    public void createTable() {
        String sql = "create table IF NOT EXISTS user(id int(11) auto_increment primary key, full_name varchar(30), user_name varchar(30) unique, password varchar(30), mobile varchar(15), role_id int(5), foreign key (role_id) references role(id))";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("Table Created");
        } catch (Exception e) {
            Logger.getLogger(UserDaoImp.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void save(User user) {
        String sql = "insert into user(full_name, user_name, password, mobile, role_id) values(?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, user.getFullname());
            pstm.setString(2, user.getUsername());
            pstm.setString(3, user.getPassword());
            pstm.setString(4, user.getMobile());
            pstm.setInt(5, user.getRole().getId());
            pstm.executeUpdate();
            System.out.println("Data Saved");
        } catch (Exception e) {
            Logger.getLogger(UserDaoImp.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void update(User user) {
        String sql = "update user set full_name=?, user_name=?, password=?, mobile=?, role_id=? where id=?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, user.getFullname());
            pstm.setString(2, user.getUsername());
            pstm.setString(3, user.getPassword());
            pstm.setString(4, user.getMobile());
            pstm.setInt(5, user.getRole().getId());
            pstm.setInt(6, user.getId());
            pstm.executeUpdate();
            System.out.println("Data Updated");
        } catch (Exception e) {
            Logger.getLogger(UserDaoImp.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public User getUserByID(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public User getUserByUserName(String username) {
        User user = new User();
        String sql = "select * from user where user_name=?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, username);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                user.setId(rs.getInt(1));
                user.setFullname(rs.getString(2));
                user.setUsername(rs.getString(3));
                user.setPassword(rs.getString(4));
                user.setMobile(rs.getString(5));
                user.setRole(new Role(rs.getInt(6)));
            }
        } catch (Exception e) {
            Logger.getLogger(UserDaoImp.class.getName()).log(Level.SEVERE, null, e);
        }
        return user;
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();

        String sql = "select * from user";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Role role = new Role(rs.getInt(6));
                User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), role);
                users.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }
}
