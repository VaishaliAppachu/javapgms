package com.java.Programes;

public class PalindromeforNumbers {

	public static void main(String[] args) {
    for(int i=1;i<=1000;i++)
    {
    	int rev=rev(i);
    	if(rev==i)
    	{
    		System.out.println("Palindrome Numbers--->"+i);
    	}
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

