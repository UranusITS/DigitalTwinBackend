package team.solar.digitaltwinbackend.service

import team.solar.digitaltwinbackend.entity.Engine

interface EngineService {
    fun findById(id: Int?): Engine?

    fun findLatest(): Engine?

    fun add(engine: Engine): Engine?
}
