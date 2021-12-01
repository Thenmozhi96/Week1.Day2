package week1.day2;

public class ArmstrongNumber 
{
public static void main(String[] args)
{
	int input=163,reminder=0,original,sum=0;
	original = input;
	
	while(input>0)
	{
		reminder= input%10;
		sum = sum +(reminder*reminder*reminder);
		input = input /10;
		
	}
	if(original==sum) 
	{
		System.out.println("Amstrong Number");
		
	}
	else
	{
		System.out.println("not an amstrong Numer");	
	}
	
}
	
}
