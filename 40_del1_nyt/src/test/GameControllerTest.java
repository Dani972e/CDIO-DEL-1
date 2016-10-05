package test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import spil.GameController;

public class GameControllerTest {

	Scanner scanner;

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
		scanner.close();
		scanner = null;
	}

	@Test
	public void testCreatePlayerName0() {
		/* TC2 */
		String testName = "d";
		String expected = "d";

		System.setIn(new ByteArrayInputStream(testName.getBytes()));
		scanner = new Scanner(System.in);

		String actual = GameController.createPlayerName(1, scanner);
		System.out.println("\nActual name: " + actual);

		assertEquals(expected, actual);
	}
	
	@Test
	public void testCreatePlayerName1() {
		/* TC3 */
		String testName = "DanielDanielDanielDanielDaniel";
		String expected = "DanielDanielDanielDanielDaniel";

		System.setIn(new ByteArrayInputStream(testName.getBytes()));
		scanner = new Scanner(System.in);

		String actual = GameController.createPlayerName(1, scanner);
		System.out.println("\nActual name: " + actual);

		assertEquals(expected, actual);
	}
	
}
