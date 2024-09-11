package com.learning.first;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students/{student-id}") //get student by id
    public Student findStudentByid( @PathVariable("student-id") Integer id ){
        return studentRepository.findById(
            id
        ).orElse(new Student());
    }

    @GetMapping("/students") //get student by id
    public List<Student> findallstudent() {
        return studentRepository.findAll();
    }

    @GetMapping("/students/search/{student-name}") //get student by id
    public List<Student> findStudentsByName(@PathVariable("student-name") String name ) {
        return studentRepository.findAllByFirstNameContaining(name);
    }

    @PostMapping("/post")
    public Student post( @RequestBody Student student){
       return studentRepository.save(student);
   }

   @DeleteMapping("students/{student-id}")
   @ResponseStatus(HttpStatus.OK)
    public void deleteStudent(@PathVariable("student-id") Integer id){
        studentRepository.deleteById(id);
    }

}
