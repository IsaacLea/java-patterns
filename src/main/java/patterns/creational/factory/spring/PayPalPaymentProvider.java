package patterns.creational.factory.spring;

import org.springframework.stereotype.Service;

@Service(PayPalPaymentProvider.BEAN_ID)
public class PayPalPaymentProvider implements PaymentProvider {

	public static final String BEAN_ID = "payPalPaymentProvider";
	
    @Override
    public void processPayment() {
        System.out.println("Processing payment using PayPal...");
    }
}
