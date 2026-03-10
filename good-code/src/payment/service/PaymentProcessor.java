package payment.service;

import payment.strategy.PaymentStrategy;

public class PaymentProcessor {

    private PaymentStrategy strategy;
    private ReceiptService receiptService;

    public PaymentProcessor(PaymentStrategy strategy, ReceiptService receiptService) {
        this.strategy = strategy;
        this.receiptService = receiptService;
    }

    public void processPayment(double amount, String currency, String customerId) {

        strategy.validate(amount, currency);
        strategy.authorize();
        strategy.capture();

        receiptService.sendReceipt(customerId, amount);

        logTransaction(amount, currency);
    }

    private void logTransaction(double amount, String currency) {
        System.out.println("Logged: " + amount + " " + currency);
    }
}