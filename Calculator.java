package week1.day2;

public class Calculator {
	public int add(int a,int b)
	{
		return a+b;
	}
	public double sub(int a,int b,int c,int d)
	{
		int num1,num2;
		num1 = a-b;
		num2 = c-d;
		return num1-num2;
		
	}
	public double mul(int i,int j,int k,int l)
	{
		int num1 = i*j;
		int num2 = k*l;
		return num1 * num2;
	}
	public int dev(int x,int y)
	{
		return x/y;
	}
	
	public static void main(String[] args)
	{
		Calculator cal = new Calculator();
		System.out.println("Addition of Two numbers is "+cal.add(253,624));
		System.out.println("Subtraction of Two numbers is "+cal.sub(20,10,40,50));
		System.out.println("Multiplication of Two numbers is "+cal.mul(12,21,32,23));
		System.out.println("Devision of Two numbers is "+cal.dev(150,10));
	}
}
