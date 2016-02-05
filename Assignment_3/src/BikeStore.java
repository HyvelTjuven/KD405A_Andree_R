import java.util.ArrayList;

public class BikeStore {
	public static ArrayList<Bike> myBikes = new ArrayList<Bike>();

	/** Creates a string containing information about all bikes*/
	public static String getAllBikes() {
		String returnBikes = "";
		for (int i = 0; i < myBikes.size(); i++) {
			returnBikes = returnBikes + "Cykel " + (i + 1) + ": " + myBikes.get(i).getColor() + ", "
					+ myBikes.get(i).getSize() + "\", " + myBikes.get(i).getPrice() + " kr" + "\n";
		}
		return returnBikes;
	}

	/** Allows adding another bike to the list*/
	public static void addBike(String color, int size, int price) {
		myBikes.add(new Bike(color, size, price));
	}

}
