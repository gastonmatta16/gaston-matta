package com.gastonmatta.shoppingCartAPI.service;

import com.gastonmatta.shoppingCartAPI.domain.User;

import java.util.List;

public interface UserService {

    Iterable<User> getAllUsers();
    User getUserById(Integer id);
    User getUserByUsername(String username);
    User getUserByFirstName(String firstName);
    User updateUserById(Integer id, User newUser);
    User addUser(User newUser);
    void deleteUser(Integer id);
}
