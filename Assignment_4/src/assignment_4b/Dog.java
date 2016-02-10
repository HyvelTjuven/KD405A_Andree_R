package assignment_4b;

public class Dog extends Mammal {
	private boolean stupid;

	public Dog(String latinName, int gestationTime, boolean stupid) {
		super(latinName, gestationTime);
		this.stupid = stupid;
	}

	public Dog(String latinName, int gestationTime, boolean stupid, String friendlyName) {
		super(latinName, gestationTime);
		this.stupid = stupid;
		setFriendlyName(friendlyName);
	}

	public Boolean isStupid() {
		return this.stupid;
	}

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
