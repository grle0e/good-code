package payment;

import payment.factory.PaymentFactory;
import payment.service.*;
import payment.strategy.PaymentStrategy;

public class Main {

    public static void main(String[] args) {

        PaymentStrategy strategy = PaymentFactory.createStrategy("CREDIT");

        PaymentProcessor processor =
                new PaymentProcessor(strategy, new EmailReceiptService());

        processor.processPayment(5000, "USD", "cust123");

        strategy = PaymentFactory.createStrategy("PAYPAL");

        processor =
                new PaymentProcessor(strategy, new EmailReceiptService());

        processor.processPayment(4000, "USD", "cust456");
    }
}