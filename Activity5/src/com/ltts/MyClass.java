package com.ltts;

import java.io.*;
public class MyClass {
    public static void main(String args[]) {
      InputStreamReader r=new InputStreamReader(System.in);    
      BufferedReader br=new BufferedReader(r);
      try {
          System.out.println("Enter total runs scored");
          float tRuns=Float.parseFloat(br.readLine());
          System.out.println("Enter total overs faced");
          float tOvers=Float.parseFloat(br.readLine());
          float runRate = tRuns/tOvers;
          System.out.println(runRate);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}