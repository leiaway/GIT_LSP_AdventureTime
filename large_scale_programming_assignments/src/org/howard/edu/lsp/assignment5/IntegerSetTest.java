/**
 * @author Leilani Dexter
 */
 
package org.howard.edu.lsp.assignment5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegerSetTest {

    @Test("Test case for clear methods")
    public void testClear() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        set.clear();
        assertTrue(set.isEmpty());
    }

    @Test("Test case for length method")
    public void testLength() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals(2, set.length());
    }

    @Test("Test case for the contain method")
    public void testContains() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        assertTrue(set.contains(1));
        assertFalse(set.contains(2));
    }

    @Test("Test case for the largest methods")
    public void testLargest() throws IntegerSet.IntegerSetException {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(3);
        set.add(2);
        assertEquals(3, set.largest());
    }

    @Test("Test case for the smallest method")
    public void testSmallest() throws IntegerSet.IntegerSetException {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(3);
        set.add(2);
        assertEquals(1, set.smallest());
    }

    @Test("Test case for add method")
    public void testAdd() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        assertTrue(set.contains(1));
    }

    @Test("Test case for remove method")
    public void testRemove() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.remove(1);
        assertFalse(set.contains(1));
    }

    @Test("Test case for union method")
    public void testUnion() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);

        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);

        set1.union(set2);

        assertTrue(set1.contains(1));
        assertTrue(set1.contains(2));
        assertTrue(set1.contains(3));
    }

    @Test("Test case for intersect method")
    public void testIntersect() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);

        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);

        set1.intersect(set2);

        assertFalse(set1.contains(1));
        assertTrue(set1.contains(2));
        assertFalse(set1.contains(3));
    }

    @Test("Test case for diff method")
    public void testDiff() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);

        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);

        set1.diff(set2);

        assertTrue(set1.contains(1));
        assertFalse(set1.contains(2));
        assertFalse(set1.contains(3));
    }

    @Test("Test case for complement method")
    public void testComplement() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);

        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);

        set1.complement(set2);

        assertFalse(set1.contains(1));
        assertFalse(set1.contains(2));
        assertTrue(set1.contains(3));
    }

    @Test("Test case for isEmpty method")
    public void testIsEmpty() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty());
        set.add(1);
        assertFalse(set.isEmpty());
    }

    @Test("Test case for toString method")
    public void testToString() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals("[1, 2]", set.toString());
    }
}
