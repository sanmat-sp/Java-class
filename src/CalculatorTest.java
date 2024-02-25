import junit.framework.TestCase;

import static org.junit.Assert.*;

public class CalculatorTest extends TestCase {
    Calculator c;

    @Override
    protected void setUp() throws Exception{
        super.setUp();
        System.out.println("Setting up env for testing");
        c=new Calculator();
    }

    @org.junit.Test
    public void add(){
        int e=40;
        int a=c.add(10,20);
        System.out.println("Expected = "+e+", Actual = "+a);
        assertEquals(e,a);
    }

    public void teatMultiplication(){
        int e=20;
        int a=c.multiply(5,4);
        System.out.println("Expected = "+e+", Actual = "+a);
        assertEquals(e,a);
    }

    @Override
    protected void tearDown() throws Exception{
        super.tearDown();
        System.out.println("Done with testing, now winding up");
    }
}
