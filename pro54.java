// example on static block 

class employee 
{
    private int eno,bsal;
    private String ename;
    private static int bonus;

    public employee(int eno, String ename , int bsal) {
        this.eno = eno;
        this.ename = ename;
        this.bsal = bsal;
        System.out.println("constructor fired");  // prints constructor fired
    }
    static { // static block
        bonus = 5000;
        System.out.println("static block fired ");
    }

    public void printemp() {
        System.out.println("employee no :" +eno);
        System.out.println("employee name :" +ename);
        System.out.println("employee bsal :" +bsal);
        System.out.println("employee bonus :" +bonus);
    }
}


public class pro54 {
    public static void main(String args[]) {
        employee e1 = new employee(1,"ram",3000);
        e1.printemp();
        employee e2 = new employee(2,"vani ",2000);
        e2.printemp();
    }
    
}
