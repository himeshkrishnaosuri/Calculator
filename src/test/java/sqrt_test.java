import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class sqrt_test {
    @Test
    public void valid_test(){
        sqrt res = new sqrt();
         System.out.print("Testing for 1024\n");
        assertEquals(res.sq_rt(1024),32.0,0.0);
    }
    @Test
    public void invalid_test(){
        sqrt res = new sqrt();
        System.out.print("Testing for -200\n");
        assertEquals(res.sq_rt(-200),-1,0.0);
    }

}
