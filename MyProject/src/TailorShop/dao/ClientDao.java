package TailorShop.dao;

import TailorShop.pojo.Client;
import java.util.List;

public interface ClientDao {

    void createTable();

    void save(Client client);

    void update(Client client);

    Client getClientById(int id);

    Client getClientByMobile(int mobile);

    Client getClientByName(String name);

    void delete(int id);

    List<Client> getClients();
}
