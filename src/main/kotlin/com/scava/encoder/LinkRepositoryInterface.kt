package com.scava.encoder.repository

import com.scava.encoder.Link
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LinkRepository : JpaRepository<Link, Long> {

}