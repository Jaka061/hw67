package kg.demo.controller;


import kg.demo.entity.Teacher;
import kg.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public List<Teacher> getAll(){
        return teacherService.getAll();
    }

    @GetMapping("/{name}")
    public List<Teacher> getByName(@PathVariable String name){
        return teacherService.getByName(name);
    }


    @PostMapping
    public Teacher create(@RequestBody Teacher teacher){
        return teacherService.create(teacher);
    }

    @PutMapping
    public Teacher update(@RequestBody Teacher teacher){
        return teacherService.update(teacher);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        teacherService.deleteById(id);
    }

}
