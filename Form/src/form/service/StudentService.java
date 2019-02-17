package form.service;

import form.connection.SqlConnection;
import form.domain.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentService implements StudentDAO {
    
    static Connection con = SqlConnection.getDbConnection();
    
    @Override
    public void add(Student obj) {
        String sql = "insert into student (name, age, email, gender, course, round, message) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, obj.getName());
            ps.setInt(2, obj.getAge());
            ps.setString(3, obj.getEmail());
            ps.setString(4, obj.getGender());
            ps.setString(5, obj.getCourse());
            ps.setString(6, obj.getRound());
            ps.setString(7, obj.getMessage());
            ps.executeUpdate();
            System.out.println("Data Inserted Successfully");
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void update(Student obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void clear(Student obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void deleteById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Student getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<Student> findAll() {
        List<Student> list = new ArrayList<>();
        Student student;
        
        String sql = "select * from student";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setAge(rs.getInt(3));
                student.setEmail(rs.getString(4));
                student.setGender(rs.getString(5));
                student.setCourse(rs.getString(6));
                student.setRound(rs.getString(7));
                student.setMessage(rs.getString(8));
                
                list.add(student);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
        
    }
    
}
