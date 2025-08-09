import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error:Can't divide by Zero");
                } else {
                     result = num1 / num2;
                     System.out.println(result);
                }
                break;
            case '%':
                if (num2 == 0) {
                   System.out.println("Error: Modulo by zero!");
                } else {
                   result = num1 % num2;
                    System.out.println(result;
                   }
                break;
            default:
                System.out.println("Error: Invalid operator!");
            break;

        }
    }
}
