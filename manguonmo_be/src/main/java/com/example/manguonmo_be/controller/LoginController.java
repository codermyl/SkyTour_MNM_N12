package com.example.manguonmo_be.controller;


import com.example.manguonmo_be.service.LoginService;
import com.example.manguonmo_be.service.UserService;
import com.example.manguonmo_be.service.dto.UserDTO;
import com.example.manguonmo_be.service.respone.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    LoginService loginService;

    @Autowired
    UserService userService;

    @PostMapping(value = "/login/{username}/{password}")
    public CommonResponse getLogin(@PathVariable("username") String username, @PathVariable("password") String password){
        return userService.getUser(username, password);
    }

    @PostMapping(value = "/dang-ky")
    public CommonResponse dangKy(@RequestBody UserDTO userDTO){
        return loginService.dangKy(userDTO);
    }

}
