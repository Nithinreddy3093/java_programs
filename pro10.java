import java.util.*;

// read two values and add them 

public class pro10 {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        System.out.print("enter the first value:");
        int a = cin.nextInt();
        System.out.print("enter the second value:");
        int b = cin.nextInt();
        int sum = a + b;
        System.out.print("sum of the two values is :" + sum);

    }
}