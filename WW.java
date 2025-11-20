
/**
 * Write a description of class WW here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WW
{
    int age; //instance variablee
    static int qty; //static variable
    public static void main(String[] args){
      int agr=10; // local variable
      System.out.println(agr);
      //<className> <variable>= new <className>();
      
      WW w1=new WW();
      
      System.out.println(w1.age);
      System.out.println(qty);
    }
}