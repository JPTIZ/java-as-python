package java_as_python;

import static org.junit.Assert.*;

import static general.Builtin.*;

import org.junit.Test;

public class RangeTest {

    @Test
    public void simple_foreach() {
        int i_ = 0;
        for (int i: range(10)) {
            assertEquals(i_, i);
            i_++;
        }
        
        assertEquals(10, i_);
    }
    
    @Test
    public void min_and_max_range() {
        int i_ = 10;
        
        for (int i: range(10, 30)) {
            assertEquals(i_, i);
            i_++;
        }
        
        assertEquals(30, i_);
    }

    @Test
    public void step() {
    	int step = 5;
    	
    	int i_ = 0;
    	for (int i: range(0, 30, step)) {
    		assertEquals(i_, i);
    		i_ += step;
    	}
    	
    	assertEquals(i_, 30);
    }
    
    @Test
    public void downto_step() {
    	int i_ = 10;
    	for (int i: range(10, 0, -1)) {
    		assertEquals(i_, i);
    		i_--;
    	}
    	
    	assertEquals(0, i_);
    }
}
