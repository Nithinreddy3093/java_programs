import java.util.*;
//this program checks whether a number is prime or not 
public class pro25 {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        System.out.print("enter the  number :");
        int n = cin.nextInt();
        for (int i = 2; i <=n/2; i++ ){
            if(n % i== 0) {
                System.out.print(n + " is a composite number ");
                break;
            }
            else {
        System.out.print(n +" is a prime number ");
        break;
        }
        }
        
    }
    
}
