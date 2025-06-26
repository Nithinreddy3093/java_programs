// example on static memeber data members and static function inside main class

import java.util.*;   

public class pro53 {

    
    private int pid,age;  // static variables
    private  String pname;
    Scanner cin = new Scanner(System.in);

    public  void inputperson() { // static method
        
        System.out.print("enter the person id :");
        pid = cin.nextInt();
        System.out.print("enter the person name :");
        pname = cin.next();
        System.out.print("enter the person age :");
        age = cin.nextInt();
    }
    public  void printperson() { 
        System.out.println("person id :" +pid);
        System.out.println("person name :" +pname);
        System.out.println("person age :" +age);
    }
public static void main(String args[]) {
    pro53 p = new pro53();
    p.inputperson();
    p.printperson();
}
}
    
