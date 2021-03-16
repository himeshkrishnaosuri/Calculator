import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class fact {
    private static final Logger logger =  LogManager.getLogger(Calc.class);
    int result=1;
    int factorial(int a){
        String s = String.valueOf(a);
        if(a>=0){
            logger.info("[Factorial] - "+s);
            if(a ==0 | a==1){
                return 1;
            }
            else{
                for(int i=1;i<=a;i=i+1){
                    result=result*i;
                }
                return result;
            }
        }
        else{
            logger.error("[Factorial] - "+s);
            System.out.print("Please enter valid input");
            return -1;
        }
    }
}
