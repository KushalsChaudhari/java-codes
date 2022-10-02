// import java.util.Scanner;     //import java scanner class
import java.util.*; 

public class java
{
   
    public static void main(String []args)
    {
    Scanner input=new Scanner(System.in);   //object of java scannner class
    
    
    System.out.println("enter string");
    String str =input.next();               //getting input
    System.out.println(str);                //output

    System.out.println("enter integer");
    int integer =input.nextInt();
    System.out.println(integer);

    System.out.println("enter double");
    double double_integer =input.nextDouble();
    System.out.println(double_integer);

    System.out.println("enter float");
    float float_integer =input.nextFloat();
    System.out.println(float_integer);

    input.close();                               //closing scanner object
}
}

