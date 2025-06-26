//find the lcm and gcd of given values 
import java.util.*;

public class pro26 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        System.out.print("enter 2 int values :");
        int a = cin.nextInt();
        int b = cin.nextInt();
        int lcm , r , p; 
        p = a * b; //initially p is the product of a and b 
        do {  //loop will run until p is divisible by a and b
            r = a % b; //remainder of a divided by b
            a = b ; //a is now b
            b = r; //b is now remainder of a divided by b 
        } while (r > 0 ); //loop will run until remainder is 0
        lcm = p / a;
        System.out.println("the gcd of the given values " +a);
        System.out.print("the lcm of the given values " + lcm);
    }
}