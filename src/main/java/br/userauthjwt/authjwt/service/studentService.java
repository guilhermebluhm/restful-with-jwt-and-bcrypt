package br.userauthjwt.authjwt.service;

import br.userauthjwt.authjwt.model.student;

import java.util.List;

public interface studentService {

    List<student> getAll();
    student saveNewStudent(student std);
    student findStudent(int id);
    boolean validateEncryptRawPassword(int id, String passwd);
}
