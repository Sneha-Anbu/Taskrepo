 import java.util.Scanner;

public class Oddseries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            int odd = 2 * i - 1;
            System.out.print(odd);
            if (i < a) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
 
    

