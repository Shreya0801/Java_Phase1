package eg3;

public class Player {

	private int id;
	private String name;
	private Team team; //has-a relationship
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name, Team team) {
		this.id = id;
		this.name = name;
		this.team = team;
	}
	
	public void printPlayer() {
		System.out.println("Player Id : "+id);
		System.out.println("Player Name : "+name);
		team.printTeam();
	}
	
	
}