package com.mytests.spring.springscheduledkt

import org.springframework.data.repository.CrudRepository

interface MessagesRepository : CrudRepository<Messages?, Int?>
