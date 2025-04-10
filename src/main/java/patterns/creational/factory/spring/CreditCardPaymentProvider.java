package patterns.creational.factory.spring;

import org.springframework.stereotype.Service;

@Service(CreditCardPaymentProvider.BEAN_ID)
public class CreditCardPaymentProvider implements PaymentProvider {

	public static final String BEAN_ID = "creditCardaymentProvider";
	
    @Override
    public void processPayment() {
        System.out.println("Processing payment using Credit card...");
    }
}
