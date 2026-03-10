package payment.service;

public interface ReceiptService {

    void sendReceipt(String customerId, double amount);
}