package spil;

public class DiceCup {

	private Die die1;
	private Die die2;

	public DiceCup() {
		die1 = new Die();
		die2 = new Die();
	}

	public int shakeOneDie(Player player) {
		System.out.println("[" + player.getId() + "] " + player.getName() + " is shaking one die");
		int resultOfRoll = die1.roll();
		System.out.println("[" + player.getId() + "] " + player.getName() + " got " + resultOfRoll);
		return resultOfRoll;
	}

	public int shakeTwoDice(Player player) {
		System.out.println("[" + player.getId() + "] " + player.getName() + " is shaking two dice");
		int resultOfRoll1 = die1.roll();
		int resultOfRoll2 = die2.roll();
		System.out.println("[" + player.getId() + "] " + player.getName() + " got " + resultOfRoll1 + ", " + resultOfRoll2);
		
		player.addToScore(resultOfRoll1 + resultOfRoll2);
		
		if (resultOfRoll1 == resultOfRoll2) {
			System.out.println("Wow [" + player.getId() + "] " + player.getName() + " you got an extra turn! roll the dice again!");
			shakeTwoDice(player);

		}
		
		return resultOfRoll1 + resultOfRoll2;
	}

}
