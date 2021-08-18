package com.ltts;

import java.util.HashSet;
import java.util.Scanner;

public class Distinct {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		HashSet names =new HashSet();
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			
			names.add(sc.nextLine());
			
		}
		System.out.println(names.size());
	}
}
