package br.userauthjwt.authjwt.config;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class authRequest {

    @Column(nullable = false, length = 50)
    private String email;
    @Column(nullable = false, length = 50)
    private String password;

}
