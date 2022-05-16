package Joogid;

import org.junit.*;
import static org.junit.Assert.*;

public class Test{
    @Before public void alustus(){
        Jook j1=new Jook("piim", 0.9, 1.03);
        Joogipudel jp1=new Joogipudel(1, 0.025, 0.10, "plastik", j1);
    }

	@Test public void testPeaAlgusNullis(){
		
        double mass = jp1.mass();
        double hind = jp1.hind();
		assertEquals(1.055, mass);
		assertEquals(0.9, hind);
	}
}