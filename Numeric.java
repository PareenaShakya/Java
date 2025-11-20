import java.util.Scanner;

/**
 * Write a description of class Numeric here.
 *
 * @author (Pareena)
 * @version (v0.1)
 */
public class Numeric
{
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your grade");
    int grade=scan.nextInt();
        String isvalid=(grade>=40)?"Pass":"Fail";
        System.out.println(isvalid);
        
    }
}