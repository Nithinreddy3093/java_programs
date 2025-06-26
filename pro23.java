import java.util.*;
 // this program calculates the factorial of a number
public class pro23 { 
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = cin.nextInt();
        long factorial = 1;
        for (int i = 1; i <=n ; i++) {
            factorial *= i; 
        }
        System.out.println("the factorial of " + n + " is " + factorial);
    }
}