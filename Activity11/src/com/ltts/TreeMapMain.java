package com.ltts;

import java.util.*;
public class TreeMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TreeMap t=new TreeMap();
		System.out.println("Enter the number of players ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			LinkedList l=new LinkedList();
			System.out.println("Enter the details of the player "+i);
			String k=sc.next();
			String a=sc.nextLine();
			String b=sc.nextLine();
			String c=sc.nextLine();
			l.add(a);
			l.add(b);
			l.add(c);
			t.put(k, l);
			
		}
		System.out.println("Player Details");
		System.out.println(t);
	}
}
