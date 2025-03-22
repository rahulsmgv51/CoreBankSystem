package CoreBankSystem;

import java.io.*;

public class MainBranch {
    public static void main(String[] args) {
        String paymentData = """
                12-07-2024
                250.00
                1234567890
                0987654321
                Rent Payment
                """;

        // Simulate input and output streams
        try (BufferedReader bufferedReader = new BufferedReader(new StringReader(paymentData));
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))) {

            // Using try-with-resources to manage PaymentReaderService and PaymentValidationService
            try (PaymentReaderService readerService = new PaymentReaderService(bufferedReader, bufferedWriter);
                    PaymentValidationService validationService = new PaymentValidationService(bufferedWriter)) {

                // Read payment details
                PaymentInfo payment = readerService.read();

                // Validate payment details
                validationService.validate(payment);

            } catch (InvalidPaymentDetailsException | IOException e) {
                System.err.println("Error: " + e.getMessage());
            }

        } catch (IOException e) {
            System.err.println("Error while initializing resources: " + e.getMessage());
        }
    }
}
