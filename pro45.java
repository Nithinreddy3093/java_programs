
class Number {
    public void add (int a , int b) {
        System.out.println("sum of 2 int values :" +(a+b));

    }
    public void add (float x, float y) {
        System.out.println("sum of float values :" +(x+y));
    }
    public void add (long i , long j) {
        System.out.println("sum of 2 long values :" +(i+j));
    }
    public void add(double p, double q) {
        System.out.println("sum  of 2 double values :" +(p+q));
    }
    public void add (String s1 , String s2) {
        System.out.println("concatenate Strings ;" +(s1+s2));
    }
}

public class pro45 {
    // this program is for overloading 
    public static void main(String args[]) { // main method
        Number N = new Number();
        N.add(10,20);
        N.add(10.1f,202f);
        N.add(100L,200L);
        N.add(10.1,29.2);
        N.add("well","come");


    }
    
}
