package TailorShop.service;

import TailorShop.connection.DBConnection;
import TailorShop.dao.ClientDetailsDao;
import TailorShop.pojo.ClientDetails;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientDetailsDaoImpl implements ClientDetailsDao {

    Connection conn = DBConnection.getDBConnection();

    @Override
    public List<ClientDetails> getClientDetailsByMobile(int mobile) {
        List<ClientDetails> details = new ArrayList<>();
        String sql = "select * from client_view where mobile=?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, mobile);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                ClientDetails clientDetails = new ClientDetails(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getDate(7));
                details.add(clientDetails);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClientDetailsDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return details;
    }

    @Override
    public List<ClientDetails> getClientDetailsByEmail(String email) {
        List<ClientDetails> details = new ArrayList<>();
        String sql = "select * from client_view where email=?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, email);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                ClientDetails clientDetails = new ClientDetails(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getDate(7));
                details.add(clientDetails);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClientDetailsDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return details;
    }

    @Override
    public List<ClientDetails> getDetails() {
        List<ClientDetails> details = new ArrayList();
        String sql = "select * from client_view";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                ClientDetails clientDetails = new ClientDetails(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getDate(7));
                details.add(clientDetails);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientDetailsDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return details;
    }

}
