import java.util.Scanner;

public class tongSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("a: ");
            double a = scanner.nextDouble();
            System.out.print("b: ");
            double b = scanner.nextDouble();

            if (a > b) {
                System.out.println("Try again.");
                continue;
            }

            double c = 0;
            for (double i = a; i <= b; i++) {
                c += i;
            }
            System.out.printf("Sum of numbers from %.2f to %.2f is: %.2f\n", a, b, c);

        }

    }
}
