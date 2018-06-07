package edu.ben.labs.lab4;

/**
 * Class that finds the number of occurrences of the pattern 1,2,3,4 on a 2
 * dimensional array
 * 
 * @author Saran
 * @version 1.0
 */
public class FindSequence implements Runnable {
	// Declare Private Variables
	private int[][] board;
	private int horizontal = 0;
	private int vertical = 0;
	private int diagonalLeft = 0;
	private int diagonalRight = 0;

	/**
	 * Default Constructor
	 * 
	 * @param a
	 *            takes in a 2 dimensional int array
	 */
	public FindSequence(int[][] a) {
		board = a;
	}

	/**
	 * Getter that returns the horizontal value
	 * 
	 * @return int value of the horizontal occurrences
	 */
	public int getHorizontal() {
		return horizontal;
	}

	/**
	 * Getter that returns the vertical value
	 * 
	 * @return int value of the vertical occurrences
	 */
	public int getVertical() {
		return vertical;
	}

	/**
	 * Getter that returns the diagonal left value
	 * 
	 * @return int value of the diagonal left occurrences
	 */
	public int getDiagonalLeft() {
		return diagonalLeft;
	}

	/**
	 * Getter that returns the diagonal right value
	 * 
	 * @return int value of the diagonal right occurrences
	 */
	public int getDiagonalRight() {
		return diagonalRight;
	}

	/**
	 * Method that finds the horizontal occurrences of the pattern
	 * 
	 * @return int value of the horizontal occurrences
	 */
	public int findHorizontal() {
		int counter = 0;
		// For loop to go through the board
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length - 3; j++) {
				// If check to see if the pattern occurs horizontally
				if ((board[i][j] == 1 && board[i][j + 1] == 2 && board[i][j + 2] == 3 && board[i][j + 3] == 4)
						|| (board[i][j] == 4 && board[i][j + 1] == 3 && board[i][j + 2] == 2 && board[i][j + 3] == 1)) {
					counter++;
				}
			}
		}
		return counter;
	}

	/**
	 * Method that finds the vertical occurrences of the pattern
	 * 
	 * @return int value of the vertical occurrences
	 */
	public int findVertical() {
		int counter = 0;
		// For loop to go through the board
		for (int i = 0; i < board.length - 3; i++) {
			for (int j = 0; j < board[i].length; j++) {
				// If check to see if the pattern occurs vertically
				if ((board[i][j] == 1 && board[i + 1][j] == 2 && board[i + 2][j] == 3 && board[i + 3][j] == 4)
						|| (board[i][j] == 4 && board[i + 1][j] == 3 && board[i + 2][j] == 2 && board[i + 3][j] == 1)) {
					counter++;
				}
			}
		}
		return counter;
	}

	/**
	 * Method that finds the diagonal left occurrences of the pattern
	 * 
	 * @return int value of the diagonal left occurrences
	 */
	public int findDiagonalLeft() {
		int counter = 0;
		// For loop to go through the board
		for (int i = 0; i < board.length - 3; i++) {
			for (int j = 3; j < board.length; j++) {
				// If check to see if the pattern occurs diagonally to the left
				if ((board[i][j] == 1 && board[i + 1][j - 1] == 2 && board[i + 2][j - 2] == 3
						&& board[i + 3][j - 3] == 4)
						|| (board[i][j] == 4 && board[i + 1][j - 1] == 3 && board[i + 2][j - 2] == 2
								&& board[i + 3][j - 3] == 1)) {
					counter++;
				}
			}
		}
		return counter;
	}

	/**
	 * Method that finds the diagonal left occurrences of the pattern
	 * 
	 * @return int value of the diagonal right occurrences
	 */
	public int findDiagonalRight() {
		int counter = 0;
		// For loop to go through the board
		for (int i = 0; i < board.length - 3; i++) {
			for (int j = 0; j < board.length - 3; j++) {
				// If check to see if the pattern occurs diagonally to the right
				if ((board[i][j] == 1 && board[i + 1][j + 1] == 2 && board[i + 2][j + 2] == 3
						&& board[i + 3][j + 3] == 4)
						|| (board[i][j] == 4 && board[i + 1][j + 1] == 3 && board[i + 2][j + 2] == 2
								&& board[i + 3][j + 3] == 1)) {
					counter++;
				}
			}
		}
		return counter;
	}

	@Override
	public void run() {
		// If checks to see which thread should run which method
		if (Thread.currentThread().getName().equals("Horizontal")) {
			horizontal = findHorizontal();
		} else if (Thread.currentThread().getName().equals("Vertical")) {
			vertical = findVertical();
		} else if (Thread.currentThread().getName().equals("DiagonalLeft")) {
			diagonalLeft = findDiagonalLeft();
		} else if (Thread.currentThread().getName().equals("DiagonalRight")) {
			diagonalRight = findDiagonalRight();
		}

	}

}
