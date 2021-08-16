package ltts.com;

import java.util.Scanner;

public class InningsMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j;

		Innings i = new Innings();
		j=i.getNeeds();
		//j=j+1;
		//System.out.println("Enter number of teams:");
		//int n = sc.nextInt();
		//for(j=0;j<=1;j++) {
		System.out.println("Enter the teamname:");
		i.setTeamname(sc.next());
		System.out.println("Enter the inningsname:");
		i.setInningsname(sc.next());
		System.out.println("Enter Runs:");
		i.setRuns(sc.nextInt());
		//}
		i.displayInningsDetails();
		System.out.println("Need "+i.getNeeds()+" to win");
		
		System.out.println("Enter the teamname:");
		i.setTeamname(sc.next());
		System.out.println("Enter the inningsname:");
		i.setInningsname(sc.next());
		System.out.println("Enter Runs:");
		i.setRuns(sc.nextInt());
		i.displayInningsDetails();
		System.out.println("Match Ended");
		//}   
	}

}

