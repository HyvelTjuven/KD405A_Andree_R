

public abstract class Mammal extends Animal {
	private int gestationTime;

	/** Extends animal class with a variable for gestation time */
	public Mammal (String latinName, int gestationTime){
		super(latinName);
		this.gestationTime = gestationTime;
	}

	/** Returns the gestation time */
	public int getGestationTime() {
		return gestationTime;
	}
}
