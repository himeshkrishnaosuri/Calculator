import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class fact_test {
    @Test
    public void valid_test_1(){
        fact res = new fact();
        System.out.print("Testing for 10\n");
        assertEquals(res.factorial(10),3628800,0.0);
    }
    @Test
    public void valid_test_2(){
        fact res = new fact();
        System.out.print("Testing for 0\n");
        assertEquals(res.factorial(0),1,0.0);
    }
    @Test
    public void invalid_test(){
        fact res = new fact();
        System.out.print("Testing for -200\n");
        assertEquals(res.factorial(-200),-1,0.0);
    }
}
