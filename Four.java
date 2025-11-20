import java.util.Scanner;

/**
 * Write a description of class Four here.
 *
 * @author Pareena
 * @version v1.0
 */
public class Four
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter student's name:");
        String name=scan.next();
        System.out.println("Enter age:");
        int age=scan.nextInt();
        System.out.println("Enter GPA:");
        double GPA= scan.nextDouble();
    }
}