package team.solar.digitaltwinbackend.dao

import team.solar.digitaltwinbackend.entity.Engine

interface EngineDao {
    fun findById(id: Int?): Engine?

    fun findAll(): List<Engine>

    fun add(engine: Engine): Engine
}
