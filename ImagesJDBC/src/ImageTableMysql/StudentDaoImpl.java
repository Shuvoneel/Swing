package ImageTableMysql;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentDaoImpl implements StudentDao {

    static Connection conn = DbConnection.getConnection();

    public static void main(String[] args) {
        createTable();
    }

    public static void createTable() {
        //  String sql = "create table student(id int(11) auto_increment primary key, name varchar(50) not null, photo BLOB not null, file_path varchar(155), file_name varchar(155)";
        String sql = "CREATE TABLE student (id int(7) auto_increment primary key, name varchar(50) NOT NULL , photo BLOB)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(Student student, File file) {
        FileInputStream inputStream = null;

        String sql = "insert into student(name, photo) values(?,?)";
        try {
            inputStream = new FileInputStream(file);

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, student.getName());
            ps.setBinaryStream(2, (InputStream) inputStream, (Long) (file.length()));

            ps.executeUpdate();
            System.out.println("Insert success");
        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Student> getList() {
        List<Student> list = new ArrayList();
        String sql = "select * from student";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student student = new Student(rs.getInt(1), rs.getString(2), rs.getBytes("photo"));
                list.add(student);
            }
            System.out.println("Insert success");
        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
