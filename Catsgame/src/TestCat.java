
public class TestCat {

	public static void main(String[] args) {
		System.out.println("Detta är ett test för Cat");
		Cat c = new Cat();
		Cat a = new Cat("Grön", "Göran");
		System.out.println("First cat: " + c.getName());
		System.out.println("Second cat: " + a.getColor() + "\t" + a.getName());

	}

}
