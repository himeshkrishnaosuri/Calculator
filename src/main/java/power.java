import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class power {
    private static final Logger logger =  LogManager.getLogger(Calc.class);
    double raise(double a){
        String s = String.valueOf(a);
        logger.info("[Power 10] - "+s);
        return Math.pow(a,10);
    }
}
