package com.java.Programes;

public class StringPalindromeTest {

	public static void main(String[] args)
	{
    String[] arr={"civic","mom","vaish","dad","hello"};
    for(int i=0;i<arr.length;i++)
    {
    	String rev=rev(arr[i]);
    	if(rev.equals(arr[i]))
    	{
			System.out.println(arr[i]+" "+"its a palindrome");
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
	

