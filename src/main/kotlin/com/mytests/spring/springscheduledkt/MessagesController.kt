package com.mytests.spring.springscheduledkt

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessagesController(private val messagesRepository: MessagesRepository) {
    @GetMapping("/all")
    fun all(): MutableIterable<Messages?> {
        val messagesList: MutableIterable<Messages?> = messagesRepository.findAll()
        println(messagesList.toCollection(ArrayList()).size)
        return messagesList
    }
}
