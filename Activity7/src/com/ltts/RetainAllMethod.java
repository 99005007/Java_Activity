package com.ltts;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class RetainAllMethod {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		LinkedList team13=new LinkedList();
		LinkedList team12= new LinkedList();
		System.out.println("enter the top 5 scorers of IPL season 13");
		for(int i=0;i<5;i++) {
			team13.add(sc.nextLine());
			
		}
		System.out.println("Enter the top 5 scorers of IPL season 12");
		for(int i=0;i<5;i++) {
			team12.add(sc.nextLine());
		}
		
		team13.retainAll(team12);
		System.out.println("Consistent run scorers");
		Collections.sort(team13);
		for (int i=0;i<team13.size();i++) {
			System.out.println(team13.get(i));
		}
		
		
	}

}
