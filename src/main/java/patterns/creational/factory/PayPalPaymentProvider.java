package patterns.creational.factory;

public class PayPalPaymentProvider implements PaymentProvider {

    @Override
    public void processPayment() {
        System.out.println("Processing payment using PayPal...");
    }
}
