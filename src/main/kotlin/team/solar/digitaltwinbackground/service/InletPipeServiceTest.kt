package team.solar.digitaltwinbackground.service

import team.solar.digitaltwinbackground.entity.InletPipe

interface InletPipeServiceTest {
    fun findById(id: Int?): InletPipe?

    fun findLatest(): InletPipe?

    fun add(inletPipe: InletPipe): InletPipe?
}
