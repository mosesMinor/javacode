public class datatypeconversiontwo {
    public static void main(String[] args) {
        String x,y;
        Double xConv,yConv,jibu ;

        x="10";
        y="20";

        //convert x and y to double values

        xConv= Double.parseDouble(x);
        yConv= Double.parseDouble(y);

        jibu = xConv* yConv;
        System.out.println(jibu);
    }
}
