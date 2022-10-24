package team.solar.digitaltwinbackend.servicetestimpl

import org.springframework.stereotype.Service
import team.solar.digitaltwinbackend.dao.LubricatingOilDao
import team.solar.digitaltwinbackend.entity.LubricatingOil
import team.solar.digitaltwinbackend.servicetest.LubricatingOilServiceTest
import java.sql.Timestamp
import kotlin.random.Random

@Service
class LubricatingOilServiceTestImpl(private val dao: LubricatingOilDao) : LubricatingOilServiceTest {
    override fun findById(id: Int?): LubricatingOil? {
        return LubricatingOil(
            id,
            Random.nextDouble(10.0),
            Random.nextDouble(100.0),
            Random.nextDouble(100.0),
            Timestamp(System.currentTimeMillis())
        )
    }

    override fun findLatest(): LubricatingOil? {
        return findById(Random.nextInt(100))
    }

    override fun add(lubricatingOil: LubricatingOil): LubricatingOil? {
        return findById(Random.nextInt(100))
    }
}
