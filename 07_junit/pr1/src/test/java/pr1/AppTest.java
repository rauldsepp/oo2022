package pr1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testKorrutus(){
        assertEquals(6, App.korrutaKahega(3));
    }
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
