package br.userauthjwt.authjwt.controller;

import br.userauthjwt.authjwt.config.authRequest;
import br.userauthjwt.authjwt.config.authResponse;
import br.userauthjwt.authjwt.misc.managerAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth/")
public class authApi {

    @Autowired
    private managerAuthentication manager;

    @PostMapping("login")
    @ResponseStatus(HttpStatus.OK)
    public authResponse signIn(@RequestBody authRequest req){
        return this.manager.authUser(req);
    }

}
