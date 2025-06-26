import java.util.*;
//read boolean and string values

public class pro9 {
    public static void main(String args[]) {
        Scanner cin = new Scanner (System.in);
        System.out.print("enter the boolean value :");
        boolean q = cin.nextBoolean();
        System.out.print("enter the string :");
        String s1 = cin.next();
        System.out.print("Enter the string vwith spaces :");
        cin.nextLine();
        String s2 = cin.nextLine();
        System.out.println("boolean value :" + q);
        System.out.println("String value :" + s1);
        System.out.println("String with spaces : " + s2);
    }

    
}
