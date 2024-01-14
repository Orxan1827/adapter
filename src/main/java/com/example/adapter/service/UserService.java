package com.example.adapter.service;

import com.example.adapter.client.UserClient;
import com.example.adapter.model.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserClient userClient;

    public List<UserDto> getAllUsers() {
        return userClient.getAllUsers();
    }
}
