public class House {
	private int yearBuilt = 0;
	private int size;
	private static int minSize = 10;
	private static int maxSize = 1000;
	private static int minYear = 1800;
	private static int maxYear = 2015;

	public House(int yearBuilt, int size) {
			
		this.yearBuilt = yearBuilt;
		
		this.size = size;
	}

	public int getYearBuilt() {
		return this.yearBuilt;
	}

	public int getSize() {
		return this.size;
	}
	
	public static int getminYear() {
		return minYear;
	}
	
	public static int getmaxYear() {
		return maxYear;
	}
	
	public static int getminSize() {
		return minSize;
	}
	
	public static int getmaxSize() {
		return maxSize;
	}
}
