import java.util.*;
// this program prints the name of the digit entered by the user from 1  to 9 

public class pro19 {
    public static void main(String args[] ){
        Scanner cin = new Scanner(System.in);
        System.out.print("enter the digit from [1-9] :");
        int n = cin.nextInt();
        switch (n) {
            case 1:
                System.out.println("you entered the number one");
                break;
            case 2:
                System.out.println("you entered the number two");
                break;
            case 3:
                System.out.println("you entered the number three");
                break;
            case 4:
                System.out.println("you entered the number four");
                break;
            case 5:
                System.out.println("you entered the number five");
                break;
            case 6:
                System.out.println("you entered the number six");
                break;
            case 7:
                System.out.println("you entered the number seven");
                break;
            case 8:
                System.out.println("you entered the number eight");
                break;
                default:
                System.out.println("Invalid input, please enter a digit from 1 to 9.");
                break;
           
        }

    }
    
}
