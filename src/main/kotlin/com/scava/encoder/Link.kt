package com.scava.encoder

import jakarta.persistence.*
import java.time.OffsetDateTime

@Entity
@Table(name = "link")
class Link(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(name = "created_at")
    var createdAt: OffsetDateTime? = null,

    @Column(name = "updated_at")
    var updatedAt: OffsetDateTime? = null,

    @Column(name = "original_url")
    var originalUrl: String? = null,

    @Column(name = "short_url")
    var shortUrl: String? = null,

    @Column(name = "expires_at")
    var expiresAt: OffsetDateTime? = null,
)

