
import java.util.*;
//

public class pro22 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = cin.nextInt();
        int s = 0, a;
        if (n < 0) {
            System.out.print("this is a negetive number ");
        }
        else if (n == 0) {
            System.out.print("this nuber is zero ");
        }
        else {
            System.out.print("this is a positive number ");
            if (n < 9) {
                System.out.print("and the number is single digit ");
            }
               else if (n < 100) {
                System.out.print("and the number is double digit ");
               } else if (n < 1000) {
                System.out.print("and the number is triple digit");
               } else {
                System.out.print("and the number is more than three digits");
               }
                   }
            // Calculate sum of digits only for positive numbers
            if (n > 0) {
                while (n > 0) {
                    a = n % 10;
                    s = s + a;
                    n = n / 10;
                }
                System.out.print("and the sum of the digits is " + s);
            }
        }
    }


