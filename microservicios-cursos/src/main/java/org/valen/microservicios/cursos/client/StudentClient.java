package org.valen.microservicios.cursos.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.valen.microservicios.cursos.dto.StudentDTO;

import java.util.List;

@FeignClient(name = "ms-students", url = "localhost:8080/api/student")
public interface StudentClient {

    @GetMapping("search-by-course/{courseId}")
    List<StudentDTO> findAllStudentsByCourse(@PathVariable Long courseId);
}
