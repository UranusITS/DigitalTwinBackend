package team.solar.digitaltwinbackend.service

import team.solar.digitaltwinbackend.entity.WaterCooling

interface WaterCoolingService {
    fun findById(id: Int?): WaterCooling?

    fun findLatest(): WaterCooling?

    fun add(waterCooling: WaterCooling): WaterCooling?
}
