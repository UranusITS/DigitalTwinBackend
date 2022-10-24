package team.solar.digitaltwinbackend.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import team.solar.digitaltwinbackend.entity.WaterCooling

@Repository
interface WaterCoolingRepository : JpaRepository<WaterCooling, Int> {
    fun findById(id: Int?): WaterCooling?
}
