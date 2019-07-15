import java.util.Scanner;

public class Simpleinterestuserinputclass {
    public static void main(String[] args) {
        Scanner chukua;
        Double p,r,t,interest;

        //instantiate your scanner

        chukua=new Scanner(System.in);
        //use the scanner to grt thr dsts from the user

        System.out.println("enter the principle");
        p=chukua.nextDouble();

        System.out.println("enter the rate in percentage");
        r=chukua.nextDouble();

        System.out.println("enter the time in years");
        t=chukua.nextDouble();

        //finally calculate the interest
        interest=p*r*t/100.0;
        System.out.println("your interest is "+interest);

    }
}
