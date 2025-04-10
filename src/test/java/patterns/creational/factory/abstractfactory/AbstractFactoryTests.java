package patterns.creational.factory.abstractfactory;

import org.junit.jupiter.api.Test;

import patterns.creational.factory.PaymentConstants.PayMethod;
import patterns.creational.factory.abstractfactory.Button;
import patterns.creational.factory.abstractfactory.DarkUIFactory;
import patterns.creational.factory.abstractfactory.LightUIFactory;
import patterns.creational.factory.abstractfactory.TextField;
import patterns.creational.factory.abstractfactory.UIFactory;

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
