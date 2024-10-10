package com.mytests.spring.springscheduledkt

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.sql.Timestamp

@Entity
class Messages {
    @Id
    @GeneratedValue
    var id: Int? = null

    var message: String? = null
    var timestamp: Timestamp? = null

    constructor(message: String?, timestamp: Timestamp?) {
        this.message = message
        this.timestamp = timestamp
    }

    constructor()

    override fun toString(): String {
        return "Messages{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", timestamp=" + timestamp +
                '}'
    }
}
