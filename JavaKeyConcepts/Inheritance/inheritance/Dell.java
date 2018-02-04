package inheritance;

//Subclass of Laptop, since it is a type of Laptop

public class Dell extends Laptop{

	//Subclasses may have their own special functions/methods
	public void virtualisation(boolean virtOnOff) {
		if(virtOnOff == true) {
			System.out.println("Virtualisation Enabled");
		}
		else {
			System.out.println("Virtualisation Disabled");
		}
	}
	
}
