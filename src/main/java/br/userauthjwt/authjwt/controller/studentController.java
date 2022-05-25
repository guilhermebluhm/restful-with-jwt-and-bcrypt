package br.userauthjwt.authjwt.controller;

import br.userauthjwt.authjwt.model.student;
import br.userauthjwt.authjwt.service.impl.studentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/")
public class studentController {

    @Autowired
    private studentImpl impl;

    @GetMapping("listar")
    @ResponseStatus(HttpStatus.OK)
    public List<student> getAll(){
        return this.impl.getAll();
    }

    @GetMapping("listar/{id}")
    @ResponseStatus(HttpStatus.OK)
    public student getStudent(@PathVariable("id") int id){
        return this.impl.findStudent(id);
    }

    @PostMapping("criar")
    @ResponseStatus(HttpStatus.CREATED)
    public student saveStudent(@RequestBody student std){
        return this.impl.saveNewStudent(std);
    }

}
