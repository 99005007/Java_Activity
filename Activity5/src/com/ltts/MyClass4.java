package com.ltts;

import java.util.*;
class TeamNotFooundException extends Exception {
 
 public TeamNotFooundException(String msg) {
  
  super(msg);
 }
}
public class MyClass4 {
    public static void main(String args[]) {
      String a[]={"Chennai Super Kings","Sun Risers Hyderabad","Delhi Capitals",
                  "Kings XI Punjab","Kolkata Knight Riders","Mumbai Indians",
                  "Rajasthan Royals","Royal Challengers Bangalore"};
      Scanner sc=new Scanner(System.in);
      try {
          System.out.println("Enter the expected winner team of IPL Season 13");
          String winner = sc.nextLine();
          System.out.println("Enter the expected runner team of IPL Season 13");
          String runner = sc.nextLine();
          List<String> nameList = new ArrayList<>(Arrays.asList(a));
          //System.out.println(nameList);
          //System.out.println(nameList.contains(runner));
          if (nameList.contains(winner) && nameList.contains(runner)){
              System.out.println("Expected IPL Season 13 winner: "+winner);
              System.out.println("Expected IPL Season 13 runner: "+runner);
          } else {
              throw new TeamNotFooundException("Entered team is not a part of IPL Season 13");
          }
      } catch(TeamNotFooundException e) {
          System.out.println(e);
      }
      
}
}