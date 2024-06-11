import java.util.Scanner;

public class TienTe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so tien USD: ");
        double usd = input.nextDouble();
        double vnd = usd / 23000;
        System.out.println("So tien VND: " + vnd);
    }
}
