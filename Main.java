import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*       Q - 1 : 1 - Write a Java method to find the smallest number among three
            numbers.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("first question");
        System.out.println("Input the first number: ");
        double num1 = scanner.nextInt();
        System.out.println("Input the second number: ");
        double num2 = scanner.nextInt();
        System.out.println("Input the third number: ");
        double num3 = scanner.nextInt();

        smallest(num1,num2,num3);

        // close block of Q -1

        // Q - 2 : 2 - Write a Java method that check if the entered number is negative or
        //positive or zero.
        System.out.println("second question");
        System.out.println("Enter number for check");
        int number1 = scanner.nextInt();
        check(number1);
        // close block of Q - 2

        System.out.println("Third question");

        System.out.println("1. A password must have at least ten characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits");
        System.out.println("Input a password (You are agreeing to the above Terms and\n" +
                "Conditions.):");
        String password = scanner.next();
        passCheck(password);

    }

    public static void smallest(double num1,double num2, double num3) {
        if(num1<num2 && num1<num3){
            System.out.println("The smallest value is "+num1);
        }else if(num2<num1 && num2<num3){
            System.out.println("The smallest value is "+num2);
        }else if(num3<num1 && num3<num2){
            System.out.println("The smallest value is "+num3);
        }
    }

    public static void check(int number1){
        if(number1 > 0){
            System.out.println("positive");
        }else {
            System.out.println("negative");
        }
    }

    public static void passCheck(String password){
        if(password.length()>= 10 && password.matches("[a-zA-Z0-9]+")){

            int digits=0;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    digits++;
                }
            }
            if (digits > 2) {
                System.out.println("Password is valid: "+password);
            }
        }

    }
}

