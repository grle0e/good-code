package payment.factory;

import payment.strategy.*;

public class PaymentFactory {

    public static PaymentStrategy createStrategy(String type) {

        switch (type) {

            case "CREDIT":
                return new CreditCardStrategy();

            case "PAYPAL":
                return new PayPalStrategy();

            default:
                throw new IllegalArgumentException("Unknown payment type");
        }
    }
}