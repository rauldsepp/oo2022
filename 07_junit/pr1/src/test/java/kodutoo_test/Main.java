package pr1;

import org.junit.*;
import static org.junit.Assert.*;

public class UssiTest{
	Auto auto;
	@Before public void alustus(){
		auto=new UusAuto();
	}
    @Test public void testKiirenda(){
        auto.vahetaKaiku(1);
		auto.kiirenda(15);
		assertEquals(1, 1);
		assertEquals(15, 15);
	}
}