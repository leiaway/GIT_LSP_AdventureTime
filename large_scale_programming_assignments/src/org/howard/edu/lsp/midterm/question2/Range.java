package org.howard.edu.lsp.midterm.question2;

public interface Range {
	public static final int lowBound = 0;
	public static final int upperBound = 0;

	/** 
	 * Returns true if v is ≥ lower bound and ≤ upper bound and false otherwise
	 * @param value
	 * @return
	 */
	boolean contains(int value);

	/** 
	 * Returns true if the receiver contains at least one value in common with other, and false otherwise
	 * @param other
	 * @return
	 */
	boolean overlaps(Range other);

	/** Returns the number of integers in the range
	 * 
	 * @return
	 */
	int size();

}
