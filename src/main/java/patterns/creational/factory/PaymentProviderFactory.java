package patterns.creational.factory;

import patterns.creational.factory.PaymentConstants.PayMethod;

public class PaymentProviderFactory {

    public static PaymentProvider createPayment(PayMethod payMethod) {
      if (payMethod == PayMethod.CREDIT_CARD) {
        return new CreditCardPaymentProvider();
      } else if (payMethod == PayMethod.PAYPAL) {
        return new PayPalPaymentProvider();
      } else {
    	throw new IllegalArgumentException("Invalid payment method: " + payMethod);
      }
    }
  }
