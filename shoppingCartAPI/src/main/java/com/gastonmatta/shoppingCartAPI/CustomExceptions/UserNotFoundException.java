package com.gastonmatta.shoppingCartAPI.CustomExceptions;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Integer id){
        super("Couldn't find user " + id);
    }
}
