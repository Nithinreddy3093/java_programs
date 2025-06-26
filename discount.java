import java.util.*;

public class discount {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        System.out.print("enter the total amount :");
        double total = cin.nextDouble();
        System.out.print("enter the dscount percentage :");
        double discount = cin.nextDouble();
        discount = (discount * total ) / 100;
        double totalamount = total - discount;
       // System.out.println("the total amount after discount is : " +totalamount);
       // System.out.print("total discount :" +discount);
       System.out.printf("Discount: %.2f\n", discount);
       System.out.printf("Final Amount: %.2f\n", totalamount);
    
    }
    
}
