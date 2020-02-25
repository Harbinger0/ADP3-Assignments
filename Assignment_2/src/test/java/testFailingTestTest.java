import org.junit.Test;

import static org.junit.Assert.*;

public class testFailingTestTest {

    @Test
    public void getName() {
        testFailingTest t1 = new testFailingTest("Harbinger");
        testFailingTest t2 = new testFailingTest("Sam");
        assertEquals("Harbinger", t2.getName());
    }
}