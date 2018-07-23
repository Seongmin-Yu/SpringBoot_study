package com.first.example.controller;

import com.first.example.domain.posts.PostsRepository;
import com.first.example.dto.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class WebRestController {
    private PostsRepository postsRepository;

    @GetMapping("/hello/{name}")
    public String Hello(@PathVariable String name) {
        return "Hello, " + name + "Welcome to Spring Boot";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto) {
        postsRepository.save(dto.toEntity());
    }
}
