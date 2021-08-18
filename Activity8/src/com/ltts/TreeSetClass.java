package com.ltts;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetClass {
      public static void main(String[] args) {
		
    	  Scanner sc=new Scanner(System.in);
    	  TreeSet names =new TreeSet();
    	  int t=sc.nextInt();
    	  for(int i=0;i<t;i++) {
    		  names.add(sc.nextLine());
    		  
    		  }
    	  Iterator it=names.iterator();
    	  while(it.hasNext()) {
    		  System.out.println(it.next());
    	  }
    	  
	}
}
