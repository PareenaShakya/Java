import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author Pareena
 * @version v1.0
 */
public class Calculator
{
    public static void main(String[] args)
{
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter first Number");
    int firstNum= scan.nextInt(); 
    System.out.println("My firstNum is:"+ firstNum);
    System.out.println("Enter second Number");
    int secondNum= scan.nextInt();
    System.out.println("My firstNum is:"+ secondNum);
}

}