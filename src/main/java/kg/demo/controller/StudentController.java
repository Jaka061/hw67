package kg.demo.controller;

import kg.demo.entity.Student;
import kg.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAll (){
        return studentService.getAll();
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable Long id){  //переменные пути
        return studentService.getById(id);
    }
    @PostMapping
    public Student create(@RequestBody Student animals){
        return studentService.create(animals);
    }
    @PutMapping
    public Student update(@RequestBody Student animals){
        return studentService.create(animals);
    }
    @DeleteMapping("/{id}")
    public void deleteById (@PathVariable Long id){
        studentService.deleteById(id);
    }

}
