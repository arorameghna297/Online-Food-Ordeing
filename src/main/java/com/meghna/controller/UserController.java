package com.meghna.controller;

import jdk.jshell.spi.ExecutionControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.meghna.model.User;
import com.meghna.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/profile")
    public ResponseEntity<User> getUserProfileHandler(@RequestHeader("Authorization") String jwt) throws ExecutionControl.UserException, Exception {

        User user = userService.findUserProfileByJwt(jwt);
        user.setPassword(null);

        return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
    }

}
