package team.solar.digitaltwinbackend.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import team.solar.digitaltwinbackend.entity.LubricatingOil

@Repository
interface LubricatingOilRepository : JpaRepository<LubricatingOil, Int> {
    fun findById(id: Int?): LubricatingOil?
}
