package team.solar.digitaltwinbackend.servicetestimpl

import org.springframework.stereotype.Service
import team.solar.digitaltwinbackend.dao.InletPipeDao
import team.solar.digitaltwinbackend.entity.InletPipe
import team.solar.digitaltwinbackend.servicetest.InletPipeServiceTest
import java.sql.Timestamp
import kotlin.random.Random

@Service
class InletPipeServiceTestImpl(private val dao: InletPipeDao) : InletPipeServiceTest {
    override fun findById(id: Int?): InletPipe? {
        return InletPipe(
            id,
            Random.nextDouble(10.0),
            Random.nextDouble(10.0),
            Random.nextDouble(10.0),
            Random.nextDouble(10.0),
            Random.nextDouble(10.0),
            Random.nextDouble(10.0),
            Random.nextDouble(10.0),
            Random.nextDouble(100.0),
            Random.nextDouble(100.0),
            Random.nextDouble(100.0),
            Random.nextDouble(10.0),
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
