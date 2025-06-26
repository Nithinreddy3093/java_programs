import java.util.*;
// this program is used to take input of a 3x3 matrix and print the values of the array
public class pro31 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int a[][] = new int[3][3];
        int i , j;
        System.out.println("enter 3 x 3 matrix elements :"); // taking input for 3x3 matrix 
        for  (i =0 ; i < 3; i++) { // loop for rows 
            for (j = 0; j < 3; j++){ 
                a[i][j] = cin.nextInt();
            }
            
        }
        System.out.println("values of the array : "); // printing the values of the array
        // using nested for loop to iterate through the 2D array
        for(i =0; i <3; i++) { 
            for(j =0 ; j<3; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }
        
    }

}