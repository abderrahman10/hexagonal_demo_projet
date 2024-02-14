package com.hexagonal.demo.application.adapter;

import com.hexagonal.demo.domain.User;
import com.hexagonal.demo.domain.spi.AuthenticationRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InMemoryDatabaseUser implements AuthenticationRepository {


    private static final List<User> users = new ArrayList<>();

    static {
        users.add(new User("user1", "password1"));
        users.add(new User("user2", "password2"));
    }

    @Override
    public User findUserByUserName(String username) {

        for (User user : users) {
            if (user.getName().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
