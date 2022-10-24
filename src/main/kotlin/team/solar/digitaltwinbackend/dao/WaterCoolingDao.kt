package team.solar.digitaltwinbackend.dao

import team.solar.digitaltwinbackend.entity.WaterCooling

interface WaterCoolingDao {
    fun findById(id: Int?): WaterCooling?

    fun findAll(): List<WaterCooling>

    fun add(waterCooling: WaterCooling): WaterCooling
}
