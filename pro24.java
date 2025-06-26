import java.util.*;
//this program is about fabonacci series 
/*public class pro24 {
    
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = cin.nextInt();
        int first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next  = first + second ;
            first = second;
            second = next;
            
        }
    }
    
} */

// lets do with do while loop

public class pro24 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = cin.nextInt();
        int first = 0; int second = 1;
        int i = 1;
        System.out.print("fabonacci series upto " + n +" terms:" );
        do { 
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
            i ++;

        } while (i <= n);
    }
}
