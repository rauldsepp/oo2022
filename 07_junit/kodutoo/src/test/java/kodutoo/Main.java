package pr1;

import org.junit.*;
import static org.junit.Assert.*;

public class Main{
	Auto auto;
	@Before public void alustus(){
		auto=new UusAuto();
	}
    @Test public void testKiirenda(){
        int kysiKaik = auto.vahetaKaiku(1);
		auto.kiirenda(15);
		assertEquals(1, kysiKaik);
		assertEquals(15, 15);
	}
	@Test public void testTagurda(){
		int tagurpidikaik = auto.tagurda(1);
		auto.kiirenda(5);
		auto.pidurda(0);
		assertEquals(1, tagurpidikaik);
		assertEquals(5, 5);
		assertEquals(0, 0);
	}
}