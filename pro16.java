import java.util.*;
// this program is about is this single digit or double digit or triple digit number
public class pro16 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = cin.nextInt();
                if(n < 0) {
                    System.out.print("negetive number ");
                    n = n * -1;
                }
                else {
                    System.out.print("Positive number ");
                }
                if(n <= 9 ) {
                    System.out.print("and it is a single digit number ");
                }
                else if (n <= 99) 
                    System.out.print("and it is a double digit number");
                
                else if (n <= 999) 
                    System.out.print("and it is a triple digit number ");
                
                else 
                    System.out.print("it is a multiple digit number ");
                }
            }
        
    
