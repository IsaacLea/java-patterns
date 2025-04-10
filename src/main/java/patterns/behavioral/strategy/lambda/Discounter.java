package patterns.behavioral.strategy.lambda;

import java.math.BigDecimal;

/**
 * Discounter interface for applying discounts to an amount.
 * This interface defines a method for applying a discount to a given amount.
 * Concrete implementations of this interface will provide specific discount strategies.
 */
public interface Discounter {

	BigDecimal applyDiscount(BigDecimal amount);
	
	static Discounter christmasDiscounter() {
        return amount -> amount.multiply(BigDecimal.valueOf(0.9));
    }

    static Discounter newYearDiscounter() {
        return amount -> amount.multiply(BigDecimal.valueOf(0.8));
    }

    static Discounter easterDiscounter() {
        return amount -> amount.multiply(BigDecimal.valueOf(0.5));
    }
    
}
