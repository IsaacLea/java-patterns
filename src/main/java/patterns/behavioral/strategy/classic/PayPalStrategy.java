package patterns.behavioral.strategy.classic;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

public class PayPalStrategy implements PaymentStrategy {

	public void pay(BigDecimal amount) {
		System.out.printf("Amount %s paid using PayPalStrategy", amount);
	}
}
