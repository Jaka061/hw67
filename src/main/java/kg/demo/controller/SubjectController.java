package kg.demo.controller;

import kg.demo.entity.Subject;
import kg.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public List<Subject> getAll(){
        return subjectService.getAll();
    }

    @GetMapping("/subject_"+"{subject}")
    public List<Subject> getBySubject(@PathVariable String subject){
        return subjectService.getBySubject(subject);
    }

    @GetMapping("/isPassed_"+"{isPassed}")
    public List<Subject> getByIsPassed(@PathVariable Boolean isPassed){
        return subjectService.getByIsPassed(isPassed);
    }

    @GetMapping("/studentId_"+"{studentId}")
    public List<Subject> getByStudentId(@PathVariable Long studentId){
        return subjectService.getByStudentId(studentId);
    }

    @PostMapping
    public Subject create(@RequestBody Subject subject){
        return subjectService.create(subject);
    }

    @PutMapping
    public Subject update(@RequestBody Subject subject){
        return subjectService.update(subject);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        subjectService.deleteById(id);
    }
}
