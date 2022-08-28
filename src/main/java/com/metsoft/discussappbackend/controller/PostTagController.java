package com.metsoft.discussappbackend.controller;

import com.metsoft.discussappbackend.model.PostTag;
import com.metsoft.discussappbackend.repository.PostTagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tags")
public class PostTagController {
    private final PostTagRepository postTagRepository;

    @Autowired
    public PostTagController(PostTagRepository postTagRepository) {
        this.postTagRepository = postTagRepository;
    }


    @GetMapping
    public List<PostTag> findAll(){
        return postTagRepository.findAll();
    }
    @PostMapping
    public PostTag save(@RequestBody PostTag postTag){
        return postTagRepository.save(postTag);
    }
}
