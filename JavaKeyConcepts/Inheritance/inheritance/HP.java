package inheritance;

//Subclass of Laptop, since it is a type of Laptop

public class HP extends Laptop{
	
	//Subclasses may have their own special functions/methods
	public void ThreeDGraphics(boolean graphs) {
		if(graphs == true) {
			System.out.println("3D Graphics Enabled");
		}
		else {
			System.out.println("3D Graphics Disabled");
		}
	}
	
	

}
