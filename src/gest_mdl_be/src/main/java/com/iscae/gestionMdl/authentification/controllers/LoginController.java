package com.iscae.gestionMdl.authentification.controllers;

import com.iscae.gestionMdl.authentification.dtos.LoginDto;
import com.iscae.gestionMdl.authentification.dtos.LoginRespDto;
import com.iscae.gestionMdl.authentification.services.LoginService;
import org.springframework.web.bind.annotation.*;

/**
 * @author Abderrahmane
 */
@RestController
@RequestMapping("login")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public LoginRespDto logIn(@RequestBody LoginDto loginDto) {
        return loginService.logIn();
    }

}
