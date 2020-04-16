package kg.demo.service;

import kg.demo.entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAll();
    List<Teacher> getByName(String name);
    Teacher create(Teacher teacher);
    Teacher update(Teacher teacher);
    void deleteById(Long id);

}
