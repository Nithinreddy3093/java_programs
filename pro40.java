import java.util.*;
 
class Number { // class definition
    private int i, n, f; // private data members
    Scanner cin = new Scanner(System.in);
    
    public void input() {
        System.out.print("enter the value :");
        n = cin.nextInt();

    }
    public int FindFact() { // method definition
        f = 1;
        for(i = 1; i <= n; i++) { // loop to calculate factorial
            f = f * i;
        }
        return f;
    }
}

public class pro40 {  //this program is used to find the factorial of a number
    public static void main(String args[]) {
        Number num = new Number();
        num.input();
        int r = num.FindFact();
        System.out.print("factorial value :" +r);
    }
    
}
