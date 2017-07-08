package net.jayanth.msdp

import org.springframework.beans.factory.annotation.Autowired
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by jmp on 7/5/2017.
 */
@Entity
@Table(name = "SHIPPERS")
class Shipper @Autowired constructor(@Id var shipperId: String, var companyName: String, var phone: String) {
}