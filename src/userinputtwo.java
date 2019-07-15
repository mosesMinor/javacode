import java.util.Scanner;

public class userinputtwo {
    public static void main(String[] args) {
        Scanner ingiza;
        Double x,y,jibu;
        //Instantiate your scanner
        ingiza=new Scanner(System.in);


        // Get data from the user using the scanner
        System.out.println("Enter the value for x");
        x=ingiza.nextDouble();


        if (x instanceof Double){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


        System.out.println("Enter the value for y");
        y=ingiza.nextDouble();


        //finally calculate your answer using received values

        jibu =x+y;
        System.out.println("your total is "+jibu);
    }
}
