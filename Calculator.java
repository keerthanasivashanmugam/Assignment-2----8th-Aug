package week1.day2;

public class Calculator { 

	public int add (int num1, int num2, int num3)
	{
		int add = num1+num2+num3;
		return add;
	}
	
	public int sub (int num1, int num2)
	{
		int sub = num1-num2;
		return sub;
	}
	
	public double mul (double num1, double num2)
	{
		double mul = num1 * num2;
		return mul;
	}
	
	public float div (float num1, float num2)
	{
		float div = num1/num2;
		return div;
	}
	

}



/* --  Create a class "Calculator" with below methods
 * (a) add(int num1, int num2, int num3), it should return sum of num1+num2+num3

(b) sub(int num1, int num2), it should return subtraction of of num1-num2
(c) mul(double num1, double num2), it should return product of num1 * num2
(d) divide(float num1, float num2), it should return division of num1 / num2

-- Create another class as MyCalculator and call all the methods from Calculator and print the results */