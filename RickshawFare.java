import java.util.Scanner;

/**
 * Write a description of class RickshawFare here.
 *
 * @author (Pareena)
 * @version (v1.0)
 */
public class RickshawFare
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double basicfare=50;
        double perkm=15;
        double permin=1;
        double localdis=0.20;
        double nightsurcharge=0.45;
        System.out.println("Enter distance in km");
        double distance=scan.nextDouble();
        System.out.println("Enter time in min");
        double time=scan.nextDouble();
        System.out.print("Is the customer local? (y/n): ");
        String islocal = scan.next();
        System.out.print("Is it night time? (y/n): ");
        String isnight = scan.next();

        double fare= basicfare+(distance*perkm)+(time*permin);
        fare=(islocal.equals("y") && distance >= 10)? fare-(fare*localdis):fare;
        fare=(isnight.equals("y") && distance >= 10)? fare+(fare*nightsurcharge):fare;
        
        System.out.println("\nFinal Rickshaw Fare: Rs. " + (int)fare);
        
    }
}