class person {
    private int pid,age;
    private String pname;
    
    public person(int pid , String pname , int age) { // constructor with arguments
        this.pid = pid;
        this.pname = pname;
        this.age = age;
        System.out.println("constructor fired ");
    }
    public void printperson() {
        System.out.println("person id is :" +pid);
        System.out.println("person name is :" +pname);
        System.out.println("person age is :" +age );
    }
}

public class pro48 {  // example on constructor with arguments
    public static void main(String args[]) {
        person p = new person(1, "ram " , 22);
        p.printperson();
    }
}
