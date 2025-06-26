import java.util.*;
// this program is for calculating simple intrest 
public class simpleintrest {
    public static void main(String args[]) { 
        Scanner cin = new Scanner(System.in);
        System.out.print("enter the principle amount :");
        double principle = cin.nextDouble();
        System.out.print("enter the rate of the amount :");
        double rate = cin.nextDouble();
        System.out.print("enter the time :");
        double time = cin.nextDouble();

        double intrest = (principle * rate * time) / 100; // calculating intrest 
        double total = principle + intrest; // calculating total 
        System.out.printf("intrest:%.2f\n",intrest);
        System.out.printf("total:%.2f\n" ,total);
    }
    
}
