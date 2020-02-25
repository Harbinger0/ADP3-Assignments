import org.junit.Test;

import static org.junit.Assert.*;

public class testObjectIdentityTest {

    @Test
    public void getName(){
        testObjectIdentity t1 = new testObjectIdentity("Shaheed");
        testObjectIdentity t2 = t1;
        assertSame(t1, t2);
    }
}