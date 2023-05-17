package michel.klein.requestcreditsystem.service.impl

import michel.klein.requestcreditsystem.entity.Customer
import michel.klein.requestcreditsystem.exception.BusinessException
import michel.klein.requestcreditsystem.repository.CustomerRepository
import michel.klein.requestcreditsystem.service.ICustomerService
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val customerRepository: CustomerRepository
): ICustomerService {
    override fun save(customer: Customer): Customer {
        return this.customerRepository.save(customer)
    }

    override fun findById(id: Long): Customer {
        return this.customerRepository.findById(id).orElseThrow{
            throw BusinessException("Id $id not found")
        }
    }

    override fun delete(id: Long) {
        val customer: Customer = this.findById(id)
        this.customerRepository.delete(customer)
    }
}