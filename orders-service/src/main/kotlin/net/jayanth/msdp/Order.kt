package net.jayanth.msdp

import org.springframework.beans.factory.annotation.Autowired
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by jmp on 7/5/2017.
 */
@Entity
@Table(name = "ORDERS")
class Order @Autowired constructor(@Id var orderId: Long, var customerId: String, var employeeId: String,
                                   var orderDate: java.sql.Date, var requiredDate: java.sql.Date,
                                   var shippedDate: java.sql.Date, var shipVia: String, var freight: String,
                                   var shipName: String, var shipAddress: String, var shipCity: String,
                                   var shipRegion: String, var shipPostalCode: String, var shipCountry: String){


}