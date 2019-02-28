package com.gastonmatta.shoppingCartAPI.CustomExceptions;

public class UserExistException extends RuntimeException {
    public UserExistException() {
        super("User already exists.");
    }
}
