package ross.goncharuk;


public class Final {
    public void test (int a){
        // final int a cannot be re-assigned, therefore method parameter (final int a) changed to (int a)
        a = a*a;
        System.out.println(a);
    }
}
