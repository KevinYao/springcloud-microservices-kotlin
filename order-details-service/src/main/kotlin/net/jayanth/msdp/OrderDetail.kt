package net.jayanth.msdp

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by jmp on 7/5/2017.
 */
@Entity
@Table(name="ORDER_DETAILS")
class OrderDetail constructor(@Id var orderId: Long, var productId: Long, var unitPrice: Long, var quantity: Long,
                              var discount: Long) {
}