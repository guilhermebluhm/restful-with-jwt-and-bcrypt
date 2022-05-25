package br.userauthjwt.authjwt.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class StudentNotFoundHandler {

    @ExceptionHandler(studentNotFound.class)
    public ResponseEntity<studentNotFoundFields> studentNotFoundError(studentNotFound e,
                                                                      HttpServletRequest req){
        studentNotFoundFields err = new studentNotFoundFields(
                System.currentTimeMillis(),
                HttpStatus.BAD_REQUEST.value(),
                e.getMessage(),
                req.getPathInfo());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
    }

}
