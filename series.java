import java.util.Scanner;
public class series {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter N: ");
 int N = sc.nextInt();
 for (int i = 1; i * i <= N; i++)
 System.out.print(i * i + " ");
 }
}