import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class loge_test {
    @Test
    public void valid_test(){
        loge res = new loge();
        System.out.print("Testing for 10\n");
        assertEquals(res.log(10),2.3,0.1);
    }
    @Test
    public void invalid_test(){
        loge res = new loge();
        System.out.print("Testing for -200\n");
        assertEquals(res.log(-200),-1,0.0);
    }
}
