package com.java.Programes;

public class PrimeNumber {

	public static void main(String[] args) {
    int a=11;
    boolean flag=false;
    for(int i=2;i<a;i++)
    {
    	if(a%i==0)
    	{
    		flag=true;
    		break;
    	}
    }
    if(!flag)
    {
    	System.out.println("Prime Number");
    }
    else
    {
    	System.out.println("Not a Prime Number");

    }
	}

}
