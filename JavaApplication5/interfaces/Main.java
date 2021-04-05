package interfaces;

public class Main {

	public static void main(String[] args) {
		Bank b = new BDO();  
		System.out.println("ROI: "+b.rateOfInterest());  
	}

}
