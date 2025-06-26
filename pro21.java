import java.util.*;
// this program gives about whether the number is even or odd using switch statement
public class pro21 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = cin.nextInt();
       
        if (n < 0) {
            System.out.print(" this is a negative number ");
            n = n * -1; // Convert to positive for further checks
        } else if (n == 0) {
            System.out.print(" the number is zero ");
                }else {
                    System.out.print(" this is a postive number ");
                }
                System.out.print("and The number " + n + " is ");
                // Using switch statement to check if the number is even or odd
                switch(n % 2) {
                    case 0:
                        System.out.println("even");
                        break;
                    default :
                        System.out.println(" odd");
                        break;
                }
            }
        }

    
    

