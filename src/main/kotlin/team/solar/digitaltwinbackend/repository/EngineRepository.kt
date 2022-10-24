package team.solar.digitaltwinbackend.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import team.solar.digitaltwinbackend.entity.Engine

@Repository
interface EngineRepository : JpaRepository<Engine, Int> {
    fun findById(id: Int?): Engine?
}
