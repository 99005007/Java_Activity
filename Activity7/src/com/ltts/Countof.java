package com.ltts;

import java.util.LinkedList;
import java.util.Scanner;

public class Countof {
	public static void main(String[] args) {
		 int fifty=0,hundred=0;
		 Scanner sc =new Scanner(System.in);
		 LinkedList score = new LinkedList();
		 int total =sc.nextInt();
		 for (int i=0;i<total;i++) {
			 int a=sc.nextInt();
			 score.add(a);
			 if((a/50)==1) {
				 fifty+=1;
			 }
			 else if ((a/100)==1) {
				 hundred+=1;
			 }
		 }
System.out.println(fifty+"\n"+hundred);
	}

}
