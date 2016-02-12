public abstract class Animal {
	private String latinName;
	private String friendlyName;
	
	/** Super constructor for all types of animal */
	public Animal(String latinName){
		this.latinName = latinName;
	}
	
	/** getInfo method used by all animals */
	public abstract String getInfo();
	
	/** Returns the latin name you input in the animal constructor*/
	public String getLatinName(){
		return latinName;
	}

	/** Returns the friendly name you set for your animal */
	public String getFriendlyName() {
		return friendlyName;
	}

	/** Sets the friendly name for your animal */
	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}	
}
