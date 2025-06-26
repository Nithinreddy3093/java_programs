public class pro36 {
    public static void main(String arg[]) {
        int a[][] = new int[3][];
        a[0] = new int[3];
        a[1] = new int[4];
        a[2] = new int[5];
        System.out.println("no of rows in the array is : " + a.length );
        for( int i = 0 ; i < a.length; i++) {
           for( int j = 0; j < 3 ; j++) {
            System.out.println(i + "rows length is : " + a[i].length );
           }
        }
    }
    
}
