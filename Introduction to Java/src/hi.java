import java.util.Scanner;

public class hi {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        width = scanner.nextFloat();
        System.out.println("Enter b: ");
        height = scanner.nextFloat();

        float c = width * height;

        System.out.println("Area is: " + c);
    }
}
