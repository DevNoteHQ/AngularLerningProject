package at.template.sat.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Test {
    @GeneratedValue
    @Id
    val id: Int? = null
}