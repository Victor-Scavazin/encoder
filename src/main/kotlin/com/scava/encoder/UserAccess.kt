//package com.scava.encoder
//
//import jakarta.persistence.*
//import java.time.OffsetDateTime
//
//@Entity
//@Table(name = "user_access")
//class UserAccess(
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    var id: Long? = null,
//
//    @Column("created_at")
//    var createdAt: OffsetDateTime? = null,
//
//    @Column("updated_at")
//    var updatedAt: OffsetDateTime? = null,
//
//    @Column("user_agent")
//    var userAgent: String? = null,
//
//    @Column("ip_address")
//    var ipAddress: String? = null,
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "link_id")
//    var link: Link? = null,
//
//)
//
