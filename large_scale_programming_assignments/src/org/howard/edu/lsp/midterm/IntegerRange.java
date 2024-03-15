/**
 * @author Leilani Dexter
 */

package org.howard.edu.lsp.midterm.question2;
import java.util.Objects;



/*
Ensure that your code is well-commented (java docs) and follows best practices.
*/

/**
 * IntegerRange class implements the Range interface
 */
public class IntegerRange implements Range{
	private final int lowBound;
	private final int upperBound;
	
	/**
	 * Checks if the lower bound integer is greater than the upper bound integer
	 * If it is, it will throw an IllegalArgumentException to prevent issues down the line 
	 * Else, The values of the parameters gets assigned to the instance variables
	 */
	public IntegerRange(int lowBound, int upperBound) {
		if(lowBound > upperBound) {
			throw new IllegalArgumentException("The lower bound can't be greater than > the upper bound");
		}
		this.lowBound = lowBound;
		this.upperBound = upperBound;
		}
	
	
	/** 
	 * Returns true if v is ≥ lower bound and ≤ upper bound and false otherwise
	 * @param value
	 * @return
	 */
	@Override
	public boolean contains(int value) {
	    return value >= lowBound && value <= upperBound;
	}
	
	/** 
	 * Returns true if the receiver contains at least one value in common with other, and false otherwise
	 * @param other
	 * @return
	 */
	@Override
    public boolean overlaps(Range other) {
        return this.lowBound <= Range.upperBound && this.upperBound >= Range.lowBound;
    }
	
	/** Returns the number of integers in the range
	 * 
	 * @return
	 */
	@Override
    public int size() {
        return upperBound - lowBound + 1;
    }
	
	/**
	 * In addition to the above, override the equals method.  Two Ranges are equal if their lower and upper bounds are the same.
	 */
	@Override
	public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IntegerRange that = (IntegerRange) obj;
        return lowBound == that.lowBound && upperBound == that.upperBound;
	}
  /**
  *For printing out test code
  */
	@Override
    public int hashCode() {
        return Objects.hash(lowBound, upperBound);
    }
 /**
  *For printing out test code
  */
    @Override
    public String toString() {
        return "[" + lowBound + ", " + upperBound + "]";
    }
}
