
class box {

    private int l,b,h;
    public void input() {
        l=10; b =5; h = 3;
        System.out.println("method without arguments ");
    }
    public void input(int k) {
        l=b=h=k;
        System.out.println("method with one argument ");
    }
    public void input(int l, int b, int h) {
        this.l=1 ; this.b=b; this.h=h;
        System.out.println("emthod with 3 arguments ");
    }
    public void input(box ob) {
        l=ob.l; b=ob.b; h = ob.h;
        System.out.println("method with objects as arguments ");
    }
    public void findvolume() {
        System.out.println("volume of the box :" +(l*b*h));
    }
}

public class pro46 {
    public static void main(String args[]) {
        box b1 = new box();
        b1.input();
        b1.findvolume();
        b1.input(10);
        b1.findvolume();
        b1.input(10,20,30);
        b1.findvolume();

        box b2 = new box();
        b2.input(b1);
        b2.findvolume();
    }
    
}
