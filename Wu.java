import java.util.Scanner;

/**
 * Write a description of class Wu here.
 *
 * @author Pareena
 * @version v1.0
 */
public class Wu
{
    public static void main(String[] args)
    {
        /*
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first Number");
        int firstNum= scan.nextInt(); //for whole numbers
        System.out.println("Enter second Number");
        double secondNum= scan.nextDouble();//for decimal values
        System.out.println("My first Number is:"+ firstNum + secondNum);
        System.out.println("Enter your name");
        String name= scan.next();
        */
        
        //Ternery Operator
        int age=18;
        //Scanner input=new Scanner(System.in);
        //int age=input.nextInt();
        String isValid=(age>=18)?"Driving is allowed" : "Driving is not allowed";
        System.out.println(isValid);
    }
}