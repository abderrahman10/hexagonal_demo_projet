package com.hexagonal.demo.domain.spi;

import com.hexagonal.demo.domain.User;

public interface AuthenticationRepository {

    public User findUserByUserName(String username);
}
