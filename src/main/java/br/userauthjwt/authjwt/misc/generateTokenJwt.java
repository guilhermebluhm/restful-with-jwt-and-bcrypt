package br.userauthjwt.authjwt.misc;

import br.userauthjwt.authjwt.model.student;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class generateTokenJwt {

    private final long EXPIRE_TOKEN = 24 * 60 * 60 * 1000; //24 horas
    @Value("${app.jwt.secret}")
    private String secret_key;

    public String getTokenJwt(student std){
        return Jwts.builder()
                .setSubject(std.getId() + " , " + std.getEmail())
                .setIssuer("teste unifor jwt token")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE_TOKEN))
                .signWith(SignatureAlgorithm.HS512,secret_key).compact();
    }

}
