package kg.demo.service;

import kg.demo.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    Student getById(Long id);
    Student create(Student student);
    Student update(Student student);
    void deleteById(Long id);

}
