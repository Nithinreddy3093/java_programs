import java.util.*;
public class pro32 {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int i,j;
        System.out.println("enter the 3 x 3 matriax elements :");
        for( i =0; i < 3; i++) {
            for( j =0 ; j< 3; j++){
              a[i][j] = cin.nextInt();
            }
        }
        for (i =0; i < 3 ;i++) {
            for (j =0 ; j < 3 ; j++) {
                b[j][i] = a[i][j];
            }
        }

        System.out.println("Transpose of the given matrix is :");
        for( i =0; i < 3; i++) {
            for( j =0 ; j < 3; j++){
                System.out.print(b[i][j] + "\t");
            }
            System.out.print("\n");
        }

    }
}