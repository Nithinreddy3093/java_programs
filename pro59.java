import java.util.*;

class student {
    protected int sno;
    protected String sname;
    Scanner cin =  new Scanner(System.in);

    public void inputstd() {
        System.out.println("enter the student no :") ;
        sno = cin.nextInt();
        System.out.println("enter the student name :");
        sname = cin.next();
    }
}

class course extends student {
    protected int fee;
    protected String cname;

    public void inputcourse() {
        System.out.print("enter the coruse joined :");
        cname = cin.next();
        System.out.print("enter the course fee :");
        fee = cin.nextInt();
    }
    public void printdetails() {
        System.out.println("student no :" + sno);
        System.out.println("Student name :" + sname);
        System.out.println("Student course joined :" + cname);
        System.out.println("course fee :" + fee);
    }
}


public class pro59 {
    public static void main(String args[]) {
        course c = new course();
        c.inputstd();
        c.inputcourse();
        c.printdetails();
    }
    
}
