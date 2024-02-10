package org.valen.microservicios.estudiantes.service;

import org.valen.microservicios.estudiantes.entities.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAll();

    Student findById(Long id);

    void save(Student student);

    List<Student> findAllByCourseId(Long courseId);
}
