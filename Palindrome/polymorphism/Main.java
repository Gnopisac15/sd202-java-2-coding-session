package polymorphism;

public class Main {
	public static void main(String args[]) {
		Bank b;
		b = new BDO();
		System.out.println("BDO Rate of Interest: " + b.getRateOfInterest());
		b = new BPI();
		System.out.println("BPI Rate of Interest: " + b.getRateOfInterest());
		b = new DBP();
		System.out.println("DBP Rate of Interest: " + b.getRateOfInterest());
	}
}