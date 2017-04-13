package java_as_python;

import static org.junit.Assert.*;

import org.junit.Test;

import collections.Range;

public class RangeTest {

	@Test
	public void simpleForEach() {
		int i_ = 0;
		for (int i: new Range(10)) {
			assertEquals(i, i_);
			i_++;
		}
	}
	
	@Test
	public void minAndMaxRange() {
		int i_ = 10;
		for (int i: new Range(10, 30)) {
			assertEquals(i, i_);
			i_++;
		}
	}

}
