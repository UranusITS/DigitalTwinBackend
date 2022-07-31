package team.solar.digitaltwinbackground.service

import team.solar.digitaltwinbackground.entity.InletPipe

interface InletPipeService {
    fun findById(id: Int?): InletPipe?

    fun findLatest(): InletPipe?

    fun add(inletPipe: InletPipe): InletPipe?
}
