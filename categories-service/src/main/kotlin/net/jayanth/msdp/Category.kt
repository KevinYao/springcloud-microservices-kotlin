package net.jayanth.msdp

import org.springframework.beans.factory.annotation.Autowired
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by jmp on 7/4/2017.
 */
@Entity
@Table(name = "CATEGORIES")
class Category @Autowired constructor(@Id var categoryId:Long, var categoryName: String, var description: String, var picture: String)