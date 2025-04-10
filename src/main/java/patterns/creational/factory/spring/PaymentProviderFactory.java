package patterns.creational.factory.spring;

import java.util.Map;

import org.springframework.stereotype.Service;

/**
 * Factory class to create payment providers.
 */
@Service
public class PaymentProviderFactory {

	private final Map<String, PaymentProvider> paymentProviderMap;
	
	/**
	 * Constructor to initialize the factory with a map of payment providers. Spring populates this map with beans of type PaymentProvider automatically
	 * 
	 * @param paymentProviderMap a map of payment provider beans
	 */
	public PaymentProviderFactory(Map<String, PaymentProvider> paymentProviderMap) {
		super();
		this.paymentProviderMap = paymentProviderMap;
	}

	public PaymentProvider getPaymentProvider(String paymentProviderType) {
        return paymentProviderMap.get(paymentProviderType);
    }
  }
