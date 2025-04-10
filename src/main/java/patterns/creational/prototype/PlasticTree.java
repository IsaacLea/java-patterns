package patterns.creational.prototype;

public class PlasticTree extends Tree {


	public PlasticTree(double mass, double height) {
		super(mass, height);
	}

	@Override
    public Tree copy() {
        PlasticTree plasticTreeClone = new PlasticTree(super.getMass(), super.getHeight());
        plasticTreeClone.setPosition(this.getPosition());
        return plasticTreeClone;
    }

}
