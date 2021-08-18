package com.ltts;

import java.util.Scanner;
public class MyClass1 {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      try {
          System.out.println("enter number of overs");
          int n = sc.nextInt();
          int[] array = new int[n];
          System.out.println("Enter the runs in each over ");  
          for(int i=0; i<n; i++)  
          {
              array[i]=sc.nextInt();
          }
          System.out.println("enter the over number");
          int oNum= sc.nextInt();
          System.out.println(array[oNum-1]);
      }
      catch(Exception e){
          System.out.println(e);
      }
    }
}