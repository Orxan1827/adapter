package com.example.adapter.client;

import com.example.adapter.model.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "ms-movie", url = "https://api.sampleapis.com/movies/classic")
public interface UserClient {
    @GetMapping
    List<UserDto> getAllUsers();
}
