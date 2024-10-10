package com.mytests.spring.springscheduledkt

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional
import java.sql.Timestamp

@Component
@Transactional
class ScheduledMethods(private val messagesRepository: MessagesRepository) {
    @Scheduled(cron = "0 */1 * * Apr *")
    fun voidMethod() {
        println("+++++++++")
        println("voidMethod invoked")
        messagesRepository.save(Messages("created by scheduled voidMethod", Timestamp(System.currentTimeMillis())))
        println("messages submitted: " + messagesRepository.count())
        println("+++++++++")
    }

    @Scheduled(cron = "0 * * * May *")
    fun nonVoidMethod(): String {
        println("+++++++++")
        println("nonVoidMethod invoked")
        messagesRepository.save(Messages("created by scheduled nonVoidMethod", Timestamp(System.currentTimeMillis())))
        println("messages submitted: " + messagesRepository.count())
        println("+++++++++")
        return "";
    }


}
