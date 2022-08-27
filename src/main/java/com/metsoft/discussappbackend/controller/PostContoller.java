package com.metsoft.discussappbackend.controller;

import com.metsoft.discussappbackend.model.Post;
import com.metsoft.discussappbackend.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("")
@RestController
public class PostContoller {
    private final PostRepository postRepository;

    public PostContoller(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    @GetMapping("")
    public List<Post> findPosts(){
        return postRepository.findAll();
    }
    @PostMapping("")
    public Post savePost(@RequestBody Post post){
        return postRepository.save(post);
    }
}
