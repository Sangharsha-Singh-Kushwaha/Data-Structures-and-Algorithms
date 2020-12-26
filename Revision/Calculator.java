import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no");
        float a = sc.nextInt();
        System.out.println("Enter the second no");
        float b = sc.nextInt();
        System.out.println("Enter the operations (+,-,*,/,%)");
        sc.nextLine();
        char operations = sc.nextLine().charAt(0);
        float result = 0;
        switch (operations) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '%':
                result = a % b;
                break;
            default:
                System.out.println("Select correct operation");

        }
        System.out.println("The resutl is " + result);

    }
}