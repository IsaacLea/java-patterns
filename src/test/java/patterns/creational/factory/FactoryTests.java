package patterns.creational.factory;



import org.junit.jupiter.api.Test;

import patterns.creational.factory.PaymentConstants.PayMethod;

class FactoryTests {

	@Test
	void testFactoryPattern() {
		// Using the factory to create Credit Card and PayPal payments
        PaymentProvider creditCardPayment = PaymentProviderFactory.createPayment(PayMethod.CREDIT_CARD);
        creditCardPayment.processPayment();

        PaymentProvider payPalPayment = PaymentProviderFactory.createPayment(PayMethod.PAYPAL);
        payPalPayment.processPayment();
	}

}
