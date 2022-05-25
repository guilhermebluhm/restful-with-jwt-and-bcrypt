package br.userauthjwt.authjwt.misc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class passwordEncrypt {

    @Bean
    public PasswordEncoder passwordEncoder(){
        BCryptPasswordEncoder encrd = new BCryptPasswordEncoder();
        return encrd;
    }

}
