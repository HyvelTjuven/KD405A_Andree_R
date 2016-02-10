package assignment_4b;

public class Snake extends Animal {
	private boolean poisonus;

	public Snake(String latinName, boolean poisonus, String friendlyName) {
		super(latinName);
		setFriendlyName(friendlyName);
		this.poisonus = poisonus;
	}

	public boolean isPoisonus() {
		return this.poisonus;
	}

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
