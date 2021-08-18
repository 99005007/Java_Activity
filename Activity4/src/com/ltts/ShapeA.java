package com.ltts;

import java.util.Scanner;

abstract class Shape {
	
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	abstract double calculateArea(int value);
}

 class Circle extends Shape{
	
	double calculateArea(int value){
		double pi=3.18;
		return pi*value*value;
		
		
		
	}
	
}

 class Square extends Shape{
	 
	  double calculateArea(int value){
		   double b= value*value;
		  return b;
		 
	 }
 }
 
 class ShapeA{
	 public static void main(String[] args) {
		System.out.println("Circle\nSquare\nEnter the shape");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if("Circle".equals(s)) {
			Circle c=new Circle();
			System.out.println("Enter the radius");
			int r=sc.nextInt();
			double a=c.calculateArea(r);
			System.out.println("Area of circle is "+Math.round(a* 100.0)/100.0);
	
			
		}
		else {
			
			Square q=new Square();
			System.out.println("Enter the side");
			int r=sc.nextInt();
			double c=q.calculateArea(r);
			
			System.out.println("Area of square is"+Math.round(c* 100.0)/100.0);
			 
			
		}
		
		
	}
 }