import java.util.Scanner;
public class fab {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter rows: ");
 int N = sc.nextInt();
 int a = 1, b = 1;
 for (int row = 1; row <= N; row++) {
 for (int col = 1; col <= row; col++) {
 System.out.print(a + " ");
 int next = a + b;
 a = b;
 b = next;
 }
 System.out.println();
 }
 }
}