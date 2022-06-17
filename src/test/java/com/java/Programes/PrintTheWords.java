package com.java.Programes;

public class PrintTheWords {
	public static void main(String[] args) {
		String s="Welcome to TYSS"; 
		String[] arr = s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(!arr[i].equals("Welcome") || arr[i].equals("to"))
			{
				System.out.println(rev(arr[i])+"{"+arr[i].length()+"}");
			}
			else
			{
				System.out.println(arr[i]+"{"+arr[i].length()+"}");

			}
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
