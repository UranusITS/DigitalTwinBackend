package team.solar.digitaltwinbackend.entity

import org.hibernate.annotations.CreationTimestamp
import java.sql.Timestamp
import javax.persistence.*

@Entity
@Table(name = "inlet_pipe")
open class InletPipe(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Int?, @Column(name = "static_pressure_1")
    open var staticPressure1: Double?, @Column(name = "static_pressure_2")
    open var staticPressure2: Double?, @Column(name = "static_pressure_3")
    open var staticPressure3: Double?, @Column(name = "static_pressure_4")
    open var staticPressure4: Double?, @Column(name = "static_pressure_5")
    open var staticPressure5: Double?, @Column(name = "static_pressure_6")
    open var staticPressure6: Double?, @Column(name = "dynamic_pressure")
    open var dynamicPressure: Double?, @Column(name = "temperature_1")
    open var temperature1: Double?, @Column(name = "temperature_2")
    open var temperature2: Double?, @Column(name = "temperature_3")
    open var temperature3: Double?, @Column(name = "air_flow_meter")
    open var airFlowMeter: Double?, @CreationTimestamp
    @Column(name = "time_stamp")
    open var timeStamp: Timestamp?
) {}
