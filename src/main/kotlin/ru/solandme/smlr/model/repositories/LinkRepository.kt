package ru.solandme.smlr.model.repositories

import org.springframework.data.repository.Repository
import ru.solandme.smlr.model.Link
import java.util.*

interface LinkRepository:Repository<Link, Long> {
    fun findOne(id: Long?): Optional<Link>
    fun  save(link: Link): Link
    fun  findAll(): List<Link>
}