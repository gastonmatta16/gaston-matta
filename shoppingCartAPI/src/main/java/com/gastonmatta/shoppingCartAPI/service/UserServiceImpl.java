package com.gastonmatta.shoppingCartAPI.service;

import com.gastonmatta.shoppingCartAPI.CustomExceptions.UserNotFoundException;
import com.gastonmatta.shoppingCartAPI.domain.User;
import com.gastonmatta.shoppingCartAPI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository){
        this.repository = repository;
    }

    @Override
    public Iterable<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public User getUserById(Integer id) {
        return repository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
    }

    @Override
    public User getUserByUsername(String username) {
        return repository.findByUsername(username).get(0);
    }

    @Override
    public User getUserByFirstName(String firstName) {
        return repository.findByFirstName(firstName).get(0);
    }

    @Override
    public User updateUserById(Integer id, User newUser) {
        return repository.findById(id)
                .map(user -> {
                    user.setUsername(newUser.getUsername());
                    user.setPassword(newUser.getPassword());
                    user.setFirstName(newUser.getFirstName());
                    user.setLastName(newUser.getLastName());
                    user.setEmail(newUser.getEmail());
                    user.setPhoneNumber(newUser.getPhoneNumber());
                    return repository.save(user);
                })
                .orElseGet(() -> {
                    newUser.setId(id);
                    return repository.save(newUser);
                });
    }

    @Override
    public User addUser(User newUser) {
        return repository.save(newUser);
    }

    @Override
    public void deleteUser(Integer id) {
        repository.deleteById(id);
    }

}
