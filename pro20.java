import java.util.*;
// this program is used to find the number of days in a month

public class pro20 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter the month number from [1-12] : ");
        int month = cin.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print(" 31 days ");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
               System.out.print(" 30 days");
               break;
            case 2 :
            System.out.print("enter the year :");
            int year = cin.nextInt();
            if( year%4==0)
            {
                System.out.print(" 29 days (leap year)");
                break;
            }
            else {
                System.out.print("28 days (non leap year)");
                break;
            }
            default :
                System.out.println("Invalid month number, please enter a number from 1 to 12.");
                break;
            }
                
    }

}