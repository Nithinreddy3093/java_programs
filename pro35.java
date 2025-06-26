public class pro35 {
    public static void main(String args[]) {
    
    part1:
    for (int i = 0 ; i < 3; i++) {
        for (int j = 0 ; j < 3; j++) {
            if(i == 4) // this is just an example condition to break the loop 
                break part1; 
            System.out.print(j + " ");

        }
        System.out.println("\n");
    }
    
}
}
