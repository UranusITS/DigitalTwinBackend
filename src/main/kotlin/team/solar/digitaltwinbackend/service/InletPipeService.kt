package team.solar.digitaltwinbackend.service

import team.solar.digitaltwinbackend.entity.InletPipe

interface InletPipeService {
    fun findById(id: Int?): InletPipe?

    fun findLatest(): InletPipe?

    fun add(inletPipe: InletPipe): InletPipe?
}
