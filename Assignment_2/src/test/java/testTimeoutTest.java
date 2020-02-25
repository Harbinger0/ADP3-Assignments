import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class testTimeoutTest {
    @Test
    public void getName() {
        testTimeout t1 = new testTimeout("Harbinger");
        testTimeout t2 = new testTimeout("Sam");
        assertEquals("Sam", t2.getName());
    }
    @Test(timeout = 1000)
    public void getName2() throws InterruptedException {
        testTimeout t1 = new testTimeout("Chaos");
        testTimeout t2 = new testTimeout("Burt");
        assertEquals("Burt", t2.getName());
        assertEquals("Chaos", t1.getName());
        Thread.currentThread().sleep(2000);
    }

}