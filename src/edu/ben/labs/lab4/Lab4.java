package edu.ben.labs.lab4;

/**
 * Lab 4 Implementation with threads
 * 
 * @author Saran
 * @version 1.0
 */
public class Lab4 {
	/**
	 * Public Default Constructor
	 */
	public Lab4() {
		// Doesn't do anything
	}

	/**
	 * Main method
	 * 
	 * @param args
	 *            takes in string array as argument
	 */
	public static void main(String[] args) {
		// Doesn't do anything yet
	}

	/**
	 * Method that computes a board using threads and prints out occurrences
	 * 
	 * @param board
	 *            takes in int 2 dimensional array of integers
	 */
	public static void compute(int[][] board) {
		// if check to see if the board passed in is greater than 4x4 and is not
		// null
		if (board == null || (board.length < 4 && board[0].length < 4)) {
			System.out.println("Board is too small.");
		} else {
			// Try catch to see if threads can be instantiated
			try {
				// Instantiate FindSequence class
				FindSequence f1 = new FindSequence(board);
				// Instantiate the Threads and name them accordingly
				Thread horizontal = new Thread(f1, "Horizontal");
				Thread vertical = new Thread(f1, "Vertical");
				Thread diagonalLeft = new Thread(f1, "DiagonalLeft");
				Thread diagonalRight = new Thread(f1, "DiagonalRight");
				// Start the threads
				horizontal.start();
				vertical.start();
				diagonalLeft.start();
				diagonalRight.start();

				// Multiple try catches to see if any threads fail when joining
				try {
					horizontal.join();
				} catch (InterruptedException e) {
					System.out.println("Horizontal Thread Failed");
				}
				try {
					vertical.join();
				} catch (InterruptedException e) {
					System.out.println("Vertical Thread Failed");
				}
				try {
					diagonalLeft.join();
				} catch (InterruptedException e) {
					System.out.println("Diagonal Down Thread Failed");
				}
				try {
					diagonalRight.join();
				} catch (InterruptedException e) {
					System.out.println("Diagonal Up Thread Failed");
				}

				// Print results to console
				System.out.println("Horizontal = " + f1.getHorizontal());
				System.out.println("Vertical = " + f1.getVertical());
				System.out.println("Diagonal = " + (f1.getDiagonalLeft() + f1.getDiagonalRight()));

			} catch (IllegalThreadStateException e) {
				System.out.println("Thread generated an error.");
			}

		}
	}
}
