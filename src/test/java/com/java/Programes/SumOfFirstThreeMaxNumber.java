package com.java.Programes;

public class SumOfFirstThreeMaxNumber {

	public static void main(String[] args) {
	    int[] arr= {5,30,19,13,48,96,108};
	    for(int j=0;j<arr.length-1;j++)
	    {
	    	for(int i=1;i<arr.length-j;i++)
	    	{
	    		if(arr[i-1]>arr[i])
	    		{
	    			int temp=arr[i-1];
	    			arr[i-1]=arr[i];
	    			arr[i]=temp;
	    		}
	    	}
		    }
			
				int sum=0;
				for(int i=arr.length-1;i>=arr.length-3;i--)
				{
					sum=sum+arr[i];
				}
				System.out.println("Sum Of First Three Max Number--->"+sum);
}

}
