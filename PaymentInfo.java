package CoreBankSystem;

public class PaymentInfo{
    private String paymentDate;
    private double amount;
    private String payerAccount;
    private String receiverAccount;
    private String purpose;

    public PaymentInfo(String paymentDate, double amount, String payerAccount, String receiverAccount, String purpose) {
        this.paymentDate = paymentDate;
        this.amount = amount;
        this.payerAccount = payerAccount;
        this.receiverAccount = receiverAccount;
        this.purpose = purpose;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    public String getPayerAccount() {
        return payerAccount;
    }

    public String getReceiverAccount() {
        return receiverAccount;
    }

    public String getPurpose() {
        return purpose;
    }

    @Override
    public String toString() {
        return "PaymentInfo [paymentDate=" + paymentDate + ", amount=" + amount + ", payerAccount=" + payerAccount + ", receiverAccount=" + receiverAccount + ", purpose=" + purpose + "]";
    }
    
}