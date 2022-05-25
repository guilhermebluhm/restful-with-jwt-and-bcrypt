package br.userauthjwt.authjwt.service.impl;

import br.userauthjwt.authjwt.misc.passwordEncrypt;
import br.userauthjwt.authjwt.model.dto.studentDto;
import br.userauthjwt.authjwt.model.student;
import br.userauthjwt.authjwt.repository.studentRepository;
import br.userauthjwt.authjwt.service.exception.studentNotFound;
import br.userauthjwt.authjwt.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentImpl implements studentService {

    @Autowired
    private studentRepository repository;

    @Autowired
    private passwordEncrypt encrypt;

    @Override
    public List<studentDto> getAll() {
        return studentDto.castListToStudentDto(this.repository.findAll());
    }

    @Override
    public student saveNewStudent(student std) {
        std.setPassword(this.encrypt.passwordEncoder().encode(std.getPassword()));
        return this.repository.save(std);
    }

    @Override
    public studentDto findStudent(int id) {
        return studentDto.castStudentToDto(this.repository.findById(id).orElseThrow(() -> new studentNotFound("erro")));
    }
    @Override
    public boolean validateEncryptRawPassword(int id, String passwd) {
        return this.encrypt.passwordEncoder().matches(passwd,this.findStudent(id).getPassword());
    }
}
