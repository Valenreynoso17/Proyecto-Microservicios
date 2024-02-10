package org.valen.microservicios.cursos.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.valen.microservicios.cursos.entities.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

}
