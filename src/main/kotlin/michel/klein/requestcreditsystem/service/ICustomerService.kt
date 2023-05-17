package michel.klein.requestcreditsystem.service

import michel.klein.requestcreditsystem.entity.Customer

interface ICustomerService {
    fun save(customer: Customer): Customer
    fun findById(id: Long): Customer
    fun delete(id: Long)
}