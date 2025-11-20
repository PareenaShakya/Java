import java.util.Scanner;

/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author Pareena
 * @version v1.0
 */
public class WaterLevelMonitor
{
    public static void main (String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter water level");
        int waterlevel=scan.nextInt();
        String isValid=(waterlevel>=1000)?"Warning:water level has reached 1000L or more":"Water level hasn't reached 1000L";
        System.out.println(isValid);
    }
}