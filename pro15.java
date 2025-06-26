import java.util.*;

public class pro15 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        System.out.print("enter the character :");
            char ch = cin.next().toLowerCase().charAt(0);
            if(ch >= '0' && ch <= '9') {
                System.out.print("given character is a digit");
                return;
            }
            if('a' > ch || ch > 'z') {
                System.out.print("given character is not an alphabet");
                return;
            }
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print("Given character is a vowel");
            } else {
                System.out.print("Given character is a consonant");
            }
        }
    }

