import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class DisablingTestTest {

    @Test
    public void getName() {
        DisablingTest t1 = new DisablingTest("Harbinger");
        DisablingTest t2 = new DisablingTest("Sam");
        assertEquals("Sam", t2.getName());
    }
    @Ignore
    @Test
    public void getName2() throws InterruptedException {
        DisablingTest t1 = new DisablingTest("Chaos");
        DisablingTest t2 = new DisablingTest("Burt");
        assertEquals("Burt", t2.getName());
        assertEquals("Chaos", t1.getName());
    }
}