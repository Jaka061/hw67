package kg.demo.service;

import kg.demo.entity.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> getAll();
    List<Subject> getBySubject(String subject);
    List<Subject> getByIsPassed(Boolean isPassed);
    List<Subject> getByStudentId(Long id);
    Subject create(Subject subject);
    Subject update(Subject subject);
    void deleteById(Long id);
}
