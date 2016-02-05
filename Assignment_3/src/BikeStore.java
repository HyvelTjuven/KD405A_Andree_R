import java.util.ArrayList;

public class BikeStore {
	public static ArrayList<Bike> myBikes = new ArrayList<Bike>();

	public static String getAllBikes() {
		String returnBikes = "";
		for (int i = 0; i < myBikes.size(); i++) {
			returnBikes = returnBikes + "Cykel " + (i + 1) + ":\t" + myBikes.get(i).getColor() + ",\t"
					+ myBikes.get(i).getSize() + "\",\t" + myBikes.get(i).getPrice() + " kr" + "\n";
		}
		return returnBikes;
	}

	public static void addBike(String color, int size, int price) {
		myBikes.add(new Bike(color, size, price));
	}

}
