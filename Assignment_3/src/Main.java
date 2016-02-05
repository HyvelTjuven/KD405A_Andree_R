import java.util.ArrayList;

public class Main {
	
	private static ArrayList<Bike> myTestBikes;
	
	public static void main(String[] args) {
		myTestBikes = new ArrayList<Bike>();
		
		myTestBikes.add(new Bike("Blå", 18, 23099));
		myTestBikes.add(new Bike("Silver", 5, 250));
		myTestBikes.add(new Bike("Lila", 20, 4599));
		myTestBikes.add(new Bike("Gul", 28, 17000));
		myTestBikes.add(new Bike("Svart", 30, 4300));
		myTestBikes.add(new Bike("Röd", 13, 50000));
		myTestBikes.add(new Bike("Brun", 23, 9999));
		myTestBikes.add(new Bike("Svart", 10, 11000));
		myTestBikes.add(new Bike("Röd", 26, 1400));
		myTestBikes.add(new Bike("Gul", 22, 2599));
		
		System.out.println(myTestBikes.get(0).getColor());
		for (int i = 0; i < myTestBikes.size(); i++){
			System.out.println("Bike " + (i+1) + ": " 
			+ "\tColor: " + myTestBikes.get(i).getColor() 
			+ "\tSize: " + myTestBikes.get(i).getSize() + "\"" 
			+ "\tPrice: " + myTestBikes.get(i).getPrice() + " kr");
		}
		
	}

}
