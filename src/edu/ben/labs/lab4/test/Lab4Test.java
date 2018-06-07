package edu.ben.labs.lab4.test;

import org.junit.Test;

import edu.ben.labs.lab4.Lab4;
import junit.framework.Assert;

public class Lab4Test extends student.TestCase {

	/**
	 * Method that tests the compute
	 */
	@Test
	public void compute() {
		Lab4 test = new Lab4();

		int[][] smallBoard = { { 1, 2, 3 }, { 1, 2, 3 } };
		test.main(null);

		// Test if null
		String actual = systemOut().getHistory();
		String expected = "Board is too small.\n";
		test.compute(null);

		// Test if correct dimensions are entered
		test.compute(smallBoard);
		actual = systemOut().getHistory();
		expected += "Board is too small.\n";
		Assert.assertEquals(expected, actual);

		// Test horizontal with diagonal
		int[][] board = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
		test.compute(board);
		actual = systemOut().getHistory();
		expected += "Horizontal = 4\n" + "Vertical = 0\n" + "Diagonal = 2\n";
		Assert.assertEquals(expected, actual);

		// Test vertical with diagonal
		int[][] board2 = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 }, { 4, 4, 4, 4 } };
		test.compute(board2);
		actual = systemOut().getHistory();
		expected += "Horizontal = 0\n" + "Vertical = 4\n" + "Diagonal = 2\n";
		Assert.assertEquals(expected, actual);

		// Test random array
		int[][] board3 = { { 1, 1, 2, 3, 4, 4 }, { 1, 2, 2, 2, 4, 3 }, { 3, 2, 2, 3, 12, 2 }, { 2, 3, 4, 7, 4, 1 },
				{ 4, 5, 4, 7, 4, 1 } };
		test.compute(board3);
		actual = systemOut().getHistory();
		expected += "Horizontal = 1\n" + "Vertical = 1\n" + "Diagonal = 1\n";
		Assert.assertEquals(expected, actual);
	}

}
