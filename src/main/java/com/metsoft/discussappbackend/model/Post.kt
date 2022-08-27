package com.metsoft.discussappbackend.model

import org.hibernate.annotations.GenericGenerator
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Post (
        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        val id: String?,
        @Column(name = "creation_date")
        val creationDate: LocalDateTime?,
        @Column(name = "post_message")
        val postMessage:String?
        ){
        constructor(postMessage: String,creationDate: LocalDateTime):this("",creationDate,postMessage)


}