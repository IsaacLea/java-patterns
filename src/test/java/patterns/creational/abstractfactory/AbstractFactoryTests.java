package patterns.creational.abstractfactory;

import org.junit.jupiter.api.Test;

import patterns.creational.abstractfactory.Button;
import patterns.creational.abstractfactory.DarkUIFactory;
import patterns.creational.abstractfactory.LightUIFactory;
import patterns.creational.abstractfactory.TextField;
import patterns.creational.abstractfactory.UIFactory;
import patterns.creational.factory.PaymentConstants.PayMethod;

class AbstractFactoryTests {

	@Test
	void testAbstractFactoryPattern() {
		
		// Choose Light Theme
		UIFactory lightFactory = new LightUIFactory();
        Button lightButton = lightFactory.createButton();
        TextField lightTextField = lightFactory.createTextField();

        lightButton.display(); // Output: Displaying Light Button
        lightTextField.display(); // Output: Displaying Light Text Field

        // Choose Dark Theme
        UIFactory darkFactory = new DarkUIFactory();
        Button darkButton = darkFactory.createButton();
        TextField darkTextField = darkFactory.createTextField();

        darkButton.display(); // Output: Displaying Dark Button
        darkTextField.display(); // Output: Displaying Dark Text Field
	}
}
