package week1.day2;

public class PrintDuplicatesInArray {
	public static void main(String[] args)
	{
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		//int len=arr.length;
		
		for(int i=0;i<arr.length-1;i++) 
		{
			int count=0;
					for(int j=i+1;j<arr.length;j++)
					{
						if(arr[i]==arr[j])
						{
							count=count+1;
							System.out.println("Duplicate number is "+arr[i]);
						}
					}
				
	}
	
	}

}
