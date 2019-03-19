package TailorShop.dao;

import TailorShop.pojo.Role;
import java.util.List;

public interface RoleDao {

    void createTable();

    void save(Role r);

    void update(Role r);

    Role getRoleById(int id);

    Role getRoleByRoleName(String name);

    void delete(int id);

    List<Role> getList();
}
