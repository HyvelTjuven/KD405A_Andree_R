

public class Dog extends Mammal {
	private boolean stupid;
	
	/** Not used */
	public Dog(String latinName, int gestationTime, boolean stupid) {
		super(latinName, gestationTime);
		this.stupid = stupid;
	}

	/** Extends Mammal with a "Stupid"-boolean and sets the name of the dog */
	public Dog(String latinName, int gestationTime, boolean stupid, String friendlyName) {
		super(latinName, gestationTime);
		this.stupid = stupid;
		setFriendlyName(friendlyName);
	}

	/** Returns wether is stupid or not */
	public Boolean isStupid() {
		return this.stupid;
	}

	/** Returns the information about the animal in form of a String */
	@Override
	public String getInfo() {
		String info;
		if (isStupid() == false) {
			info = "This DOG is named " + getFriendlyName() + ", it has the latin name " + getLatinName()
					+ ", it nurses for " + getGestationTime() + " months and is NOT stupid!";
		} else {
			info = "This DOG is named " + getFriendlyName() + ", it has the latin name " + getLatinName()
			+ ", it nurses for " + getGestationTime() + " and IS stupid!";
		}
		return info;
	}

}
