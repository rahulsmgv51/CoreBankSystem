package CoreBankSystem;

import java.io.BufferedWriter;
import java.io.IOException;

public class PaymentValidationService implements AutoCloseable {
    private BufferedWriter bufferedWriter;

    public PaymentValidationService(BufferedWriter bufferedWriter) {
        this.bufferedWriter = bufferedWriter;
    }

    public void validate(PaymentInfo paymentInfo) throws InvalidPaymentDetailsException, IOException {
        if (paymentInfo.getAmount() <= 0) {
            throw new InvalidPaymentDetailsException(
                    "Amount must be greater than zero. Provided: " + paymentInfo.getAmount());
        }

        if (paymentInfo.getPayerAccount().isEmpty() || paymentInfo.getReceiverAccount().isEmpty() || paymentInfo.getPayerAccount().equals(paymentInfo.getReceiverAccount())) {
            throw new InvalidPaymentDetailsException("Payer and receiver accounts are invalid. Payer: " + paymentInfo.getPayerAccount() + ", Receiver: " + paymentInfo.getReceiverAccount());
        }

        if (paymentInfo.getPurpose().isEmpty()) {
            throw new InvalidPaymentDetailsException("Purpose of payment is missing.");

            
        }
        bufferedWriter.write("Payment details validated successfully.\n");
    }

    @Override
    public void close() {
        try {
            if (bufferedWriter != null) {
                bufferedWriter.write("PaymentValidationService: Resource closed using the bufferedWriter.\n");
                bufferedWriter.close();
            }
        } catch (IOException e) {
            System.err.println("Error while closing PaymentValidationService: " + e.getMessage());
        }
    }
}