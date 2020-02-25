import org.junit.Test;

import static org.junit.Assert.*;

public class testObjectEqualityTest {

    @Test
    public void getName() throws Exception{
        testObjectEquality t1 = new testObjectEquality("Harbinger");
        testObjectEquality t2 = t1;
        assertEquals("Harbinger", t2.getName());
    }
}