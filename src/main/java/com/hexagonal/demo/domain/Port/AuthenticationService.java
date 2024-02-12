package com.hexagonal.demo.domain.Port;

import com.hexagonal.demo.application.DTO.LoginDto;

public interface AuthenticationService {
    boolean authenticateByUserName(LoginDto loginDto);

}
