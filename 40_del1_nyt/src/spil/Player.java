package spil;

/**
 * @author Daniel Larsen (s151641)
 * @author Daniel Anusic (s155005)
 * @version 1.0
 */

public class Player {

	/**
	 * Indkapslede klasse variabler, "fields."
	 *
	 * @param MAX_SCORE  maksimale score for en spiller
	 * @param id spiller id
	 * @param name spillernavn
	 * @param score spillerens score
	 */
	private final int MAX_SCORE = 40;
	private int id;
	private String name;
	private int score;

	/**
	 * constructor med to parameter int id og String name.
	 *
	 * @param id spiller id
	 * @param name spillernavn
	 */
	public Player(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * metode der ligger amount til score.
	 *
	 * @param amount er den der bliver lagt til spiller score.
	 */
	public void addToScore(int amount) {
		score += amount;
	}

	/**
	 * boolean metode
	 * hvis score er større end lig med 40, har spilleren vundet.
	 * 
	 * @return true
	 * @return false
	 */
	public boolean hasWon() {
		if (score >= MAX_SCORE) {
			System.out.println("\n[" + id + "] " + name + " has won! Congratulations!\n");
			return true;
		} else {
			return false;
		}
	}

	/**
	 * gettermetode for id
	 * 
	 * @return id spiller id
	 */
	public int getId() {
		return id;
	}

	/**
	 * gettermetode for name
	 * 
	 * @return name spiller navn
	 */
	public String getName() {
		return name;
	}

	/**
	 * getter metode for score
	 * 
	 * @return score spillerens score
	 */
	public int getScore() {
		return score;
	}

}
