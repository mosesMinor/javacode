
import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner chukua;
        Integer x,y,jibu;
        chukua=new Scanner(System.in);
        System.out.println("Enter the value for x");
        x=chukua.nextInt();
        System.out.println("Enter the value for y");
        y=chukua.nextInt();

        jibu =x+y;
        System.out.println("your answer is"+jibu);
    }
}
