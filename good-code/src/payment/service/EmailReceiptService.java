package payment.service;

public class EmailReceiptService implements ReceiptService {

    @Override
    public void sendReceipt(String customerId, double amount) {
        System.out.println("Email receipt sent to " + customerId + " for $" + amount);
    }
}