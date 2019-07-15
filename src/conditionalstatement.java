public class conditionalstatement {
    public static void main(String[] args) {
        // this is an if else statement
        Integer age;
        age=10;
        if ( age<18){
            System.out.println("you are underage");
        }else {
            System.out.println("you have qualified to register");
        }
        //this is an else if statement

        Integer a,b;
        a=20;
        b=30;
        if (a<b){
            System.out.println("A IS LESS HEN B");
        }else if (a>b){
            System.out.println("A IS GREATER THAN B");
        }else {
            System.out.println("A IS EQUAL TO B");
        }
        //this is a switch case statement
        Integer bet ;
        bet = 3;
        switch (bet){
            case 0:
                System.out.println("enter a number from 1");
                break;
            case 1:
                System.out.println("ooops you lost");
                break;
            case 2:
                System.out.println("bravo !! you won a car");
                break;
            case 3:
                System.out.println("you lost");
                break;
            case 4:
                System.out.println("nothing like that");
        }
    }
}
