package com.java.Programes;

import java.security.PublicKey;

public class PolindromeNumberPgm {

	public static void main(String[] args) {
		int s=1905;
		if(rev(s)==s)
		{
			System.out.println("the given number is palindrome");
		}
		else
		{
			System.out.println("the given number is not a palindrome");
		}
	}
	public static int rev(int s) 
	{
		int rev=0;
		while(s!=0)
		{
			int rem=s%10;
			rev=rev*10+rem;
			s=s/10;
		}
		return rev;
	}
}