package com.metsoft.discussappbackend.repository

import com.metsoft.discussappbackend.model.PostTag
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PostTagRepository :JpaRepository<PostTag,String>{
}