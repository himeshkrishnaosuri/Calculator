import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class sqrt {
    private static final Logger logger =  LogManager.getLogger(Calc.class);
    double sq_rt(double a){
        String s = String.valueOf(a);
        if(a >= 0 ) {
            logger.info("Square root of "+s);
            return Math.sqrt(a);
        }
        else{
            logger.error("Invalid square root of "+s);
            System.out.print("Please enter valid input");
            return -1;
        }
    }
}
