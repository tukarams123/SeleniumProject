package Framework;

public class Encapsulation {

	// declare global variable with with private access specifier
	private int a;

	// initialize global variable within constructor with public access specifier
	public Encapsulation() {
		a = 10;
	}

	// utilize within a method with public access specifier
	public void cubeOfNum() {
		int cube = a * a * a;
		System.out.println(cube);
	}

	public static void main(String[] args) {
		Encapsulation en = new Encapsulation();
		System.out.println(en.a);
		en.cubeOfNum();
	}

}
