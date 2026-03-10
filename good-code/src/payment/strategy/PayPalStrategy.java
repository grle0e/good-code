package payment.strategy;

public class PayPalStrategy implements PaymentStrategy {

    @Override
    public void validate(double amount, String currency) {
        if (!currency.equals("USD")) {
            throw new RuntimeException("PayPal only supports USD");
        }
    }

    @Override
    public void authorize() {
        System.out.println("PayPal authorized");
    }

    @Override
    public void capture() {
        System.out.println("PayPal captured");
    }
}