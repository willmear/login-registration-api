package com.example.apiproject.registration;

import com.example.apiproject.user.User;
import com.example.apiproject.user.UserRole;
import com.example.apiproject.user.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final UserService userService;

    public String register(RegistrationRequest request) {

        return userService.signUpUser(new User(
                request.getFirstName(),
                request.getLastName(),
                request.getEmail(),
                request.getPassword(),
                UserRole.USER
                )
        );

    }
}
