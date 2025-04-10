package patterns.creational.prototype;

public class PineTree extends Tree {


	public PineTree(double mass, double height) {
		super(mass, height);
	}

	@Override
    public Tree copy() {
        PineTree pineTreeClone = new PineTree(super.getMass(), super.getHeight());
        pineTreeClone.setPosition(this.getPosition());
        return pineTreeClone;
    }

}
