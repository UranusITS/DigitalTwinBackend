package team.solar.digitaltwinbackground.serviceimpl

import org.springframework.stereotype.Service
import team.solar.digitaltwinbackground.dao.InletPipeDao
import team.solar.digitaltwinbackground.entity.InletPipe
import team.solar.digitaltwinbackground.service.InletPipeServiceTest
import java.sql.Timestamp
import kotlin.random.Random

@Service
class InletPipeServiceTestImpl(private val dao: InletPipeDao) : InletPipeServiceTest {
    override fun findById(id: Int?): InletPipe? {
        return InletPipe(
            id,
            Random.nextDouble(1.0),
            Random.nextDouble(1.0),
            Random.nextDouble(1.0),
            Random.nextDouble(1.0),
            Random.nextDouble(1.0),
            Random.nextDouble(1.0),
            Random.nextDouble(1.0),
            Random.nextDouble(1.0),
            Random.nextDouble(1.0),
            Random.nextDouble(1.0),
            Random.nextDouble(1.0),
            Timestamp(System.currentTimeMillis())
        )
    }

    override fun findLatest(): InletPipe? {
        return findById(Random.nextInt(100))
    }

    override fun add(inletPipe: InletPipe): InletPipe? {
        return findById(Random.nextInt(100))
    }
}
