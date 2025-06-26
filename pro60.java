import java.util.*;

// multilevel inheritance example
class student {
    protected int sno;
    protected String sname;
    Scanner cin = new Scanner(System.in);

    public void inputstd() {
        System.out.println("enter the student no :");
        sno = cin.nextInt();
        System.out.println("enter the student name :");
        sname = cin.next();
    }
}

class course extends student {
    protected int fee;
    protected String cname;

    public void inputcourse() {
        System.out.println("enter the course joined :");
        cname = cin.next();
        System.out.print("enter the  course fee :");
        fee = cin.nextInt();
    }
}

class marks extends course  {
    private int m1, m2, m3, tot;
    private float ave;

    public void inputmarks() {
        System.out.println("enter 3 subjects marks :");
        m1 = cin.nextInt();
        m2 = cin.nextInt();
        m3 = cin.nextInt();
    }

    public void compute() {
        tot = m1 + m2 + m3;
        ave = (float) tot / 3;
    }

    public void printdetails() {
        System.out.println("student course joined :" + cname);
        System.out.println("student no :" + sno);
        System.out.println("student name :" + sname);
        System.out.println("course fee :" + fee);
        System.out.println("total marks :" + tot);
        System.out.println("average marks :" + ave);
    }
}



public class pro60 {
    
    public static void main(String args[]) {
        marks m = new marks();
        m.inputstd();
        m.inputcourse();
        m.inputmarks();
        m.compute();
        m.printdetails();
    }
    }

