public class pro30 {
    public static void main(String args[]) {
        int a[][] = {{1,2,3} , {4,5,6} , {7,8,9,}};
        System.out.print("values of the 2D array :  \n");
        // using for-each loop to iterate through the 2D array
        for (int i = 0; i < 3; i++) {
            {
                for(int j = 0; j <3 ; j++) {
                    System.out.print(a[i][j] + "\t");
                }
            }
            System.out.print("\n");

        }
    }
    
}
