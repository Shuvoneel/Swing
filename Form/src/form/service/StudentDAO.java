package form.service;

import form.domain.Student;
import java.util.List;

public interface StudentDAO {

    void add(Student obj);

    void update(Student obj);

    void clear(Student obj);

    void deleteById(int id);

    Student getById(int id);

    List<Student> findAll();
}
