package org.valen.microservicios.estudiantes.controller;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.valen.microservicios.estudiantes.entities.Student;
import org.valen.microservicios.estudiantes.service.IStudentService;

import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student) {
        studentService.save(student);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> findAll() {
        return ResponseEntity.ok(studentService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Student> findById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.findById(id));
    }

    @GetMapping("search-by-course/{courseId}")
    public ResponseEntity<List<Student>> findAllByCourseId(@PathVariable Long courseId) {
        return ResponseEntity.ok(studentService.findAllByCourseId(courseId));
    }
}
