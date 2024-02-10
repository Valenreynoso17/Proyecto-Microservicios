package org.valen.microservicios.cursos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.valen.microservicios.cursos.client.StudentClient;
import org.valen.microservicios.cursos.dto.StudentDTO;
import org.valen.microservicios.cursos.entities.Course;
import org.valen.microservicios.cursos.http.response.StudentByCourseResponse;
import org.valen.microservicios.cursos.persistence.CourseRepository;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    private StudentClient studentClient;

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public StudentByCourseResponse findStudentsByIdCourse(Long courseId) {

        // Search for course
        Course course = courseRepository.findById(courseId).orElse(new Course());

        // Get students
        List<StudentDTO> studentDTOList = studentClient.findAllStudentsByCourse(courseId);

        return StudentByCourseResponse
                                    .builder()
                                    .courseName(course.getName())
                                    .teacher(course.getTeacher())
                                    .studentList(studentDTOList)
                                    .build();
    }
}
