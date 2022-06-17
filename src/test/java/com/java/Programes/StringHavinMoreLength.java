package com.java.Programes;

public class StringHavinMoreLength {

	public static void main(String[] args) {
    String[] arrString={"hel","rupavarshivaisusmith","meow","sdet"};
    int max=arrString[0].length();
    String maxlength=" ";
    for(int i=1;i<arrString.length;i++)
    {
    	if(arrString[i].length()>max)
    	{
    		max=arrString[i].length();
    		maxlength=arrString[i];
    	}
    	
    }
    System.out.print(maxlength);
    System.out.print(" ");
	
	System.out.print(max);
	}

}
