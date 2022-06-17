package com.java.Programes;

public class FirstMinNumberInBubblesort {

	public static void main(String[] args) {
		int[] arr= {5,9,19,3,101,96};
	    for(int j=0;j<arr.length;j++)
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
	    System.out.println(arr[0]);
}

}
	

