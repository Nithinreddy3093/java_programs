// hirarchical structure 

import java.util.*;

class number {  
    protected int a, b;
    Scanner cin = new Scanner(System.in);
    public void input() {
        System.out.println("enter 2 int values :");
        a = cin.nextInt();
        b = cin.nextInt();
    }
}

class sum extends number  // child class
{
    public void findsum() { // method of child class 
        System.out.println("sum of two numbers is : " + (a + b));
    }
}

class product extends number { // child class
    public void findprod() { // method of child class
        System.out.println("product of two numbers is : " + (a * b));
    }
}

class difference extends number { // child class
    public void finddiff() { // method of child class
        System.out.println("difference of two numbers is : " + (a - b));
    }
}

public class pro61 { // main class
    public static  void main(String args[]) { 
        sum s= new sum(); // object of child class
        s.input(); // calling method of parent class
        s.findsum(); // calling method of child class

        product p = new product();
        p.input(); 
        p.findprod();

        difference d = new difference();
        d.input();
        d.finddiff();
    }
     
}
