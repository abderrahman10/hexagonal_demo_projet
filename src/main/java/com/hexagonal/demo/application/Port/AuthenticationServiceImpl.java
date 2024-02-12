package com.hexagonal.demo.application.Port;

import com.hexagonal.demo.application.DTO.LoginDto;
import com.hexagonal.demo.domain.Models.User;
import com.hexagonal.demo.domain.Port.AuthenticationService;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    private static final User TEST_USER = new User("test", "123");

    @Override
    public boolean authenticateByUserName(LoginDto loginDto) {
        String username = loginDto.getUsername();
        String password = loginDto.getPassword();
        return TEST_USER.authenticate(username, password);
    }
}
