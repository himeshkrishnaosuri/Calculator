import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class loge {
    private static final Logger logger =  LogManager.getLogger(Calc.class);
    double log(double a){
        String s = String.valueOf(a);
        if(a > 0 ) {
            logger.info("[Log e] - "+s);
            return Math.log(a);
        }
        else{
            logger.error("[Log e] - "+s);
            System.out.print("Please enter valid input");
            return -1;
        }
    }
}
