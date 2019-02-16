package feb_16.swing.createtable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import feb_16.swing.connection.MySqlConnection;

public class StudentTable {

    static Connection con = MySqlConnection.getDbConnection();

    public static void createStudentTable() {
        String sql = "create table student(id int(11) primary key auto_increment, name varchar(50) not null)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("Student Table Cretaed");
        } catch (SQLException ex) {
            Logger.getLogger(StudentTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
