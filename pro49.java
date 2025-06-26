class box {
    private int l,b,h;
    public box(){
        l =10; b =5; h =3;
        System.out.println("constructor without arguments ");
    }
    public box(int k) {
        l=b=h=k;
        System.out.println("construcctor with one argument ");
    }
    public box(int l, int b, int h) {
        this.l = l; this.b = b; this.h = h;
        System.out.println("constructor with three arguments ");
    }
    public box(box ob) {
        l = ob.l; b=ob.b; h=ob.h;
        System.out.println("constructor with objects as arguments ");
    }

    public void findvolume() {
        System.out.println("volume of box " +(l*b*h));
    }
}


public class pro49 {
    public static void main(String args[]) {
        box b1 = new box(); // calling constructor without arguments 
        b1.findvolume();

        box b2 = new box(10); // calling constructor with one argument
        b2.findvolume();

        box b3 = new box(10,20,30); // calling constructor with three arguments
        b3.findvolume();

        box b4 = new box(b3); // calling constructor with objects as arguments
        b4.findvolume();
    }
    
}
