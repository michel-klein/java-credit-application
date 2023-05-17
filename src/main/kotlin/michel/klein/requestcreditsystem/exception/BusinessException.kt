package michel.klein.requestcreditsystem.exception

data class BusinessException(
override val message: String?
): RuntimeException(message) {
}