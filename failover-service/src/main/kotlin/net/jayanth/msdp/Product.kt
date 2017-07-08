package net.jayanth.msdp

import org.springframework.beans.factory.annotation.Autowired
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by jmp on 7/4/2017.
 */
@Entity
@Table(name="PRODUCTS")
class Product @Autowired constructor(@Id var productId: Long, var productName: String, var supplierId: Long, var categoryId: Long,
                                     var quantityPerUnit: String, var unitPrice: Long, var unitsInStock: Long, var unitsOnOrder: Long, var reorderLevel: Long,
                                     var discontinued: String)