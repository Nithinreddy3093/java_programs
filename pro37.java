import java.util.*;

public class pro37 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);

        int a[][] = new int[5][3]; // initializing with 3 columns
        int b[][] = new int[3][3]; // 3x3
        int C[][] = new int[4][3]; // 4x3

        int i, j;
        for (i = 0; i < a.length; i++) {
            System.out.print("Enter 3 values for row " + i + " of array a: ");
            for (j = 0; j < a[i].length; j++) {
                a[i][j] = cin.nextInt();
            }
            if (i < b.length) {
                System.out.print("Enter 3 values for row " + i + " of array b: ");
                for (j = 0; j < b[i].length; j++) {
                    b[i][j] = cin.nextInt();
                }
            }
            if (i < C.length) {
                System.out.print("Enter 3 values for row " + i + " of array C: ");
                for (j = 0; j < C[i].length; j++) {
                    C[i][j] = cin.nextInt();
                }
            }
        }

        System.out.println("Values of array a:");
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
