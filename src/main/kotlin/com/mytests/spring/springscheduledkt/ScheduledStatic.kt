package com.mytests.spring.springscheduledkt

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class ScheduledStatic {
    companion object {
        @JvmStatic
        @Scheduled(cron = "0 */2 * * * *")
        fun method3() {
            println("+++++++++")
            println("static method3 invoked")
            println("+++++++++")
        }
    }

}