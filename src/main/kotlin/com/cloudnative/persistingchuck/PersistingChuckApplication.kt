package com.cloudnative.persistingchuck

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.repository.CrudRepository
import javax.persistence.Entity
import javax.persistence.Id

@SpringBootApplication
class PersistingChuckApplication

fun main(args: Array<String>) {
    SpringApplication.run(PersistingChuckApplication::class.java, *args)
}

@Entity
data class Joke(
        @Id var id: Int? = null,
        var text: String? = null,
        var rating: Int? = null
)

interface JokeRepository : CrudRepository<Joke, Int>
