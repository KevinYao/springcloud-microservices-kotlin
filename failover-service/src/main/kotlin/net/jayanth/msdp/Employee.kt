package net.jayanth.msdp

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by jmp on 7/6/2017.
 */
@Entity
@Table(name = "EMPLOYEES")
class Employee constructor(@Id var employeeId: Long, var lastname: String, var firstname: String, var title: String,
                           var titleOfCourtesy: String, var birthdate: java.sql.Date, var hiredate: java.sql.Date,
                           var address: String, var city: String, var region: String, var postalCode: String,
                           var country: String, var homePhone: String, var extension: String, var photo: String,
                           var notes: String, var reportsTo: String) {
}