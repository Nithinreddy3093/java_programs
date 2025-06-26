import java.util.*;
// this program is used to calculate the total marks and grade of a student 
public class pro18 {
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter the student roll number :");
        int rollNo = cin.nextInt();
        System.out.print("Enter the student name :");
        String name = cin.next();
        System.out.print("entet the subject name :");
        String subject = cin.next();
        System.out.print("enter the marks obtained in 3 subjects :");
        int m1 = cin.nextInt();
        int m2 = cin.nextInt();
        int m3 = cin.nextInt();
        int tot = m1 + m2 + m3;
        float avg = (float)tot / 3;
        String grade = " ";
        if (m1 >= 34  && m2 >= 34 && m3 >= 34) {
            if (avg >= 90 ) {
                grade = "A+";
            } else if (avg >= 80) 
                grade = "A";
             else if (avg > 70 )
                grade = "B+";
            
            else if (avg >= 60) 
                grade = "B";
            
            else if (avg >= 50) 
                grade = "c";
            
            else if(avg >= 40) 
                grade = "D";
            else {
                grade = "F";
            }
        
            }
            else {
                grade = "F";
            }
            System.out.println("student roll number :" + rollNo);
            System.out.println("student name :" + name);
            System.out.println("subject name :" +subject);
            System.out.println("total marks obtained by student : " +tot);
            System.out.println("average marks obtained by student : " +avg);
            System.out.println("grade obtained by student : " +grade);
            }
            }
        


