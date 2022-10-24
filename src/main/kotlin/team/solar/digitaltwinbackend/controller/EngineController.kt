package team.solar.digitaltwinbackend.controller

import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import team.solar.digitaltwinbackend.entity.Engine
import team.solar.digitaltwinbackend.servicetest.EngineServiceTest

@RestController
@RequestMapping("/engine")
class EngineController(private val service: EngineServiceTest) {
    @RequestMapping("/engine")
    fun findById(@RequestParam("id") id: Int) = service.findById(id)

    @RequestMapping("/latest")
    fun findLatest() = service.findLatest()

    @RequestMapping("/add")
    fun add(@RequestBody engine: Engine) = service.add(engine)
}
