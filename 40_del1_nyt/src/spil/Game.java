package spil;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Daniel Larsen (s151641)
 * @author Daniel Anusic (s155005)
 * @version 1.0
 */

public class Game {

	private Player player1;
	private Player player2;
	private DiceCup diceCup;

	public Game() {
		prepareGame();
	}

	private void prepareGame() {
		Scanner input = new Scanner(System.in);
		diceCup = new DiceCup();

		String answer = "n";

		do {
			System.out.println("|--------------------------------------------------|");
			System.out.println("|             Welcome to the Dice game!            |");
			System.out.println("| Players, enter your name and prepare for battle! |");
			System.out.println("|--------------------------------------------------|\n");

			String name1 = createPlayerName(1, input);
			String name2 = createPlayerName(2, input);

			player1 = new Player(1, name1);
			player2 = new Player(2, name2);

			System.out.println("\n[" + player1.getId() + "] " + player1.getName() + " will now roll once against " + "[" + player2.getId() + "] "
					+ player2.getName() + " to see who will roll first in the game!\nPress enter after each round to continue!\n");

			int roll1 = 0;
			int roll2 = 0;

			do {
				roll1 = diceCup.shakeOneDie(player1);
				System.out.println();
				roll2 = diceCup.shakeOneDie(player2);
			} while (roll1 == roll2);

			if (roll1 > roll2) {
				System.out.println("\n[" + player1.getId() + "] " + player1.getName() + " will start!\n");
				playGame(player1, player2, input);
			} else {
				System.out.println("\n[" + player2.getId() + "] " + player2.getName() + " will start!\n");
				playGame(player2, player1, input);
			}

			do {
				System.out.println("Do you want to play again? [y/n]");
				answer = input.nextLine().toLowerCase();

				if (answer.equals("n")) break;

			} while (!(answer.equals("y")));

		} while (answer.equals("y"));

		System.out.println("Thanks for playing!");
		input.close();
	}

	private void playGame(Player firstPlayer, Player lastPlayer, Scanner input) {
		while (true) {
			diceCup.shakeTwoDice(firstPlayer);
			input.nextLine();
			showScoreTable(firstPlayer, lastPlayer);

			if (firstPlayer.hasWon()) break;

			diceCup.shakeTwoDice(lastPlayer);
			input.nextLine();
			showScoreTable(firstPlayer, lastPlayer);

			if (lastPlayer.hasWon()) break;
		}
	}

	private void showScoreTable(Player firstPlayer, Player lastPlayer) {
		NumberFormat numberFormat = NumberFormat.getInstance(Locale.ENGLISH);
		numberFormat.setMinimumIntegerDigits(2);

		String nameFirst = String.format("%1$" + 5 + "s", firstPlayer.getName());
		String nameLast = String.format("%1$" + 5 + "s", lastPlayer.getName());

		String scoreFirst = String.format("%1$" + 3 + "s", numberFormat.format(firstPlayer.getScore()));
		String scoreLast = String.format("%1$" + 3 + "s", numberFormat.format(lastPlayer.getScore()));

		System.out.println("|----------------------------------------|");
		System.out.println(" [" + firstPlayer.getId() + "] " + nameFirst + "\t [" + lastPlayer.getId() + "] " + nameLast);
		System.out.println(" Score: " + scoreFirst + "\t Score: " + scoreLast);
		System.out.println("|----------------------------------------|");
	}

	private String createPlayerName(int id, Scanner input) {
		String name = "";
		do {
			System.out.print("[" + id + "] Player name: ");
			name = input.nextLine();
		} while (name.length() < 1 || name.contains(" "));
		return name;
	}

	public static void main(String[] args) {
		new Game();
	}

}
