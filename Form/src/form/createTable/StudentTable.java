package form.createTable;

import form.connection.SqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentTable {

    static Connection con = SqlConnection.getDbConnection();

    public static void createStudentTable() {
        String sql = "create table student(id int(7) primary key auto_increment not null, name varchar(50) not null, age int(5), email varchar(50), gender varchar(7) not null, course varchar(50), round varchar(50) not null, message varchar(50))";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("Student Table Cretaed");
        } catch (SQLException ex) {
            Logger.getLogger(StudentTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
