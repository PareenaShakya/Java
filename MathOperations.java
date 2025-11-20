
/**
 * Write a description of class MathOperations here.
 *
 * @author (Pareena)
 * @version (v1.0)
 */
public class MathOperations
{
    public static void main(String[] args){
        //Arithmetic
        int a=10;
        int b=20;
        int c=a+b;
        int d=b-a;
        int e=a*b;
        int f=b/a;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        
        //Relational
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        
        //Unary(Post and pre increment)
        System.out.println(a++); //post
        System.out.println(++a); //pre
        System.out.println(b--);
        System.out.println(--b);
        
        //Logical
        int g=40;
        int h=50;
        int i=60;
        if(g>h && i>g)
            System.out.println("g is greatest number");
        else if(i>g || i>h)
            System.out.println("i is greatest number");
        
        //Ternary
        int age=18;
        String isvalid=(age>=18)?"Driving is allowed":"Driving is not allowed";
        System.out.println(isvalid);
    }
}