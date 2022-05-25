package br.userauthjwt.authjwt.service;

import br.userauthjwt.authjwt.model.dto.studentDto;
import br.userauthjwt.authjwt.model.student;

import java.util.List;

public interface studentService {

    List<studentDto> getAll();
    student saveNewStudent(student std);
    studentDto findStudent(int id);
    boolean validateEncryptRawPassword(int id, String passwd);
}
