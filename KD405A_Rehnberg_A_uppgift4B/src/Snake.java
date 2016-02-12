

public class Snake extends Animal {
	private boolean poisonus;
	
	/** Extends Animal with a boolean for if the animal is poisonus or not and sets a friendly name */
	public Snake(String latinName, boolean poisonus, String friendlyName) {
		super(latinName);
		setFriendlyName(friendlyName);
		this.poisonus = poisonus;
	}
	
	/** Returns wether or not the animal is poisonus */
	public boolean isPoisonus() {
		return this.poisonus;
	}

	/** Returns the information about the animal in form of a String */
	@Override
	public String getInfo() {
		String info;
		if (isPoisonus() == false) {
			info = "This SNAKE is called " + getFriendlyName() + ", it has the latin name " + getLatinName()
					+ " and it is NOT poisonus!";
		} else {
			info = "This SNAKE is called " + getFriendlyName() + ", it has the latin name " + getLatinName()
					+ " and it IS VERY poisonus!";
		}
		return info;
	}

}
