package week1.day2;

public class Palindrome
{
	public static void main(String[] args) 
	{
		
	String str1= new String("Madam");
	String str2=new String("");
	int len=str1.length();
	//System.out.println(len);
		for(int i=len;i>0;i--)
		{
			//System.out.println(str1);
			char a=str1.charAt(i-1);
			str2 = str2+a;
		}
		if(str2.equalsIgnoreCase(str1))
		{
			System.out.println("The given String is a palindrome");
		}
		else
		{
			System.out.println("The given String is not a palindrome");
		}
	}
}
