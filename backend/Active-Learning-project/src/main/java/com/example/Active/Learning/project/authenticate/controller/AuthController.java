package com.example.Active.Learning.project.authenticate.controller;


import com.example.Active.Learning.project.authenticate.payload.request.AuthRequest;
import com.example.Active.Learning.project.account.payload.request.SignUpRequest;
import com.example.Active.Learning.project.account.service.UserServiceImpl;
import com.example.Active.Learning.project.authenticate.services.AuthenticationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @Autowired
    private AuthenticationServiceImpl authenticationService;

    @PostMapping("/authenticate")
    public ResponseEntity<?> authenticate(@RequestBody AuthRequest authRequest) {
        return authenticationService.authenticate(authRequest);
    }
}