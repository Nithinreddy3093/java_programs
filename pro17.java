import java.util.*;

public class pro17 {

public static void main(String args[]){
    Scanner cin = new Scanner(System.in);
    System.out.print("enter the customer no :");
    int n = cin.nextInt();
    System.out.print("enter the customer name : ");
    String name = cin.next();
    System.out.print("enter the item name :");
    String item = cin.next();
    System.out.print("enter the number of items  paruchased :");
    int noi = cin.nextInt();
    int amt = 0;

    switch(item){
        case "apple":
        amt = noi * 10;
        break;
        case "bananna":
        amt = noi * 20;
        break;
        case "orange":
        amt = noi * 30;
        break;
        case "grapes":
        amt = noi * 40;
        break;
        case "mango":
        amt = noi * 50;
        break;
        default:
        System.out.print("item is not available in the shop");
        System.exit(0);
    }
    System.out.println("Customer no :" +n);
    System.out.println("Customer name : " +name );
    System.out.println("Item name : " + item);
    System.out.println("Number of items purchased :" + noi);
    System.out.println("Total amount to be paid :" + amt);

    
    }


}

