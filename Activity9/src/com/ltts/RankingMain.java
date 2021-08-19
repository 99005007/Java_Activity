package com.ltts;


import java.util.*;
class Ranking implements Comparable<Ranking>{
	private String name;
	private long score;
	
	Ranking(){
		this.name=name;
		this.score=score;
	}
	public Ranking(String name, long score) {
		super();
		this.name = name;
		this.score = score;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getScore() {
		return score;
	}


	public void setScore(long score) {
		this.score = score;
	}


	@Override
	public int compareTo(Ranking r) {
		if(this.score==r.getScore())
		return 0;
		else if(this.score<r.getScore())
			return +1;
		else
			return -1;
	}

}
public class RankingMain{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Ranking obj=new Ranking();
		ArrayList<Ranking> a1=new ArrayList <Ranking>();
		System.out.println("Please provide the number of  players:");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println("Enter the name of the player"+i);
			obj.setName(sc.next());
			System.out.println("Enter the score of the player"+i);
			obj.setScore(sc.nextLong());
			String s1=obj.getName();
			Long l1=obj.getScore();
			a1.add(new Ranking(s1,l1));
		}
		Collections.sort(a1);  
		for(Ranking r:a1){ 
		System.out.println("Player Details by Score(High to Low) ");
		System.out.println(r.getName()+" "+r.getScore());    
		} 
	}
}
