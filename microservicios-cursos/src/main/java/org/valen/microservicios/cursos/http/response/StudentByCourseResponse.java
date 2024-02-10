package org.valen.microservicios.cursos.http.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.valen.microservicios.cursos.dto.StudentDTO;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentByCourseResponse {
    private String courseName;
    private String teacher;
    private List<StudentDTO> studentList;
}
