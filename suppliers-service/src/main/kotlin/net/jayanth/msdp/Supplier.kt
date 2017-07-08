package net.jayanth.msdp

import org.bouncycastle.asn1.x500.style.RFC4519Style.name
import org.springframework.beans.factory.annotation.Autowired
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by jmp on 7/5/2017.
 */

@Entity
@Table(name = "SUPPLIERS")
class Supplier @Autowired constructor(@Id var supplierId: String, var companyName: String, var contactName: String,
                                      var contactTitle: String, var address: String, var city: String, var region: String,
                                      var postalCode: String, var country: String, var phone: String, var fax: String,
                                      var homePage: String) {
}