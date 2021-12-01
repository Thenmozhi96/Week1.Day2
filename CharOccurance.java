package week1.day2;

public class CharOccurance 
{
	public static void main(String[] args)
	{
	String input = "welcome to chennai";
	int count=0;
	for(int i=0;i<input.length();i++)	
	{
		if(input.charAt(i)=='e')
		{
			count=count+1;
		}
	}
	System.out.println("The count of Given character is "+ count);
}
}
