package com.java.Programes;

public class PrintOddNumber {

	public static void main(String[] args)
	{
		String s="Welcome to TYSS"; //SSYT ot emocleW 
		String[] arr = s.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		//for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(rev(arr[i]));
			System.out.print(" ");
		}
	}
	public static String rev(String s) 
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		return rev;
	}
}
