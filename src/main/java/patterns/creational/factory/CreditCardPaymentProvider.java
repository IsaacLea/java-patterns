package patterns.creational.factory;

public class CreditCardPaymentProvider implements PaymentProvider {

    @Override
    public void processPayment() {
        System.out.println("Processing payment using Credit card...");
    }
}
