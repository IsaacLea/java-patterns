package patterns.creational.factory.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class SpringFactoryTests {

	@Test
	void testFactoryPattern() {

		ApplicationContext springContext = new AnnotationConfigApplicationContext("patterns.creational.factory.spring");
		PaymentProviderFactory paymentProviderFactory = springContext.getBean(PaymentProviderFactory.class);
	    
		// Provides StripePaymentProvider instance usage the same to accept payment
		paymentProviderFactory.getPaymentProvider(CreditCardPaymentProvider.BEAN_ID).processPayment();

		// Provides PayPalPaymentProvider instance usage the same to accept payment
		paymentProviderFactory.getPaymentProvider(PayPalPaymentProvider.BEAN_ID).processPayment();

	}

}
