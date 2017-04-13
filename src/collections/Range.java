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
        this(min, max, 1);
    }
    
    public Range(int min, int max, int step) {
    	this.iterator = new RangeIterator(min, max, step);
    }

    /**
     * Range iterator.
     */
    public Iterator<Integer> iterator() {
        return iterator;
    }

    private RangeIterator iterator;

    private class RangeIterator implements Iterator<Integer> {
        public RangeIterator(int min, int max, int step) {
            this.current = min;
            this.max = max;
            this.step = step;
        }

        public boolean hasNext() {
        	if (step < 0) {
        		return current > max;
        	}
            return current < max;
        }

        public Integer next() {
        	int old = current;
        	current += step;
            return old;
        }

        private int current;
        private int max;
        private int step;
    }
}
