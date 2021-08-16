package ltts.com;

public class Innings {
	private String teamname;
	private String inningsname;
	private int    runs;
	private int need;
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getInningsname() {
		return inningsname;
	}
	public void setInningsname(String inningsname) {
		this.inningsname = inningsname;
	}
	public int getRuns() {
		return runs;
	}
	
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getNeeds() {
		need = runs+1;
 		return need;
	}
	
	public void displayInningsDetails() {
		System.out.println("teamname: "+teamname);
		System.out.println("Inningsname: "+inningsname);
		System.out.println("Scored: "+runs);
		//System.out.println("Need "+(runs+1) +"to win");
		}
	}
	
