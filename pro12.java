import java.awt.SystemTray;
import java.util.*;
// this program is about area of triangle 

public class pro12 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        System.out.print("enter the bases of the triangle :");
        int b = cin.nextInt();
        System.out.print("enter the height of the triangle :");
        int h = cin.nextInt();
        double area = (b * h) * 0.5;
        System.out.print("area of triangle is :" + area);
    }
    
}
