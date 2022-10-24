package team.solar.digitaltwinbackend.controller

import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import team.solar.digitaltwinbackend.entity.OutletPipe
import team.solar.digitaltwinbackend.servicetest.OutletPipeServiceTest

@RestController
@RequestMapping("/outlet-pipe")
class OutletPipeController(private val service: OutletPipeServiceTest) {
    @RequestMapping("/outlet-pipe")
    fun findById(@RequestParam("id") id: Int) = service.findById(id)

    @RequestMapping("/latest")
    fun findLatest() = service.findLatest()

    @RequestMapping("/add")
    fun add(@RequestBody outletPipe: OutletPipe) = service.add(outletPipe)
}
