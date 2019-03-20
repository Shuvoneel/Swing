package SalesManagement.daoImpl;

import SalesManagement.connection.CustomDBConnection;
import SalesManagement.dao.LoginDao;
import SalesManagement.pojo.Role;
import SalesManagement.pojo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginDaoImpl implements LoginDao {

    Connection conn = CustomDBConnection.getDBConnection();

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        User user = null;
        String sql = "select * from user where user_name=? and password=?";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);          
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), new Role(rs.getInt(6)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

}
