package com.ltts;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;



public class Swapping {
	
	public static void main(String[] args) {
		 String[] s= {"Sun Risers Hyderabad","Delhi Capitals","royal Challengers Bangalore","Kolkata Knight Riders","Mumbai Indians"};
		 Scanner sc=new Scanner (System.in);
		 LinkedList teams= new LinkedList();
		 for (String ele:s) {
			 teams.add(ele);
		 }
		 
		 System.out.println("Enter Swap positions");
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 Collections.swap(teams, a, b);
		 for (int i=0;i<teams.size();i++) {
			 System.out.println(teams.get(i));
		 }
	}

}
