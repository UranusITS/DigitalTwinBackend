package team.solar.digitaltwinbackend.controller

import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import team.solar.digitaltwinbackend.entity.InletPipe
import team.solar.digitaltwinbackend.service.InletPipeServiceTest

@RestController
@RequestMapping("/inlet-pipe")
class InletPipeController(private val service: InletPipeServiceTest) {
    @RequestMapping("/inlet-pipe")
    fun findById(@RequestParam("id") id: Int) = service.findById(id)

    @RequestMapping("/latest")
    fun findLatest() = service.findLatest()

    @RequestMapping("/add")
    fun add(@RequestBody inletPipe: InletPipe) = service.add(inletPipe)
}
