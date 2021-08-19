package com.ltts;



import java.util.*;

class Match implements Comparable<Match>{
	String matchDate;
	String teamOne;
	String teamTwo;
	@Override
	public int compareTo(Match m) {
		// TODO Auto-generated method stub
		if(this.matchDate.compareTo(m.getMatchDate())==0)
		return 0;
		else if(this.matchDate.compareTo(m.getMatchDate())>0)
			return +1;
		else
			return -1;
	}
	public String getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}
	public String getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	public String getTeamTwo() {
		return teamTwo;
	}
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	Match(){
		this.matchDate=matchDate;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
	}
	public Match(String matchDate, String teamOne, String teamTwo) {
		super();
		this.matchDate = matchDate;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
	}
	
}
class Player implements Comparable<Player> {
	private String name;

	@Override
	public int compareTo(Player p) {
		// TODO Auto-generated method stub
		if(this.name.compareTo(p.getName())==0)
		return 0;
		else if(this.name.compareTo(p.getName())>0)
			return +1;
		else 
			return -1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Player(){
		this.name=name;
	}
	public Player(String name) {
		super();
		this.name = name;
	}
	
}


public class MatchSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList<Match> a1=new LinkedList<Match>();
		Match obj=new Match();
		System.out.println("Enter the number of matches:");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
		System.out.println("Enter  match date in (MM-dd-yyyy)");
		obj.setMatchDate(sc.next());
		System.out.println("Enter Team 1");
		obj.setTeamOne(sc.next());
		System.out.println("Enter Team 2");
		obj.setTeamTwo(sc.next());
		String s1=obj.getMatchDate();
		String s2=obj.getTeamOne();
		String s3=obj.getTeamTwo();
		a1.add(new Match(s1,s2,s3));
		}
		Collections.sort(a1,Collections.reverseOrder());
		for(Match m : a1){    
			System.out.println("Match held on"+m.getMatchDate()+"Team 1:"+m.getTeamOne()
			+"\nTeam 2:"+m.getTeamTwo()+"Match held on"+m.getMatchDate());    
			} 
	}

}