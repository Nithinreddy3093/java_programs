class person {
    private int pid,age;
    private String pname;


public person() {
    pid=10;
    pname = "Ram";
    age = 25;
    System.out.println("Constructor fired ");
}
public void printperson() {
    System.out.println("person id = "  +pid);
    System.out.println("person name = " +pname);
    System.out.println("person age = " +age);
}

}

public class pro47 { // example on constructor 
    public static void main(String args[]) {
        person p = new person();
        p.printperson();
    }
}
