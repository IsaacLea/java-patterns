package patterns.creational.factory.abstractfactory;

public class LightUIFactory implements UIFactory {
	
	@Override
	public Button createButton() {
		return new LightButton();
	}

	@Override
	public TextField createTextField() {
		return new LightTextField();
	}

}
