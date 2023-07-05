package com.example.secureloginapi.service;

import com.example.secureloginapi.payload.StudentDTO;

import java.util.List;

public interface StudentService {
    StudentDTO createStudent(StudentDTO studentDTO);

    StudentDTO getStudentById(Long id);

    StudentDTO updateStudent(Long id, StudentDTO studentDTO);

    void deleteStudent(Long id);

    List<StudentDTO> getAllStudents();
}
