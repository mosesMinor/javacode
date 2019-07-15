public class javatypeconversionthree {
    public static void main(String[] args) {

        Double a,b;
        Integer x,y;
        String aConv,bConv,xConv,yConv;

        a=10.0;
        b=20.5;
        x=20;
        y=30;

        //convert a and b to string values
        aConv = String.valueOf(a);
        bConv = String.valueOf(b);

        //convert x and y to string values
        xConv = String.valueOf(x);
        yConv = String.valueOf(y);

        System.out.println(x+y);
        System.out.println(xConv+yConv);
    }
}
