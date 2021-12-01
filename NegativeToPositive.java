package week1.day2;

public class NegativeToPositive {
	public static void main(String[] args)
	{
	
	int input=-40;
	if(input<0)
	{
		int output=input*(-1);
		//System.out.println(input);
		System.out.println("The given number is Negative Number"+input);
		System.out.println("The converted value of nagative number is "+output);
	}
	else
	{
		System.out.println("The given number is Positive Number"+input);
	}
	}
}
