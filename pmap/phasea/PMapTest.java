/*
 * Phase A <hj6982><kwp535>
 * Phase B <kwp535><hj6982>
 */

package pmap.phasea;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PMapTest {

    @Test
    public void testPut() {
        PMap m = new PMap();
        assertTrue(m.isEmpty());
        assertEquals(null, m.put(1, 2));
        assertEquals(1, m.size().intValue());
        assertEquals(2, m.put(1, 3).intValue());
        assertEquals(1, m.size().intValue());
    }

    @Test
    public void testGet() {
        PMap m = new PMap();
        m.put(1, 2);
        assertEquals(2, m.get(1).intValue());
        assertEquals(null, m.get(2));
    }

    // TODO add more test cases to test all implemented methods
    public void testSize()
    {
    	PMap m = new PMap();
        m.put(1, 2);
        m.put(2, 3);
        assertEquals(2, m.size().intValue());
    }
    public void testIsEmpty()
    {
    	PMap m = new PMap();
    	assertTrue(m.isEmpty());
    }
     public void testContainsKey()
     {
    	 PMap m = new PMap();
    	 m.put(1,  2);
    	 m.put(2,  3);
    	 assertTrue(m.containsKey(2));
     }
     public void testRemove()
     {
    	 PMap m = new PMap();
    	 m.put(1,  2);
    	 m.put(2,  3);
    	 m.remove(2);
    	 assertTrue(!m.containsKey(2));
     }
     public void testPutAll()
     {
    	 Integer[] keys = {1, 2, 3};
    	 Integer[] values = {2, 3, 4};
    	 PMap m = new PMap();
    	 m.putAll(keys,  values);
    	 assertTrue(m.containsKey(1));
    	 assertTrue(m.containsKey(2));
    	 assertTrue(m.containsKey(3));
    	 assertTrue(m.containsValue(2));
    	 assertTrue(m.containsValue(3));
    	 assertTrue(m.containsValue(4));

     }
     public void testClear()
     {
    	 PMap m = new PMap();
    	 m.clear();
    	 assertTrue(m.isEmpty());
     }
}
