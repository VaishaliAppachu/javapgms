package com.java.Programes;

public class FetchMinNumWithoutSort {

	public static void main(String[] args) {
		int[] arr= {12,26,34,89,42};
	     int min=arr[0];
	     for(int i=1;i<arr.length;i++)
	     {
	    	 if(min>arr[i])
	    	 {
	    		 min=arr[i];
	    	 }
	     }
	     System.out.println("Min number---->"+min);
		}
	}


