
class number {
    private int no;
    private static int cou;
    public number() {
        no = ++cou;
    }
    public void print() {
        System.out.println("no value :" +no);
        System.out.println("count is :" +cou);
    }
}

public class pro50 { 
    public static void main(String args[]) {
        number p = new number();
        p.print();

        number q = new number();
        q.print();

        number r = new number();
        r.print();

        p.print();
        q.print();
        r.print();
    }
    
}
