package JDBC.dao;

import JDBC.pojo.Role;
import java.util.List;

public interface RoleDao {

    void createTable(String sql);

    void save(Role role);

    void update(Role role);

    Role getRoleByID(int id);

    Role getRoleByRoleName(String roleName);

    void delete(int id);

    List<Role> getRoles();
}
