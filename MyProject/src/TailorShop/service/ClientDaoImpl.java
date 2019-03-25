package TailorShop.service;

import TailorShop.connection.DBConnection;
import TailorShop.dao.ClientDao;
import TailorShop.pojo.Category;
import TailorShop.pojo.Client;
import TailorShop.tables.CreateTables;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientDaoImpl implements ClientDao {

    Connection conn = DBConnection.getDBConnection();

    @Override
    public void createTable() {
        CreateTables.clientTable();
    }

    @Override
    public void save(Client client) {
        String sql = "insert into client(id, name, mobile, email, address) values(?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, client.getId());
            ps.setString(2, client.getName());
            ps.setInt(3, client.getMobile());
            ps.setString(4, client.getEmail());
            ps.setString(5, client.getAddress());
            ps.executeUpdate();
            System.out.println("Successfully Registered !");
        } catch (SQLException se) {
            Logger.getLogger(ClientDaoImpl.class.getName()).log(Level.SEVERE, null, se);
        }
    }

    @Override
    public void update(Client client) {
        String sql = "update client set name=?, mobile=?, email=?, address=? where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, client.getName());
            ps.setInt(2, client.getMobile());
            ps.setString(3, client.getEmail());
            ps.setString(4, client.getAddress());
            ps.setInt(5, client.getId());
            ps.executeUpdate();
            System.out.println("Successfully Updated !");
        } catch (SQLException se) {
            Logger.getLogger(ClientDaoImpl.class.getName()).log(Level.SEVERE, null, se);
        }
    }

    @Override
    public Client getClientById(int id) {
        Client client = new Client();
        String sql = "select * from client where id=?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                client.setId(rs.getInt(1));
                client.setName(rs.getString(2));
                client.setMobile(rs.getInt(3));
                client.setEmail(rs.getString(4));
                client.setAddress(rs.getString(5));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClientDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return client;
    }

    @Override
    public Client getClientByMobile(int mobile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Client getClientByName(String name) {
        Client client = new Client();
        String sql = "select * from client where name=?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, name);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                client.setId(rs.getInt(1));
                client.setName(rs.getString(2));
                client.setMobile(rs.getInt(3));
                client.setEmail(rs.getString(4));
                client.setAddress(rs.getString(5));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClientDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return client;
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Client> getClients() {
        List<Client> clients = new ArrayList();
        Client client;
        String sql = "select * from client";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                client = new Client(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));
                clients.add(client);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clients;
    }

}
