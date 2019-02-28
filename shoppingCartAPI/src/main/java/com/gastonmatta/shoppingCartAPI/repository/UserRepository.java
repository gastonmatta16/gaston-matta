package com.gastonmatta.shoppingCartAPI.repository;

import com.gastonmatta.shoppingCartAPI.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findByUsername(String username);

    List<User> findByFirstName(String firstName);

    @Query("SELECT u FROM User u WHERE u.username=:username AND u.password=:password")
    User loginUser(@Param("username") String username, @Param("password") String password);

}
