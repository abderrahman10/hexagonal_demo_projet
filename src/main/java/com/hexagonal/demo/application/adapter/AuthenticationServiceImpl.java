package com.hexagonal.demo.application.adapter;

import com.hexagonal.demo.application.dto.LoginDto;
import com.hexagonal.demo.domain.User;
import com.hexagonal.demo.domain.api.AuthenticationService;
import com.hexagonal.demo.domain.spi.AuthenticationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

 private  final AuthenticationRepository authenticationRepository;

    @Override
    public boolean authenticate(String username, String password) {
        User user = authenticationRepository.findUserByUserName(username);

        return user != null && user.authenticate(username, password);

    }


}
