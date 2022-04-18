package Tund_7a;

import org.junit.Test;
import static org.junit.Assert.*;

public class hobuTest {
    @Test public void varsaKaal(){
        assertEquals(45, hobu2.varsaKaal(450));
    }

    @Test public void paevaHein(){
        assertEquals(10, hobu2.paevaHein(500.0));
    }
}