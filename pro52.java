// example on static memeber data members and static function inside main class

import java.util.*;
public class pro52 {

    class person {
    private static int pid,age;  // static variables
    private static String pname;

    public static void inputperson() { // static method
        Scanner cin = new Scanner(System.in);
        System.out.print("enter the person id :");
        pid = cin.nextInt();
        System.out.print("enter the person name :");
        pname = cin.next();
        System.out.print("enter the person age :");
        age = cin.nextInt();
    }
    public static void printperson() { 
        System.out.println("person id :" +pid);
        System.out.println("person name :" +pname);
        System.out.println("person age :" +age);
    }
}

 public static void main(String args[]) {
        person.inputperson();
        person.printperson();
    }
    
}
