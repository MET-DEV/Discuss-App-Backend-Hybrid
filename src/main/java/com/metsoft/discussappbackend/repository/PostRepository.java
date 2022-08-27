package com.metsoft.discussappbackend.repository;

import com.metsoft.discussappbackend.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,String> {
}
