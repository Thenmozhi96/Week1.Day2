package week1.day2;

import java.util.Arrays;

public class FindingMissingElements {
	public static void main(String[] args)
	{
		int[] arr= {1,3,4,2,6,7,8};
		Arrays.sort(arr);
		int len=arr.length;
		for(int i=0,j=1;i<=len;i++,j++)
        {
            if(j!=arr[i])
            {
                System.out.println("The missing element is " +j);
                break;
            }
           
        }	
	}

}
