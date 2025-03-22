### CoreBankSystem
Payment Validation and Resource Management

1. Implement a system to process and validate payment information. The goal is to ensure that the payment data is correct and that resources are managed (using try-with-resources) efficiently.
2. The system has three classes. The first class (Paymentinfo) has been provided, while the other two (PaymentValidationService and PaymentReaderService) must be implemented:
3. The Paymentinfo class represents the details of a payment transaction. It encapsulates information such as the payment date, amount, payer and receiver account numbers, and the purpose of the payment.
4. The PaymentReader Service class reads and parses payment details to construct a Paymentinfo object and ensures proper resource management.
5. The PaymentValidationService class validates the details of a Paymentinfo object and ensures that the payment data is correct. It also manages resources and ensures proper cleanup.