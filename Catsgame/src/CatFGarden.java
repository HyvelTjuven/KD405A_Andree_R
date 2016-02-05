import java.util.ArrayList;

public class CatFGarden {
	private ArrayList<Cat> allCats;
	private String name;
	
	public CatGarden (String name){
		allCats = new ArrayList<Cat>();
		this.name = name;
	}
	
	public void addCat(Cat c){
		if (allCats.size() < 101){
			this.allCats.add(c);
		}
	}
	
	public void killCat(){
		allCats.remove(0);
	}

	public ArrayList<Cat> getAllCats() {
		return allCats;
	}

	public void setAllCats(ArrayList<Cat> allCats) {
		this.allCats = allCats;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getCats(){
		String s = this.name + "\n";
		for (s cat : allCats)
	}
}
