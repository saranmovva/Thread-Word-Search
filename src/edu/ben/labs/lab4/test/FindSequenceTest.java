package edu.ben.labs.lab4.test;

import org.junit.Test;

import edu.ben.labs.lab4.FindSequence;
import junit.framework.Assert;

public class FindSequenceTest {
	// Declare arrays to be tested for every scenario
	private int[][] noPattern = { { 0, 2, 4, 4, 8, 9 }, { 0, 2, 4, 4, 8, 9 }, { 0, 2, 4, 4, 8, 9 },
			{ 0, 2, 4, 4, 8, 9 }, { 0, 2, 4, 4, 8, 9 } };
	private int[][] oneHorizontalPattern = { { 1, 2, 3, 4, 8, 9 }, { 0, 2, 4, 4, 8, 9 }, { 0, 2, 4, 4, 8, 9 },
			{ 0, 2, 4, 4, 8, 9 }, { 0, 2, 4, 4, 8, 9 } };
	private int[][] moreThanOneHorizontalPattern = { { 1, 2, 3, 4, 8, 9 }, { 0, 2, 1, 2, 3, 4 }, { 0, 2, 1, 2, 3, 4 },
			{ 0, 2, 4, 4, 8, 9 }, { 0, 2, 4, 4, 8, 9 } };

	private int[][] oneVerticalPattern = { { 1, 4, 5, 4, 8, 9 }, { 2, 2, 4, 4, 8, 9 }, { 3, 2, 4, 4, 8, 9 },
			{ 4, 2, 4, 4, 8, 9 }, { 0, 2, 4, 4, 8, 9 } };
	private int[][] moreThanOneVerticalPattern = { { 1, 4, 5, 4, 8, 4 }, { 2, 2, 4, 3, 8, 4 }, { 3, 2, 4, 2, 8, 3 },
			{ 4, 2, 4, 1, 8, 2 }, { 0, 2, 4, 4, 8, 1 } };

	private int[][] oneDiagonalLeftPattern = { { 1, 4, 5, 4, 1, 9 }, { 2, 2, 4, 2, 8, 9 }, { 3, 2, 3, 4, 8, 9 },
			{ 10, 4, 5, 4, 8, 9 }, { 0, 5, 4, 4, 8, 9 } };
	private int[][] moreThanOneDiagonalLeftPattern = { { 1, 4, 5, 4, 1, 7 }, { 2, 2, 3, 2, 7, 4 }, { 3, 2, 3, 4, 3, 9 },
			{ 1, 4, 5, 2, 8, 9 }, { 0, 5, 1, 4, 8, 9 } };

	private int[][] oneDiagonalRightPattern = { { 1, 4, 5, 4, 8, 9 }, { 2, 2, 4, 4, 8, 9 }, { 3, 2, 3, 4, 8, 9 },
			{ 4, 2, 4, 4, 8, 9 }, { 0, 2, 4, 4, 8, 9 } };
	private int[][] moreThanOneDiagonalRightPattern = { { 1, 4, 5, 4, 8, 9 }, { 2, 2, 3, 4, 8, 9 },
			{ 3, 2, 3, 2, 8, 9 }, { 4, 2, 4, 4, 1, 9 }, { 0, 2, 4, 4, 8, 9 } };

	/**
	 * Method that tests the horizontal method if there are no patterns one
	 * pattern or more than one pattern
	 */
	@Test
	public void findHorizontalTest() {
		FindSequence test = new FindSequence(noPattern);
		int actual = test.findHorizontal();
		int expected = 0;
		Assert.assertEquals(expected, actual);

		FindSequence test2 = new FindSequence(oneHorizontalPattern);
		actual = test2.findHorizontal();
		expected = 1;
		Assert.assertEquals(expected, actual);

		FindSequence test3 = new FindSequence(moreThanOneHorizontalPattern);
		actual = test3.findHorizontal();
		expected = 3;
		Assert.assertEquals(expected, actual);
	}

	/**
	 * Method that tests the vertical method if there are no patterns one
	 * pattern or more than one pattern
	 */
	@Test
	public void findVerticalTest() {
		FindSequence test = new FindSequence(noPattern);
		int actual = test.findVertical();
		int expected = 0;
		Assert.assertEquals(expected, actual);

		FindSequence test2 = new FindSequence(oneVerticalPattern);
		actual = test2.findVertical();
		expected = 1;
		Assert.assertEquals(expected, actual);

		FindSequence test3 = new FindSequence(moreThanOneVerticalPattern);
		actual = test3.findVertical();
		expected = 3;
		Assert.assertEquals(expected, actual);
	}

	/**
	 * Method that tests the diagonal left method if there are no patterns one
	 * pattern or more than one pattern
	 */
	@Test
	public void findDiagonalLeftTest() {
		FindSequence test = new FindSequence(noPattern);
		int actual = test.findDiagonalLeft();
		int expected = 0;
		Assert.assertEquals(expected, actual);

		FindSequence test2 = new FindSequence(oneDiagonalLeftPattern);
		actual = test2.findDiagonalLeft();
		expected = 1;
		Assert.assertEquals(expected, actual);

		FindSequence test3 = new FindSequence(moreThanOneDiagonalLeftPattern);
		actual = test3.findDiagonalLeft();
		expected = 2;
		Assert.assertEquals(expected, actual);
	}

	/**
	 * Method that tests the diagonal right method if there are no patterns one
	 * pattern or more than one pattern
	 */
	@Test
	public void findDiagonalRightTest() {
		FindSequence test = new FindSequence(noPattern);
		int actual = test.findDiagonalRight();
		int expected = 0;
		Assert.assertEquals(expected, actual);

		FindSequence test2 = new FindSequence(oneDiagonalRightPattern);
		actual = test2.findDiagonalRight();
		expected = 1;
		Assert.assertEquals(expected, actual);

		FindSequence test3 = new FindSequence(moreThanOneDiagonalRightPattern);
		actual = test3.findDiagonalRight();
		expected = 2;
		Assert.assertEquals(expected, actual);
	}

}
