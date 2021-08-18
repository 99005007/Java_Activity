package com.ltts;

import java.util.Scanner;

abstract class Match{
	private int currentscore;
	private float currentover;
	private int target;
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(float currentover) {
		this.currentover = currentover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	
	abstract double calculateRunRate();
	abstract int calculateBalls();
	abstract void display(double reqRunrate, int balls);
	
}

class ODIMatch extends Match {
	
	int runs,balls;
	
             public double calculateRunRate() {
            	 
            	 this.runs=getTarget()-getCurrentscore();
         		float rate=this.runs/(50-getCurrentover());
         		
         		  return rate;
         		
            	 
             }
	         int calculateBalls() {
	        	 

	    		 this.balls=(int) (90-getCurrentover())*6;
	    			return this.balls;
	        	 
	         }
	          void display(double reqRunrate, int balls) {
	        	  

	     		 System.out.println("Requirements:");
	     		 System.out.println("Need"+this.runs+" runs in "+balls+"balls");
	     		 System.out.println("Required Runrate: "+reqRunrate);
	     		 
	     		 
	          }
	
	
}

class TestMatch extends Match {
	
	int runs,balls;
	
	public double calculateRunRate() {
		
		this.runs=getTarget()-getCurrentscore();
		float rate=this.runs/(90-getCurrentover());
		
		  return rate;
		
		
	}
	 public  int calculateBalls() {
		 
		 this.balls=(int) (90-getCurrentover())*6;
			return this.balls;
		 
				
		 
	 }
	public void display(double reqRunrate, int balls) {
		 
		 
		 System.out.println("Requirements:");
		 System.out.println("Need"+this.runs+" runs in "+balls+"balls");
		 System.out.println("Required Runrate: "+reqRunrate);
		 
		 
		
	 }
	 
		 
	 }
	 
	


class T20Match extends Match {
	int runs,balls;
	public double  calculateRunRate() {
		
		this.runs=getTarget()-getCurrentscore();
		float rate=this.runs/(20-getCurrentover());
		
		  return rate;
		
	}
	public int calculateBalls() {
		this.balls=(int) (20-getCurrentover())*6;
		return this.balls;
		
	}
	public void display(double reqRunrate, int balls) {
		System.out.println("Requirements: ");
		System.out.println("Need"+this.runs+"runs in"+balls+"balls");
		System.out.println("Required Runrate"+reqRunrate);
		
	}
	
	
	
}


class MatchMain {
	public static void main (String [] args) {
		 Scanner sc=new Scanner (System.in);
		 System.out.println("Enter the Match format\n1. ODI\n2. T20\n3. Test\n");
		 
		 int a=sc.nextInt();
		 System.out.println("Enter the current score");
		 int s=sc.nextInt();
		 System.out.println("Enter the current over");
		 float ov=sc.nextFloat();
		 System.out.println("Enter the Target score ");
		 int tar=sc.nextInt();
		 
		 if(a==1) {
			 ODIMatch odi = new ODIMatch();
			 odi.setCurrentscore(s);
			 odi.setCurrentover(ov);
			 odi.setTarget(tar);
			 odi.display((double)odi.calculateRunRate(), odi.calculateBalls());
		 }
		 
		 else if (a==2) {
			 T20Match odi = new T20Match();
			 odi.setCurrentscore(s);
			 odi.setCurrentover(ov);
			 odi.setTarget(tar);
			 odi.display((double)odi.calculateRunRate(), odi.calculateBalls());
			 
		 }
		 
		 else if (a==3) {
			 
			 TestMatch odi = new TestMatch();
			 odi.setCurrentscore(s);
			 odi.setCurrentover(ov);
			 odi.setTarget(tar);
			 odi.display((double)odi.calculateRunRate(), odi.calculateBalls());
			 
		 }
		 sc.close();
		 
		 
		 
	}
	
	
		
	}

