package com.gigin.giginassignment.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class AuthenticationService {
public ResponseEntity authenticateLogin(String emailId , String password){
try {
    if ("emailID@gigin.ai".equals(emailId) && "ad$66dj999".equals(password)) {
        return ResponseEntity.ok("login Successfull");
    } else {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
    }
}
catch (Exception exception){
    exception.printStackTrace();
}
return ResponseEntity.internalServerError().body("Something went wrong");
}
}
