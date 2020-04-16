package kg.demo.service;

import kg.demo.entity.Subject;
import kg.demo.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public List<Subject> getAll() {
        return subjectRepository.findAll();
    }

    @Override
    public List<Subject> getBySubject(String subject) {
        List<Subject> list = subjectRepository.findAll().stream().filter(x -> x.getSubject().equals(subject)).collect(Collectors.toList());
        return list;
    }

    @Override
    public List<Subject> getByIsPassed(Boolean isPassed) {
        List<Subject> list = subjectRepository.findAll().stream().filter(x -> x.getIsPassed()).collect(Collectors.toList());
        return list;
    }

    @Override
    public List<Subject> getByStudentId(Long id) {
        List<Subject> list = subjectRepository.findAll().stream().filter(x -> x.getStudent().getId().equals(id)).collect(Collectors.toList());
        return list;
    }

    @Override
    public Subject create(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public Subject update(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public void deleteById(Long id) {
        subjectRepository.deleteById(id);
    }
}
