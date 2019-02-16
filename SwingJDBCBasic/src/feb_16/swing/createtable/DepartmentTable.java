
package feb_16.swing.createtable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import feb_16.swing.connection.MySqlConnection;

public class DepartmentTable {
    static Connection con = MySqlConnection.getDbConnection();
    public static void createDeptTable(){
        String sql = "create table department(id int(11) primary key, dept_name varchar(55) not null)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("Department Table Created");
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
