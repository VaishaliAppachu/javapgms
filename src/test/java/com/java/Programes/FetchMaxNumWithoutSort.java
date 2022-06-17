package com.java.Programes;

public class FetchMaxNumWithoutSort {

	public static void main(String[] args) {
     int[] arr= {12,26,34,89,42};
     int max=arr[0];
     for(int i=1;i<arr.length;i++)
     {
    	 if(max<arr[i])
    	 {
    		 max=arr[i];
    	 }
     }
     System.out.println("Max number---->"+max);
	}

}
