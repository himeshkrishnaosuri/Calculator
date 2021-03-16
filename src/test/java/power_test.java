import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class power_test {
    @Test
    public void valid_test(){
        power res = new power();
        System.out.print("Testing for 2\n");
        assertEquals(res.raise(2),1024,0.0);
    }
}
