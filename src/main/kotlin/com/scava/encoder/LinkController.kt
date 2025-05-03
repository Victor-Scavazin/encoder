package com.scava.encoder

import com.scava.encoder.service.LinkService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/shorten")
class UserController() {

    @Autowired
    lateinit var linkService: LinkService

    @PostMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun create(@RequestBody body: Body): Link {
        return linkService.create(body.url)
    }

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun list(): List<Link> {
        return linkService.list()
    }
}

data class Body(
    val url: String,
)