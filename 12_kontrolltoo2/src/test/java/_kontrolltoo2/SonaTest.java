package _kontrolltoo2;

import org.junit.*;
import static org.junit.Assert.*;

public class SonaTest{
    Taht taht;
    Lause lause=new Lause();
    
    @Before public void alustus(){
        taht=new Sona();       
    }
    @Test public void testTahtedeArv(){
        String sona=taht.sona();
        assertEquals("pere", sona);
        assertEquals(0, taht.tahtedeArv('a'));
        assertEquals(1, taht.tahtedeArv('p'));
        assertEquals(2, taht.tahtedeArv('e'));
    }
    @Test public void testSonadeArv(){
        assertEquals(3, taht.sonadeArv());
    }

    @Test public void testSonadeArv2(){
        assertEquals(5, lause.sonadeArv());
    }

    @Test public void testATahed(){
        assertEquals(7, lause.aTahed());
    }
}