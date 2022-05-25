package br.userauthjwt.authjwt.model.dto;

import br.userauthjwt.authjwt.model.student;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class studentDto {

    private String email;
    private String password;

    public studentDto(){}

    public studentDto(student std){
        this.setEmail(std.getEmail());
        this.setPassword(std.getPassword());
    }

    public static studentDto castStudentToDto(student std){
        return new studentDto(std);
    }

    public static List<studentDto> castListToStudentDto(List<student> std){
        return std.stream().map(studentDto::new).collect(Collectors.toList());
    }
}
