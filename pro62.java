// example on overriding

import java.util.*;

class number { // class definition
    protected int a,b; 
    Scanner cin = new Scanner(System.in); 

    public void input() { // method definition
        System.out.println("enter two int values :");
        a = cin.nextInt();
        b = cin.nextInt();
    }
    public void findresult() { // method definition
        System.out.println("sum of values :" + (a+b));
    }
}

class sum extends number { // class definition
    public void findresult() { // method definition
        System.out.println("sum of values :" + (a+b));
    }
}

class product extends number { // class definition
    public void findresult() {
        super.findresult();
        System.out.println("product of values :" + (a*b));
}
}

public class pro62 {
    public static void main(String args[]) {
        product p = new product();
        p.input();
        p.findresult();
    }
    
}
