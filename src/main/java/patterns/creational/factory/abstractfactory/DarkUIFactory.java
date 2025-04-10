package patterns.creational.factory.abstractfactory;

public class DarkUIFactory implements UIFactory {
	
	@Override
	public Button createButton() {
		return new DarkButton();
	}

	@Override
	public TextField createTextField() {
		return new DarkTextField();
	}

}
