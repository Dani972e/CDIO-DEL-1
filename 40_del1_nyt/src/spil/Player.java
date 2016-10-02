package spil;

public class Player {

	private final int MAX_SCORE = 40;
	private String name;
	private int score;
	private int id;
	
	public Player(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void addToScore(int amount) {
		score += amount;
	}

	public boolean hasWon() {
		if (score >= MAX_SCORE) {
			System.out.println("Congratulations " + name + " you have won the game");
			return true;
		} else {
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public int getId() {
		return id;
	}
}
