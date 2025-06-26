import java.util.*;

class person { // class to represent a person
    // this class contains the details of a person 
    private int pid, age;  
    private String pname;
    Scanner cin = new Scanner(System.in);
    public void inputperson() { // method to take input for person details
        System.out.print("enter the person id :");
        pid = cin.nextInt();
        System.out.print("enter the person name :");
        cin.nextLine();
        pname = cin.nextLine();
        System.out.print("enter the person age :");
        age = cin.nextInt();
    }
    public void printperson() { // method to print person details
        System.out.println("person ID is :" + pid );
        System.out.println("person name is :" + pname );
        System.out.println("person age is :" + age );
        
    }

}

public class pro38 {
    // this program is used to take input for a person and print the details
    // of using a class person 
    public static void main(String args[]) {
        person p = new person(); // creating an object of person class
        p.inputperson(); // calling method to input person details
        p.printperson(); // calling method to print person details
    }
}