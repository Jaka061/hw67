package kg.demo.service;

import kg.demo.entity.Subject;
import kg.demo.entity.Teacher;
import kg.demo.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;
    @Override
    public List<Teacher> getAll() {
        return teacherRepository.findAll();
    }

    @Override
    public List<Teacher> getByName(String name) {
        List<Teacher> list = teacherRepository.findAll().stream().filter(x -> x.getName().equals(name)).collect(Collectors.toList());
        return list;
    }

    @Override
    public Teacher create(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher update(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public void deleteById(Long id) {
       teacherRepository.deleteById(id);
    }
}
