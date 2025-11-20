import java.util.Scanner;

/**
 * Write a description of class AusadhiPasal here.
 *
 * @author Pareena
 * @version v1.0
 */
public class AusadhiPasal
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ausadhi Pasal-Medicine Inventory");
        System.out.println("1.Paracetamol"); 
        System.out.println("2.Honitus");
        System.out.println("3.Aspirin");
        System.out.println("4.Betadine");
        System.out.println("Select your choice[1-4]:");
        int choice=scan.nextInt();
        scan.nextLine();
        if(choice==1)
        {
            System.out.println("Price of paracetamol is 20 per tablet");
        }
        else if(choice==2)
        {
            System.out.println("Price of honitus is 100 per tablet");
        }
        else if(choice==3)
        {
            System.out.println("Price of aspirin is 60 per tablet");
        }
        else if(choice==4)
        {
            System.out.println("Price of betadine is 200 per tablet");
        }
        else{
            System.out.println("The number doesn't not exist");
        }
    }
}