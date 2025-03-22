package CoreBankSystem;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDate;

public class PaymentReaderService{
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;

    public PaymentReaderService(BufferedReader bufferedReader, BufferedWriter bufferedWriter){
        this.bufferedReader = bufferedReader;
        this.bufferedWriter = bufferedWriter;
    }

    public PaymentInfo read() throws IOException, InvalidPaymentDetailsException{
        try{
            String paymentDate = bufferedReader.readLine().trim();
            double amount = Double.parseDouble(bufferedReader.readLine().trim());
            String payerAccount = bufferedReader.readLine().trim();
            String receiverAccount = bufferedReader.readLine().trim();
            String purpose = bufferedReader.readLine().trim();

            return new PaymentInfo(paymentDate, amount, payerAccount, receiverAccount, purpose);
        }catch(Exception e){
            throw new InvalidPaymentDetailsException("Error while reading payment details: " + e.getMessage());
        }

    }
    
}
