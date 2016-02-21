package ross.goncharuk;


public class A {
    public int calcSquare(int a, int b){

        //method for calculation of square of rectangular triangle only
        int rectangleSqr =(a*b)/2;
        System.out.println(rectangleSqr);
        return rectangleSqr;
    }
    public double calcSquare(double a, double b,double c){

        //method for any triangle - Heron's formula
        double p = (a+b+c)/2;
        double s = p*(p-a)*(p-b)*(p-c);

        double rectangleSqr = Math.sqrt(s);
        System.out.println(rectangleSqr);
        return rectangleSqr;
    }
    public double calcSquare(double a, double b, double c, double d){

        //method for calculation of square of foursquare
        double p = (a+b+c+d)/2;
        double s = (p-a)*(p-b)*(p-c)*(p-d);

        double foursquareSqr = Math.sqrt(s);
        System.out.println(foursquareSqr);
        return foursquareSqr;
    }
    public double calcSquare(double a){

        //method for calculation of square of circle
        double circleSqr = 3.141592*(a*a);
        System.out.println(circleSqr);
        return circleSqr;
    }
}
