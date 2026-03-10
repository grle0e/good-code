package payment.strategy;

public interface PaymentStrategy {

    void validate(double amount, String currency);

    void authorize();

    void capture();
}