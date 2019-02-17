
package form.service;

import form.domain.Student;


public class TestService {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setName("Shawon");
        
        StudentDAO commonDAO = new StudentService();
        commonDAO.add(std1);
    }
}
