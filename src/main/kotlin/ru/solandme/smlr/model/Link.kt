package ru.solandme.smlr.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "links")
data class Link(
        var text: String = "",
        @Id @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO) var id: Long = 0
) {
}