package com.java.Programes;

public class BubblesortDescendingOrder {
	public static void main(String[] args) {
	    int[] arr= {5,30,19,13,48,96,108};
	    for(int j=0;j<arr.length;j++)
	    {
	    	for(int i=1;i<arr.length-j;i++)
	    	{
	    		if(arr[i-1]<arr[i])
	    		{
	    			int temp=arr[i-1];
	    			arr[i-1]=arr[i];
	    			arr[i]=temp;
	    		}
	    	}
	   }
	    for(int data:arr)
	    {
	    	System.out.print(data+" ");
	    }
	    }
	}



