package patterns.behavioral.strategy;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import patterns.behavioral.strategy.classic.CreditCardStrategy;
import patterns.behavioral.strategy.classic.PayPalStrategy;
import patterns.behavioral.strategy.classic.PaymentStrategy;
import patterns.behavioral.strategy.lambda.Discounter;

class StrategyPatternTests {

	@Test
	void test() {
		
		PaymentStrategy creditCardStrategy = new CreditCardStrategy();
		
		creditCardStrategy.pay(new BigDecimal(10.50));
		
		PaymentStrategy payPalStrategy = new PayPalStrategy();
		
		payPalStrategy.pay(new BigDecimal(10.50));
	    
	   
	}
	
	@Test
	void testLambda() {
		
		BigDecimal amount = new BigDecimal(10.50);
		
		BigDecimal christmasDiscountedAmount = Discounter.christmasDiscounter().applyDiscount(amount);
		System.out.printf("Christmas discounted amount: %s%n", christmasDiscountedAmount);
		
		BigDecimal newYearDiscountedAmount = Discounter.newYearDiscounter().applyDiscount(amount);
		System.out.printf("New Year discounted amount: %s%n", newYearDiscountedAmount);
		
		BigDecimal easterDiscountedAmount = Discounter.easterDiscounter().applyDiscount(amount);
		System.out.printf("Easter discounted amount: %s%n", easterDiscountedAmount);
		
	}

}
