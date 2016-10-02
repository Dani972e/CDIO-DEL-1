package spil;

/**
 * @author Daniel Larsen (s151641)
 * @author Daniel Anusic (s155005)
 * @version 1.0
 */

public class Player {

	private final int MAX_SCORE = 40;
	private int id;
	private String name;
	private int score;

	public Player(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void addToScore(int amount) {
		score += amount;
	}

	public boolean hasWon() {
		if (score >= MAX_SCORE) {
			System.out.println("\n[" + id + "] " + name + " has won! Congratulations!\n");
			return true;
		} else {
			return false;
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

}
