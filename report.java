import java.util.Scanner;

public class report {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.println("Enter marks in 3 subjects:");
        int sub1 = scanner.nextInt();
        int sub2 = scanner.nextInt();
        int sub3 = scanner.nextInt();

        int total = sub1 + sub2 + sub3;
        double average = total / 3.0;

        // Output
        System.out.println("\n--- Report Card ---");
        System.out.println("Name     : " + name);
        System.out.println("Total    : " + total);
        System.out.println("Average  : " + average);

        // Classification using nested if
        if (sub1 >= 35 && sub2 >= 35 && sub3 >= 35) {
            if (average >= 60) {
                System.out.println("Class    : 1st Class");
            } else {
                if (average >= 50) {
                    System.out.println("Class    : 2nd Class");
                } else if (average >= 35) {
                    System.out.println("Class    : Pass Class");
                } else {
                    System.out.println("Class    : Fail");
                }
            }
        } else {
            System.out.println("Class    : Fail (one or more subjects below 35)");
        }

        scanner.close();
    }
}
