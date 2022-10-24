package team.solar.digitaltwinbackend.dao

import team.solar.digitaltwinbackend.entity.OutletPipe

interface OutletPipeDao {
    fun findById(id: Int?): OutletPipe?

    fun findAll(): List<OutletPipe>

    fun add(outletPipe: OutletPipe): OutletPipe
}
