/**
 * Name: Leilani Dexter
 */
package org.howard.edu.lsp.assignment5;

import org.howard.edu.lsp.assignment4.IntegerSet.IntegerSetException;

public class Driver{
public static void main(String[] args) throws IntegerSetException, org.howard.edu.lsp.assignment5.IntegerSet.IntegerSetException {
    IntegerSet set1 = new IntegerSet();
    set1.add(1);
    set1.add(2);
    set1.add(3);

    System.out.println("Set 1 is: " + set1.toString());
    System.out.println("Smallest value in Set1 is: " + set1.smallest());
    System.out.println("Largest value in Set1 is: " + set1.largest());

    IntegerSet set2 = new IntegerSet();
    set2.add(3);
    set2.add(4);
    set2.add(5);
    
    System.out.println("Set 2: " + set2.toString());
    System.out.println("Smallest value in Set2 is: " + set2.smallest());
    System.out.println("Largest value in Set2 is: " + set2.largest());
    
    set1.union(set2);
    System.out.println("Union of Set 1 and Set 2: " + set1.toString());
 
	} 
}
