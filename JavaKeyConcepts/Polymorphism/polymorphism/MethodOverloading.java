package polymorphism;

//An example of method overloading
public class MethodOverloading {

	public void eat() {
		System.out.println("Im eating nothing");
	}
	
	public void eat(int i) {
		System.out.println("Im eating an Integer");
	}
	
	public void eat(int x, String y) {
		System.out.println("Im eating an integer and string");
	}
	
	public void eat(double h) {
		System.out.println("Im eating a double");
	}
}
