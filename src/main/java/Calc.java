
import java.util.Scanner;


public class Calc {
    public static void main(String[] args){
        double a,result;
        Scanner scan = new Scanner(System.in);
        int choice;
        do{
            System.out.print("1. Square root(x)\n");
            System.out.print("2. Factorial(x)\n") ;
            System.out.print("3. Log(x) base e\n");
            System.out.print("4. power(a,b)\n");
            System.out.print("5. exit\n");
            System.out.print("Select corresponding number to invoke the appropriate function : ") ;
            choice=scan.nextInt();
            switch (choice){
                case 1 : System.out.print("Enter number :");
                            a = scan.nextDouble();
                            sqrt res = new sqrt();
                            result=res.sq_rt(a);
                            System.out.print("Result = " + result+" \n");
                            break;
                case 2 : System.out.print("In factorial\n");
                            break;
                case 3 : System.out.print("In log\n");
                            break;
                case 4 : System.out.print("In power\n");
                            break;
                case 5 : System.out.print("Exiting\n");
                            System.exit(0);
            }
            System.out.print("\n ################################ \n");
        }
        while(true);

    }
}
