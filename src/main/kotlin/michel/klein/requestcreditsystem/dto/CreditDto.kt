package michel.klein.requestcreditsystem.dto

import jakarta.validation.constraints.Future
import jakarta.validation.constraints.NotNull
import michel.klein.requestcreditsystem.entity.Credit
import michel.klein.requestcreditsystem.entity.Customer
import java.math.BigDecimal
import java.time.LocalDate

data class CreditDto(
    @field:NotNull(message = "Input cannot be empty") val creditValue: BigDecimal,
    @field:Future val dayFirstInstallment: LocalDate,
    val numberOfInstallments: Int,
    @field:NotNull(message = "Input cannot be empty") val customerId: Long
) {
    fun toEntity(): Credit = Credit(
        creditValue = this.creditValue,
        dayFirstInstallment = this.dayFirstInstallment,
        numberOfInstallments = this.numberOfInstallments,
        customer = Customer(id = this.customerId)
    )
}
