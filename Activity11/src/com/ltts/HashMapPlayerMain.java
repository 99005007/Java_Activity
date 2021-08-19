package com.ltts;

import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


class Bowler{
	private String name;
	HashMap h;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Bowler(){
		
	}
	public Bowler(String name) {
		super();
		this.h=new HashMap();
		this.name = name;
	}
	public void addList(LinkedList pList) {
		h.put(this.name, pList);
	}
    public HashMap getmapp() {
    	return this.h;
    }
    
}
class Wicket{
	String playerName;
	Bowler b;
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Bowler getB() {
		return b;
	}
	public void setB(Bowler b) {
		this.b = b;
	}
	public Wicket(String playerName, Bowler b) {
		super();
		this.playerName = playerName;
		this.b = b;
	}
	
	public void display() {
		HashMap Bha=this.b.getmapp();
		//System.out.println(this.playerName+" "+ Bha);
		if(Bha.containsKey(this.playerName)){
			System.out.println("Player Name: "+this.playerName);
			//System.out.println("Wickets:");
			LinkedList ll=(LinkedList) Bha.get(playerName);
			System.out.println("Wickets: ");
			System.out.println(ll.size());

			
		}
		else {
			System.out.println("No player found with the name "+ this.playerName);
		
	}
	
	
}
}
public class HashMapPlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int check=1;
		while (check==1) {
		System.out.println("Enter the player name");
		String k=sc.next();
		Bowler bo= new Bowler(k);
		System.out.println("Enter wickets - seperated by \"|\" symbol");
		String[] d=sc.next().split("\\|");
		List li=Arrays.asList(d);
		LinkedList l=new LinkedList(li);
		bo.addList(l);
		System.out.println("Do you want to add another player (1/0)");
		check=sc.nextInt();
		if(check==0) {
		check=1;
		while(check==1) {
		System.out.println("Enter the player name to search");
		sc.nextLine();
		String Pname=sc.nextLine();
		Wicket w=new Wicket(Pname,bo);
		w.setPlayerName(Pname);
		w.setB(bo);
		w.display();
		System.out.println("do you want to search another player 1/0");
		check=sc.nextInt();
		
		}
		}
		
		
		}
	}

}
