
package feb_16.swing.service;

import feb_16.swing.domain.Student;

public class TestService {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setName("Shawon");
        
        CommonDAO commonDAO = new StudentService();
        commonDAO.save(std1);
    }
}
