package inheritance;

//Super Class (Parent Class)
public class Laptop {

	//These functions/methods are required for all types of Laptops
	//thus all Laptops should inherit these methods by extending the Laptop class
	
	public void Power(boolean PowSwitch) {
		if(PowSwitch == true) {
			System.out.println("Power On");
		}
		else {
			System.out.println("Power Off");
		}
	}
	
	public void volume(int increment) {
		if(increment > 0) {
			System.out.println("Volume Increased by "+increment);
		}
		else {
			System.out.println("Volume Decreased by "+increment);
		}
	}
}
