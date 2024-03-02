/**
 * @author Leilani Dexter
 */

package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * IntegerSet class that stores the set's elements in an ArrayList
 */
public class IntegerSet {
	private List<Integer> set; // = new ArrayList<Integer>();

	/**
	 * Creates empty IntegerSet Object
	 */
	public IntegerSet() {
		this.set = new ArrayList<>();
	}

	/**
	 * Sets the IntegerSet Object with the set of integers given in Driver.java
	 * 
	 * @param set a List of integers
	 */
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}

	/**
	 * Clears the internal representation of the set, removing all elements.
	 *
	 * @see java.util.Set#clear()
	 */
	public void clear() {
		this.set.clear();
	}

	/**
	 * Returns the length of the set, which is the number of elements in it.
	 *
	 * @return the length of the set
	 */
	public int length() {
		return this.set.size();
	}

	/**
	 * Returns true if this set is equal to the specified object, and false
	 * otherwise. Two sets are considered equal if they contain all of the same
	 * values in any order. This method overrides the equals method from the Object
	 * class.
	 * 
	 * @param o is the object will compare this set to
	 * @return true if this set is equal to the specified object Otherwise return
	 *         false
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		IntegerSet that = (IntegerSet) o;
		Set<Integer> thisSet = new HashSet<>(this.set);
		Set<Integer> thatSet = new HashSet<>(that.set);
		return thisSet.equals(thatSet);
	}

	/**
	 * Checks if the set contains a given integer.
	 *
	 * @param value the integer to check for
	 * @return true if the set contains the integer, false otherwise
	 */
	public boolean contains(int value) {
		return this.set.contains(value);
	}

	public class IntegerSetException extends Exception {
		private static final long serialVersionUID = 1L;
		private final IntegerSet set;

		/**
		 * Sets IntegerSetException object with the given message and IntegerSet object.
		 *
		 * @param message the error message
		 * @param intSet  the IntegerSet object associated with this exception
		 */
		public IntegerSetException(String message, IntegerSet intSet) {
			super(message);
			this.set = intSet;
		}

		/**
		 * Returns the IntegerSet object associated with this exception.
		 *
		 * @return the IntegerSet object associated with this exception
		 */
		public IntegerSet getSet() {
			return set;
		}
	}

	/**
	 * Returns the largest integer in the set. Throws an IntegerSetException if the
	 * set is empty.
	 *
	 * @return the largest integer in the set
	 * @throws IntegerSetException if the set is empty
	 */
	public int largest() throws IntegerSetException {
		if (this.set.isEmpty()) {
			throw new IntegerSetException("Set is empty", null);
		}
		return this.set.stream().max(Integer::compareTo).get();
	}

	/**
	 * Returns the smallest integer in the set. Throws an IntegerSetException if the
	 * set is empty.
	 *
	 * @return the smallest integer in the set
	 * @throws IntegerSetException if the set is empty
	 */
	public int smallest() throws IntegerSetException {
		if (this.set.isEmpty()) {
			throw new IntegerSetException("Set is empty", null);
		}
		return this.set.stream().min(Integer::compareTo).get();
	}

	/**
	 * Adds an integer to the set. If the integer is already in the set, it does
	 * nothing.
	 *
	 * @param item the integer to add to the set
	 */
	public void add(int item) {
		this.set.add(item);
	} // adds item to the set or does nothing if it is in set

	/**
	 * Removes an integer from the set. If the integer is not in the set, it does
	 * nothing.
	 *
	 * @param item the integer to remove from the set
	 */
	public void remove(int item) {
		this.set.remove(Integer.valueOf(item));
	}

	/**
	 * Computes the union of two sets and updates the current set with the result
	 * without repeating any numbers.
	 *
	 * @param intSetb the other set to compute the union with
	 */
	public void union(IntegerSet intSetb) {
		HashSet<Integer> setWithoutDuplicates = new HashSet<Integer>(this.set);
		setWithoutDuplicates.addAll(intSetb.set);
		this.set = new ArrayList<Integer>(setWithoutDuplicates);
	}

	/**
	 * Computes the intersection of two sets and updates the current set with the
	 * result.
	 *
	 * @param intSetb the other set to compute the intersection with
	 */
	public void intersect(IntegerSet intSetb) {
		this.set.retainAll(intSetb.set);
	}

	/**
	 * Computes the difference of two sets and updates the current set with the
	 * result.
	 *
	 * @param intSetb the other set to compute the difference with
	 */
	public void diff(IntegerSet intSetb) {
		List<Integer> newSet = new ArrayList<Integer>();
		for (int i : set) {
			if (!intSetb.contains(i)) {
				newSet.add(i);
			}
		}
		set = newSet;
	}

	/**
	 * Computes the complement of two sets and updates the current set with the
	 * result.
	 *
	 * @param intSetb the other set to compute the complement with
	 */
	public void complement(IntegerSet intSetb) {
		Set<Integer> complementSet = new HashSet<>(intSetb.set);
		complementSet.removeAll(this.set);
		this.set.clear();
		this.set.addAll(complementSet);
	}

	/**
	 * If the set is empty,
	 * 
	 * @return true Otherwise, it will return false
	 */
	public boolean isEmpty() {
		return this.set.isEmpty();
	}

	/**
	 * Returns a string representation of the set, with each integer separated by a
	 * space. This overrides the toString method from the Object class.
	 * 
	 * @return a string representation of the set
	 */
	@Override
	public String toString() {
		return this.set.toString();
	}
}
