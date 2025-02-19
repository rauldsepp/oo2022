package pr1;

import org.junit.*;
import static org.junit.Assert.*;

public class UssiTest{
	ManguTuum tuum;
	@Before public void alustus(){
		tuum=new RauliTuum();
	}
	@Test public void testPeaAlgusNullis(){
		int[][] kohad=tuum.ussiKohad();
		assertEquals(0, kohad[0][0]);
		assertEquals(0, kohad[0][1]);
	}
    @Test public void testParemale(){
		tuum.paremale();
        tuum.samm();
        int[][] kohad=tuum.ussiKohad();
		assertEquals(1, kohad[0][0]);
		assertEquals(0, kohad[0][1]);
        //Kohandage oma klassi nõnda, et test läheks läbi
	}
    @Test public void testLiikumine(){
        tuum.yles();
        tuum.samm();
        tuum.samm();
        tuum.vasakule();
        tuum.samm();
        int[][] kohad=tuum.ussiKohad();
		assertEquals(-1, kohad[0][0]);
		assertEquals(2, kohad[0][1]);
        tuum.alla();
        tuum.samm();
        assertEquals(-1, kohad[0][0]);
		assertEquals(1, kohad[0][1]);
    }
    @Test public void testMaaraOunaKoht(){
        int[] koht={3, 2};
        tuum.ounaKoht(koht);
        int[] uusKoht=tuum.ounaKoht();
        assertArrayEquals(koht, uusKoht);
        koht[0]=5;
        koht[1]=7;
        tuum.ounaKoht(koht);
        uusKoht=tuum.ounaKoht();
        assertArrayEquals(koht, uusKoht);
    }
    @Test public void kasUssSaiOuna(){
        int[] koht={0, 0};
        tuum.ounaKoht(koht);
        int[] uusKoht=tuum.ounaKoht();
        assertArrayEquals(koht, uusKoht);
        
        assertTrue(tuum.kasPihtas(koht));
    }
} 