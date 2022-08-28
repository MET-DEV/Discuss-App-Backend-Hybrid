package com.metsoft.discussappbackend.model

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.annotations.GenericGenerator
import javax.persistence.*

@Entity
data class PostTag (
        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        val id: String?,
        val name:String?,
        @OneToMany(mappedBy = "postTag")
        @JsonIgnore
        val posts:Set<Post>?
        ){
    constructor(name: String,posts: Set<Post>):this(
            "",
           name=name,
            posts = posts
    )
}