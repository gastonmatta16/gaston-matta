package com.gastonmatta.shoppingCartAPI.service;

import com.gastonmatta.shoppingCartAPI.domain.User;
import com.gastonmatta.shoppingCartAPI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginImpl implements UserLogin {

    @Autowired
    private final UserRepository repository;

    private User actualLogedUser = null;

    public UserLoginImpl(UserRepository repository){ this.repository = repository; }

    @Override
    public void userLogin(String username, String password) {
            actualLogedUser = repository.loginUser(username, password);
    }

    public User getActualLogedUser() {
        return actualLogedUser;
    }
}
