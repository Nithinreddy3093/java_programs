class employee { // Define a class and named employee 
    private int eno , bsal; // 
    private String ename; // Define a private variable named ename of type String

    public void inputemp(int no , String name , int sal) {  // Define a method named inputemp with parameters 
        eno = no; // Assign the value of parameter no to the private variable
        ename = name;
        bsal = sal;
    }
    public void printemp() { // Define a method named printemp
        System.out.println("employee no " + eno);
        System.out.println("employee name " +ename);
        System.out.println("employee bsal " +bsal);
    }
}

public class pro39 {
    public static void main(String args[]) {
        employee e = new employee(); // Create an object of class employee named e
        e.inputemp(1,"ram", 5000); // Call the method inputemp of object e with parameters 1, "ram", 5000
        e.printemp();

    }

}