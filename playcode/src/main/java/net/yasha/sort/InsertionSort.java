package net.yasha.sort;

/**
 * insertion sort works on a principle of moving larger items to the right to make room for a smaller item
 * to put in its place.
 * in a insertionSort, the items to the left of the current position are sorted but may not be in a right position
 * i.e they might be moved to make room for smaller item.
 */
public class InsertionSort extends Holder {

    public static void sort(Comparable[] a) {
        int n = a.length;

        for (int i = 1; i < n; i++) {
            // walk the array as long as current position is smaller then one on it right.
            // if it is then exchange.  Once we find location on a right is smaller, we are done.
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
                exchange(a, j,  j -1 );
            }
        }
    }

    
}
