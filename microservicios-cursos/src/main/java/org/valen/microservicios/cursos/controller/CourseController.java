package org.valen.microservicios.cursos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.valen.microservicios.cursos.entities.Course;
import org.valen.microservicios.cursos.http.response.StudentByCourseResponse;
import org.valen.microservicios.cursos.service.ICourseService;

import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private ICourseService courseService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCourse(@RequestBody Course course) {
        courseService.save(course);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Course>> findAll() {
        return ResponseEntity.ok(courseService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<Course> findById(@PathVariable Long id) {
        return ResponseEntity.ok(courseService.findById(id));
    }
    @GetMapping("/search-students/{courseId}")
    public ResponseEntity<StudentByCourseResponse> findStudentsByIdCourse(@PathVariable Long courseId) {
        return ResponseEntity.ok(courseService.findStudentsByIdCourse(courseId));
    }
}
