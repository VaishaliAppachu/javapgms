package com.java.Programes;

public class SwapNumberswithAnotherVar {

	public static void main(String[] args) {
      int x=10;
      int y=20;
      System.out.println("Before");
      System.out.println("x value--->" +x);
      System.out.println("y value--->" +y);
      int temp=x;
      x=y;
      y=temp;
      System.out.println("After");
      System.out.println("x value--->" +x);
      System.out.println("y value--->" +y);
	}

}
