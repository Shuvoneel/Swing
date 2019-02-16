
package feb_16.swing.service;

import feb_16.swing.domain.Student;
import java.util.List;

public interface CommonDAO {
    void save(Student obj);
    void update(Student obj);
    void delete(Student obj);
    void deleteById(int id);
    Student getById(int id);
    List<Student> findAll();
}
