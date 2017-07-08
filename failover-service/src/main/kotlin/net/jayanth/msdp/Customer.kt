package net.jayanth.msdp

import org.springframework.beans.factory.annotation.Autowired
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by jmp on 7/6/2017.
 */

@Entity
@Table(name = "CUSTOMERS")
class Customer @Autowired constructor(@Id var customerId: Long, var customerCode: String, var companyName: String,
                                      var contactName: String, var contactTitle: String, var address: String, var city: String,
                                      var region: String, var postalCode: String, var country: String, var phone: String,
                                      var fax: String) {
}