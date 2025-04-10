package patterns.behavioral.strategy.classic;

import java.math.BigDecimal;

/**
 * Strategy interface for payment methods.
 * This interface defines a method for processing payments.
 * Concrete implementations of this interface will provide specific payment strategies.
 */
public interface PaymentStrategy {
	void pay(BigDecimal amount);
}
