package CoreBankSystem;

public class InvalidPaymentDetailsException extends Exception {
    public InvalidPaymentDetailsException(String message) {
        super(message);
    }
}
