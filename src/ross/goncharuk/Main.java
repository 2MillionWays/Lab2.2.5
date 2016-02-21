package ross.goncharuk;


public class Main {
    public static void main(String[] args) {

        int a = 4;
        int b = 5;
        int c = 6;
        int d = 7;

        A rect = new A();
        double rectangularTri = rect.calcSquare(a,b);
        double testRectangle = rect.calcSquare(a,b,c);

        A foursquare = new A();
        double fourSqr = foursquare.calcSquare(a,b,c,d);

        A circle = new A();
        double circleSqr = circle.calcSquare(a);

        Final a1 = new Final();
        a1.test(b);
    }
}
