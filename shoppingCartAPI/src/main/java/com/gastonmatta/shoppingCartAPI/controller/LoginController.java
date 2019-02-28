package com.gastonmatta.shoppingCartAPI.controller;

import com.gastonmatta.shoppingCartAPI.domain.LoginData;
import com.gastonmatta.shoppingCartAPI.domain.User;
import com.gastonmatta.shoppingCartAPI.service.UserLoginImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private UserLoginImpl service;

    @PostMapping("/loginUser")
    @ResponseBody
    User loginUser(@RequestBody LoginData loginData){
        service.userLogin(loginData.getUsername(), loginData.getPassword());
        return service.getActualLogedUser();
    }
}
