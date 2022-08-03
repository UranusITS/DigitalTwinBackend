package team.solar.digitaltwinbackend.serviceimpl

import org.springframework.stereotype.Service
import team.solar.digitaltwinbackend.dao.InletPipeDao
import team.solar.digitaltwinbackend.entity.InletPipe
import team.solar.digitaltwinbackend.service.InletPipeService

@Service
class InletPipeServiceImpl(private val dao: InletPipeDao) : InletPipeService {
    override fun findById(id: Int?) = dao.findById(id)

    override fun findLatest(): InletPipe? {
        val inletPipes = dao.findAll().sortedByDescending { it.timeStamp }
        return inletPipes.firstOrNull()
    }

    override fun add(inletPipe: InletPipe) = dao.add(inletPipe)
}