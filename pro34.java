import java.util.*;
// this program is used to add two 3 x 3 matrices 
public class pro34 {
    public static void main(String args[]) {
        Scanner cin = new Scanner (System.in);
        int a[][] = new int[3][3]; // declaring a 3 x 3 matrix
        int b[][] = new int[3][3]; // declaring a 3 x 3 matrix
        int c[][] = new int[3][3]; // declaring a 3 x 3 matrix
        int i ,j;
        System.out.print("enter the 3 x 3 matrix elements ");
        for (i =0; i < 3; i++) {  // taking input for the first 3 x 3 matrix
            for (j= 0 ;j < 3; j++) {
                a[i][j] = cin.nextInt();
            }
        }
        System.out.print("enter the 3 x 3 matrix elements for b :");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) { //taking input for the second 3 x 3 matrix 
                b[i][j] = cin.nextInt();
            }
        }
        for (i = 0; i < 3; i++) { // adding the two matrices 
            for (j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b [i][j]; 
            }
        }
        System.out.print("sum of the matrix is :"); // printing the sum of the two matrices
        for (i =0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println(c[i][j] + "\t");
            }
             System.out.print("\n");
        }
       
    }
    
}
