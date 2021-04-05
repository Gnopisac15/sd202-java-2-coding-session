package methods;

public class Main {
	
	int myNumber = 10;
	int MyNumber = 10;
	
	static void myMethod() {
		System.out.println("Hello World!");
	}
	
	static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		myMethod();
		
		
		System.out.println(add(2, 3));

	}

}
