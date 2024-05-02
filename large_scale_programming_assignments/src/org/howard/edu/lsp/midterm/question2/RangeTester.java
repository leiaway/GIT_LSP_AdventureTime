/**
 * @author Leilani Dexter
 */

package org.howard.edu.lsp.midterm.question2;

/**
 * RangeTester class contains 3 different ranges to test the IntergerRange class efficiency with the various bounds
 * The second-half of the class will print out each range
 */
public class RangeTester {
	public static void main(String[] args) {
		Range range1 = new IntegerRange(1, 5);
        Range range2 = new IntegerRange(3, 7);
        Range range3 = new IntegerRange(8, 10);
        
        System.out.println("Range1: " + range1);
        System.out.println("Range2: " + range2);
        System.out.println("Range3: " + range3);
	}

}
