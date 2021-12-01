package week1.day2;
import java.util.Arrays;
public class FindSecondLargest {
	public static void main(String[] args)
	{
		int[] data= {3,2,11,4,6,7};
		//int result=data[]
		
		Arrays.sort(data);
		System.out.println(data[data.length-1]);
		System.out.println(data[data.length-2]);
		System.out.println(data[data.length-3]);
		System.out.println(data[data.length-4]);
		System.out.println(data[data.length-5]);
		System.out.println(data[data.length-6]);
	//	System.out.println(data[]);
	}

}
