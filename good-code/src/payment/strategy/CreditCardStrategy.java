package payment.strategy;

public class CreditCardStrategy implements PaymentStrategy {

    @Override
    public void validate(double amount, String currency) {
        if (amount > 10000) {
            throw new RuntimeException("Credit card limit exceeded");
        }
    }

    @Override
    public void authorize() {
        System.out.println("Credit card authorized");
    }

    @Override
    public void capture() {
        System.out.println("Credit card captured");
    }
}