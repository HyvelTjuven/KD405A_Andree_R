
public class TestCat {

	public static void main(String[] args) {
		System.out.println("Detta �r ett test f�r Cat");
		Cat c = new Cat();
		Cat a = new Cat("Gr�n", "G�ran");
		System.out.println("First cat: " + c.getName());
		System.out.println("Second cat: " + a.getColor() + "\t" + a.getName());

	}

}
