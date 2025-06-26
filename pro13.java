import java.util.Scanner;
// this is program is about abslute value of a number

public class pro13 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        System.out.print("enter the value :");
        int n = cin.nextInt();
        if(n < 0) 
        {
            n = n* -1;
        }
        System.out.print("absolute value is :" + n);
        }
    }
    
