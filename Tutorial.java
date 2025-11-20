


/**
 * Write a description of class Tutorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tutorial
{
    int age; //instance variable
    static int qty; //static varable
    public static void main(String[] args){
        int n1=10; //local variable
        //Implicit Typecasting
        double dt=n1;
        System.out.println(dt);
        
        byte b=50;
        int i=b;
        System.out.println(i);
        
        int n2=2000;
        long ln=n2;
        System.out.println(ln);
        
        float ft=1332434556L;
        System.out.println(ft);
        
        char c='A';
        int chartoint=c;
        System.out.println(chartoint);
        
        //Explicit Typecasting
        double db=10.01;
        int itr=(int)db;
        System.out.println(itr);
        
        long b1=(byte)13;
        System.out.println(b1);
        
        //Finding min,max,size and bytes
        System.out.println(Byte.MAX_VALUE); //returns max value
        System.out.println(Byte.MIN_VALUE); //returns min value
        System.out.println(Byte.SIZE); //returns bits
        System.out.println(Byte.BYTES); //returns bytes
        
        //Escape Sequence
        System.out.println("Hello\nworld"); //new line
        System.out.println("Hamro\tNepal"); //tab
        System.out.println("Sofiya said \" Bye\" "); //Quotation
        
        //Unicode escape
        System.out.println("\u2764");
    }
}