package team.solar.digitaltwinbackend.servicetestimpl

import org.springframework.stereotype.Service
import team.solar.digitaltwinbackend.dao.EngineDao
import team.solar.digitaltwinbackend.entity.Engine
import team.solar.digitaltwinbackend.servicetest.EngineServiceTest
import java.sql.Timestamp
import kotlin.random.Random

@Service
class EngineServiceTestImpl(private val dao: EngineDao) : EngineServiceTest {
    override fun findById(id: Int?): Engine? {
        return Engine(
            id,
            Random.nextDouble(10.0),
            Random.nextDouble(10.0),
            Random.nextDouble(10.0),
            Random.nextDouble(180.0),
            Random.nextDouble(2000.0, 3000.0),
            Random.nextDouble(2000.0, 3000.0),
            Timestamp(System.currentTimeMillis())
        )
    }

    override fun findLatest(): Engine? {
        return findById(Random.nextInt(100))
    }

    override fun add(engine: Engine): Engine? {
        return findById(Random.nextInt(100))
    }
}
