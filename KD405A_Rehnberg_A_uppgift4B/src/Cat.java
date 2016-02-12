

public class Cat extends Mammal{
	private int numberOfLives;
	
	/** Extends Mammal class with an int for remaining number of lives and sets a friendly name */
	public Cat (String latinName, int gestationTime, int numberOfLives, String friendlyName){
		super(latinName, gestationTime);
		setFriendlyName(friendlyName);
		this.numberOfLives = numberOfLives;
	}
	
	/** Returns the remaining number of lives */
	public int getNumberOfLives() {
		return numberOfLives;
	}

	/** Sets the remaining number of lives */
	public void setNumberOfLives(int numberOfLives) {
		this.numberOfLives = numberOfLives;
	}
	
	/** Returns the information about the animal in form of a String */
	@Override
	public String getInfo() {
		String info;
			info = "This CAT is named " + getFriendlyName() + ", it has the latin name " + getLatinName()
					+ ", it nurses for " + getGestationTime() + " months and has " + getNumberOfLives() + " lives!";
		return info;
	}
}