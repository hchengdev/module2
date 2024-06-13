import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dai canh thu nhat: ");
        double a = sc.nextDouble();
        System.out.println("Nhap so dai canh thu hai: ");
        double b = sc.nextDouble();
        System.out.println("Nhap so dai canh thu ba: ");
        double c = sc.nextDouble();
        System.out.println("Nhap vao mau sac: ");
        String sac = sc.next();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            Triangle triangle = new Triangle(sac, true, a, b, c);
            System.out.println(triangle.toString());
        } else {
            System.out.println("Tam giác không hợp lệ.");
        }
    }
}