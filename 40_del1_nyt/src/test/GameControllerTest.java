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
	public void testCreatePlayerName() {
		String testName = "Anders";
		String expected = "Anders";

		System.setIn(new ByteArrayInputStream(testName.getBytes()));
		scanner = new Scanner(System.in);

		String actual = GameController.createPlayerName(1, scanner);
		System.out.println("\nTest Output: " + actual);

		assertEquals(expected, actual);
	}

}
