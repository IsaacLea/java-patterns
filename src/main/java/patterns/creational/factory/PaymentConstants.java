package patterns.creational.factory;

public class PaymentConstants {

	public enum PayMethod {
		  PAYPAL("payPal"), 
		  CREDIT_CARD("creditCard");

		  private final String value;

		  PayMethod(String value) {
		    this.value = value;
		  }

		  public String getValue() {
		    return value;
		  }
		}
	
}
