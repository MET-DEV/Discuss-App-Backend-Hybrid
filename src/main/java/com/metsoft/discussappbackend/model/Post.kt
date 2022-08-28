package com.metsoft.discussappbackend.model

import org.hibernate.annotations.GenericGenerator
import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Post (
        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        val id: String?,
        @Column(name = "creation_date")
        val creationDate: LocalDateTime?,
        @Column(name = "post_message")
        val postMessage:String?,

        @ManyToOne()
        @JoinColumn(name = "post_tag_id")
        val postTag:PostTag?,

        ){
        constructor(postMessage: String,creationDate: LocalDateTime,postTag: PostTag):this(
                "",
                postMessage=postMessage,
                creationDate=creationDate,
                postTag=postTag
        )


}