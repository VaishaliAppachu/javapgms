package com.java.Programes;

public class PolindromeStringPgm {
	public static void main(String[] args)
	{
		String s="mom";
		String rev=rev(s);
		if(s.equals(rev))
		{
			System.out.println("its a palindrome");
		}
		else
		{
			System.out.println("its not a palindrome");
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

