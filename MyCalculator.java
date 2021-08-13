package week1.day2;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator obj1 = new Calculator();
		System.out.println("Addition of int num1, num2, num3 is "+obj1.add(50, 40, 30));
		System.out.println("Subtraction of int num1 and num2 is "+obj1.sub(50, 40));
		System.out.println("Multiplication of double num1 and num2 is "+obj1.mul(15647.32598, 14580.369875));
		System.out.println("Division of float num1 and num2 is "+obj1.div(15.15f,.150f));
	
	}

}
