import java.util.*;

class number {
    protected int a,b;
    Scanner cin = new Scanner(System.in);

    public void input() {
        System.out.println("enter 2 int values :");
        a = cin.nextInt();
        b = cin.nextInt();
    }
}
class sum extends number {
    public void add() {
        System.out.println("sum of values :" +(a+b));
    }
}



public class pro58 {

    public static void main(String args[]) {
        sum s = new sum();
        s.input();
        s.add();
    }
    
}
