package com.library.domain.model

import com.sun.istack.NotNull
import java.security.Timestamp
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "book")
class Book {

    @Id
    val id : Int = 0;

    val title : String = ""

    val author : String = ""

    val summary : String = ""

    val publish_date : LocalDateTime = LocalDateTime.now()

    val insert_date : LocalDateTime = LocalDateTime.now()

}