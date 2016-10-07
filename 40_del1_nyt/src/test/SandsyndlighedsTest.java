package test;

import spil.Die;

public class SandsyndlighedsTest {

	Die die1 = new Die();
	Die die2 = new Die();

	public static void main(String[] args) {

		int total = 10000;
		int count_2 = 0;
		int count_3 = 0;
		int count_4 = 0;
		int count_5 = 0;
		int count_6 = 0;
		int count_7 = 0;
		int count_8 = 0;
		int count_9 = 0;
		int count_10 = 0;
		int count_11 = 0;
		int count_12 = 0;
		int other = 0;
		int sameRoll = 0;

		int result;

		Die die1 = new Die();
		Die die2 = new Die();

		for (int i = 0; i < total; i++) {

			int roll1 = die1.roll();
			int roll2 = die2.roll();
			result = roll1 + roll2;

			if (roll1 == roll2) sameRoll++;

			switch (result) {
			case 2:
				count_2++;
				break;
			case 3:
				count_3++;
				break;
			case 4:
				count_4++;
				break;
			case 5:
				count_5++;
				break;
			case 6:
				count_6++;
				break;
			case 7:
				count_7++;
				break;
			case 8:
				count_8++;
				break;
			case 9:
				count_9++;
				break;
			case 10:
				count_10++;
				break;
			case 11:
				count_11++;
				break;
			case 12:
				count_12++;
				break;
			default:
				other++;
				break;
			}
		}

		System.out.println("total rolls: " + total);
		System.out.println("2: " + count_2);
		System.out.println("3: " + count_3);
		System.out.println("4: " + count_4);
		System.out.println("5: " + count_5);
		System.out.println("6: " + count_6);
		System.out.println("7: " + count_7);
		System.out.println("8: " + count_8);
		System.out.println("9: " + count_9);
		System.out.println("10: " + count_10);
		System.out.println("11: " + count_11);
		System.out.println("12: " + count_12);
		System.out.println("other: " + other);
		System.out.println("same: " + sameRoll);
	}

}
