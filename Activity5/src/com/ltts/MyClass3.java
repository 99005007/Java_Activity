package com.ltts;

import java.util.Scanner;

class CustomException extends Exception {
 
 public CustomException(String msg) {
  
  super(msg);
 }
}
 
public class MyClass3 {
 
 public static void main(String[] args) {
 
  Scanner s = new Scanner(System.in);
  
  try {
      System.out.print("Enter player name :: ");
      String name = s.nextLine();
      System.out.print("Enter player age :: ");
      int age = s.nextInt();
      if(age < 19)
        throw new CustomException("InvalidAgeRangeException");
      else {
        System.out.println("Player Name :"+name);
        System.out.println("Player age :"+age);
      }
  }
  catch (CustomException a) {
   System.out.println(a);
  }
 }
}