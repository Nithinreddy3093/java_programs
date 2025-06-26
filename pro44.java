class employee { // Define a class and named employee 
    private int eno , bsal; // 
    private String ename; // Define a private variable named ename of type String

    public void inputemp(int eno , String ename , int bsal) {  // Define a method named inputemp with parameters 
        this.eno = eno; // Assign the value of parameter no to the private variable
        this.ename = ename;
        this.bsal = bsal;
    }
    public employee printemp() { // Define a method named printemp
        System.out.println("employee no " + eno);
        System.out.println("employee name " +ename);
        System.out.println("employee bsal " +bsal);
        return this;
    }
}

public class pro44 {
    public static void main(String args[]) {
        employee e = new employee(); // Create an object of class employee named e
        e.inputemp(1,"ram", 5000); // Call the method inputemp of object e with parameters 1, "ram", 5000
        employee ob = e.printemp();
        ob.printemp();

    }

}