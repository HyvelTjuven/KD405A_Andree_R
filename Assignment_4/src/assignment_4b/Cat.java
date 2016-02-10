package assignment_4b;

public class Cat extends Mammal{
	private int numberOfLives;
	
	public Cat (String latinName, int gestationTime, int numberOfLives, String friendlyName){
		super(latinName, gestationTime);
		setFriendlyName(friendlyName);
		this.numberOfLives = numberOfLives;
	}

	public int getNumberOfLives() {
		return numberOfLives;
	}

	public void setNumberOfLives(int numberOfLives) {
		this.numberOfLives = numberOfLives;
	}
	
	@Override
	public String getInfo() {
		String info;
			info = "This CAT is named " + getFriendlyName() + ", it has the latin name " + getLatinName()
					+ ", it nurses for " + getGestationTime() + " months and has " + getNumberOfLives() + " lives!";
		return info;
	}
}