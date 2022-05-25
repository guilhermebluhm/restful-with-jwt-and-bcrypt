package br.userauthjwt.authjwt.misc;

import br.userauthjwt.authjwt.config.authRequest;
import br.userauthjwt.authjwt.config.authResponse;
import br.userauthjwt.authjwt.model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class managerAuthentication {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private generateTokenJwt tkn;

    public authResponse authUser(authRequest auth){
        Authentication authenticate = this.manager.authenticate(
                new UsernamePasswordAuthenticationToken(
                auth.getEmail(),
                auth.getPassword()));
        student std = (student) authenticate.getPrincipal();
        String token = this.tkn.getTokenJwt(std);
        return new authResponse(std.getEmail(),token);
    }

}
