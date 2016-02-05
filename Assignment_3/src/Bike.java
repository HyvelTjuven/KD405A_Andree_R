
public class Bike {
	private String color;
	private int price;
	private int size; // I tum på hjul

	/** A method that never gets used*/
	public Bike(String color, int size) {
		this.color = color;
		this.size = size;
	}

	/** Creates a bike with instance variables regulated by Constants.java*/
	public Bike(String color, int size, int price) {
		for (int i = 0; i < Constants.colorArray.length; i++) {
			if (Constants.colorArray[i].equals(color)) {
				this.color = color;
				break;
			} else {
				this.color = "FELAKTIG FÄRG";
			}
		}

		if (size >= Constants.MIN_SIZE && size <= Constants.MAX_SIZE) {
			this.size = size;
		}

		if (price >= Constants.MIN_PRICE && price <= Constants.MAX_PRICE) {
			this.price = price;
		}
	}

	/** Returns the color of any chosen bike*/
	public String getColor() {
		return this.color;
	}

	/** Returns the size of any chosen bike*/
	public int getSize() {
		return this.size;
	}

	/** Returns the price of any chosen bike*/
	public int getPrice() {
		return this.price;
	}

	/** Never used*/
	public void setPrice(int price) {
		this.price = price;
	}
}
