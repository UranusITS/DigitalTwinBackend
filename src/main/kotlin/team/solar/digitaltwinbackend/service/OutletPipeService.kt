package team.solar.digitaltwinbackend.service

import team.solar.digitaltwinbackend.entity.OutletPipe

interface OutletPipeService {
    fun findById(id: Int?): OutletPipe?

    fun findLatest(): OutletPipe?

    fun add(outletPipe: OutletPipe): OutletPipe?
}
