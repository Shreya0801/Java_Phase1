package eg3;

public class PlayerMain {

	public static void main(String[] args) {

		Team t1 = new Team(9000, "RCB", "Gary Kristen");
		Player p1 = new Player(101, "Virat Kohli", t1);
		System.out.println("Printing P1");
		p1.printPlayer();
		
		Player p2=new Player(102, "Yu Chahal", t1);
		System.out.println("\nPrinting P2");
		p2.printPlayer();
		
		
		Player p3=new Player(103, "MS Dhoni", new Team(9001, "Chennai", "Steve Fleming"));
		System.out.println("\nPrinting P3");
		p3.printPlayer();

	}

}
