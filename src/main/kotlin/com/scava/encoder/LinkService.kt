package com.scava.encoder.service

import com.scava.encoder.Link
import com.scava.encoder.repository.LinkRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.OffsetDateTime

@Service
class LinkService {
    @Autowired
    lateinit var linkRepository: LinkRepository
    fun create(url: String): Link {
        val link = Link(originalUrl = url).apply {
            createdAt = OffsetDateTime.now()
            updatedAt = OffsetDateTime.now()

            val hash = originalUrl.hashCode().toString()
            shortUrl = "https://shortscava.com/$hash"
            expiresAt = OffsetDateTime.now().plusDays(5)
        }
        //validatePersist()
        return linkRepository.save(link)
    }


    fun list(): List<Link> {
        return linkRepository.findAll()
    }
}