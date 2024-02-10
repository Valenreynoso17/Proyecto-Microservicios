package org.valen.microservicios.cursos.service;

import org.valen.microservicios.cursos.entities.Course;
import org.valen.microservicios.cursos.http.response.StudentByCourseResponse;

import java.util.List;

public interface ICourseService {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    StudentByCourseResponse findStudentsByIdCourse(Long courseId);
}
