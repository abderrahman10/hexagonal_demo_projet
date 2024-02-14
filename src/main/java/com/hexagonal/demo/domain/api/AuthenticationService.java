package com.hexagonal.demo.domain.api;

import com.hexagonal.demo.application.dto.LoginDto;
import com.hexagonal.demo.domain.User;

public interface AuthenticationService {
    boolean authenticate(String username, String password);
}
