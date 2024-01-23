package eg3;

public class Team {
	
	private int teamId;
	private String teamName;
	private String coachName;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(int teamId, String teamName, String coachName) {
		this.teamId = teamId;
		this.teamName = teamName;
		this.coachName = coachName;
	}
	
	public void printTeam() {
		System.out.println("Printing Team Details");
		System.out.println("Team Id : "+teamId);
		System.out.println("Team Name : "+teamName);
		System.out.println("Coach Name : "+coachName);
	}
	

}