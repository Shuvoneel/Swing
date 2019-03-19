package TailorShop.service;

import TailorShop.connection.DBConnection;
import TailorShop.dao.ClientDao;
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
    public void update(Client c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Client getClientById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Client getClientByMobile(int mobile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Client getClientByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
