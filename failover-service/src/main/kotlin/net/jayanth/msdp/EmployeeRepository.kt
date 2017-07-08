package net.jayanth.msdp

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

/**
 * Created by jmp on 7/6/2017.
 */
@RepositoryRestResource
interface EmployeeRepository: JpaRepository<Employee, Long> {
}