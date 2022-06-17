package com.java.Programes;

public class PrimeNumberUpto100 {
	public static void main(String[] args)	
{
	for(int i=0;i<=100;i++)
	{
		boolean status=isPrime(i);
		if(!status)
		{
			System.out.print(i+" ");
		}
	}
}
public static boolean isPrime(int a)
{
	boolean flag=false;
	for(int i=2;i<a;i++)
	{
		if(a%i==0)
		{
			flag=true;
			break;
		}
	}
	return flag;
}
}
