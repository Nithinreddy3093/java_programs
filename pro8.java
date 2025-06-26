import java.util.*;
// this is a where we are importing the scanner class from the java.util package
// read long , double , short, and byte values and print the valus of the variables.

public class pro8 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        System.out.print("enter the long value :");
        long b = cin.nextLong();
        System.out.print("enter the double value :");
        double y = cin.nextDouble();
        System.out.print("enter the short value :");
        short p = cin.nextShort();
        System.out.print("enter the byete values :");
        byte n = cin.nextByte();
        
        System.out.println("long value :" +b);
        System.out.println("double value :" +y);
        System.out.println("short value :" +p);
        System.out.println("short value :" +n);


    }
    
}
