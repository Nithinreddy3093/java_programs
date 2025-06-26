import java.util.*;


public class evenodd {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("ente the number :");
        int num =  cin.nextInt();
    
   /*     if (num % 2 == 0) {
            System.out.println(num + " is even");
        }
        else  {
            System.out.println(num + " is odd");
        }
          

} */
System.out.println(num % 2 == 0 ? "Even" : "Odd");
}
}

