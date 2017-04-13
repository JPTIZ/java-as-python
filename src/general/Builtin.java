package general;

import collections.Range;

public class Builtin {
	/*
	 * Conversion-stuff
	 */
	
	public static int _int() {
		return 0;
	}
	
	public static <T> int _int(T o) {
		return (int)o;
	}
	
	public static int _int(String s) {
		return Integer.parseInt(s);
	}
	
	public static int _int(String s, int base) {
		return Integer.parseInt(s, base);
	}
	
	public static long len(Pythonic o) {
		return o.__len__();
	}
	
	/*
	 * Sets-stuff
	 */
	
	/**
	 * Check if any value in set is true.
	 * @param set The set.
	 * @return True if there is any value in set that is true.
	 */
	public static boolean any(Iterable<Boolean> set) {
		for (boolean b: set) {
			if (b) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Check if every value in set is true.
	 * @param set The set.
	 * @return True if there is no false value in set.
	 */
	public static boolean all(Iterable<Boolean> set) {
		for (boolean b: set) {
			if (!b) {
				return false;
			}
		}
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> Comparable<T> min(Iterable<Comparable<T>> set) {
		Comparable<T> min = null;
		for (Comparable<T> it: set) {
			if (min == null || it.compareTo((T)min) < 0) {
				min = it;
			}
		}
		return min;
	}
	
	/*
	 * Range-stuff
	 */
	
	public static Range range(int max) {
		return new Range(max);
	}
	
	public static Range range(int min, int max) {
		return new Range(min, max);
	}
	
	public static Range range(int min, int max, int step) {
		return new Range(min, max, step);
	}
}
