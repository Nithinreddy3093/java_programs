import java.util.Scanner;
public class sign {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter rows: ");
 int N = sc.nextInt();
 int sign = 1;
 for (int row = 1; row <= N; row++) {
 for (int col = 1; col <= row; col++) {
 System.out.print(sign * (col * col) + " ");
 sign *= -1;
 }
 System.out.println();
 }
 }
}