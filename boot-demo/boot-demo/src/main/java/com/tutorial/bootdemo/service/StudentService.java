package com.tutorial.bootdemo.service;

import com.tutorial.bootdemo.dto.StudentDTO;

public interface StudentService {

   StudentDTO getStudentById(long id);

   Long addNewStudent(StudentDTO studentDTO);

   void deleteStudentById(long id);

   Object updataStudentById(long id, String name, String email);
}
