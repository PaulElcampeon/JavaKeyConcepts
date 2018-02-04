package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Dell dellLaptop = new Dell();
		
		dellLaptop.Power(true);
		dellLaptop.volume(10);
		dellLaptop.virtualisation(true);
		
		HP hpLap = new HP();
		
		hpLap.Power(true);
		hpLap.ThreeDGraphics(true);
		
	}
}
