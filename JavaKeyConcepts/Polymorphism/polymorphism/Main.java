package polymorphism;

public class Main {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.eat();
		obj.eat(6);
		obj.eat(7, "hello");
		obj.eat(4.6);
		
	}
}
