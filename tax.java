// this program is for checking tax eligibility
    // Given an employee’s salary, check if they must pay tax (threshold: ₹3L).


import java.util.*;

public class tax {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        System.out.print("enter the name :");
        String name = cin.nextLine();
        System.out.print("enter the salary :");
        int salary = cin.nextInt();
        if (salary > 30000) {
            System.out.println(name + " must pay tax");
        }
        else {
            System.out.println(name +" is not eligible for tax");
        }

    }
    
    
}
