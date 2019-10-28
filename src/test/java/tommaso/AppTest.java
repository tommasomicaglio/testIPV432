package tommaso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertEquals(App.ip_to_int32("0.0.0.0") , "0.0") ;

    }
    @Test
    public void shouldAnswerWithTrue1()
    {
        assertEquals(App.ip_to_int32("0.0.0.0") , "0.0") ;

    }
}
