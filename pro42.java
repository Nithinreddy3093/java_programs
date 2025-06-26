import java.util.*;
 
class  Number {
    private int a,b;
    Scanner cin = new Scanner(System.in);
    public void input() {
        System.out.println("enter 2 int values :"); 
        a = cin.nextInt();
        b = cin .nextInt();
    }
    public void print() {
        System.out.println("a =" + a + "\t  b =" + b); // print a and b
    } 
    public void add(Number n1, Number n2) { // add two numbers
        a = n1.a + n2.a;
        b = n1.b + n2.b;
    }

}

public class pro42 {
    // methods taking objects as arguments 
    public static void main(String args[]) { // main method 
        Number p = new Number();
        Number q = new Number();
        Number r = new Number();
        p.input();
        q.input();
        r.add(p,q);
        p.print();
        q.print();
        System.out.println("=============="); // print a line
        r.print();
    }
}
