package net.jayanth.msdp

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.stereotype.Repository

/**
 * Created by jmp on 7/6/2017.
 */
@RepositoryRestResource
interface CustomerRepository : JpaRepository<Customer, Long> {
}