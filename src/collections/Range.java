package collections;

import java.util.Iterator;


/**
 * Implements Python's range generator.
 */
public class Range implements Iterable<Integer> {
    /**
     * Initializes Range from [0, max) interval.
     */
    public Range(int max) {
        this(0, max);
    }

    /**
     * Initializes Range as [min, max) interval.
     */
    public Range(int min, int max) {
        this.iterator = new RangeIterator(min, max);
    }

    /**
     * Range iterator.
     */
    public Iterator<Integer> iterator() {
        return iterator;
    }

    private RangeIterator iterator;

    private class RangeIterator implements Iterator<Integer> {
        public RangeIterator(int min, int max) {
            this.current = min;
            this.max = max;
        }

        public boolean hasNext() {
            return current < max;
        }

        public Integer next() {
            return current++;
        }

        private int current;
        private int max;
    }
}
