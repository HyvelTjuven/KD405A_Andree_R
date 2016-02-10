package assignment_4b;

public abstract class Animal {
	private String latinName;
	private String friendlyName;
	
	public Animal(String latinName){
		this.latinName = latinName;
	}
	
	public abstract String getInfo();
	
	public String getLatinName(){
		return latinName;
	}

	public String getFriendlyName() {
		return friendlyName;
	}

	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}	
}
