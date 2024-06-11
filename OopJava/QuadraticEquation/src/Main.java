import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap b:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap c:");
        double c = Double.parseDouble(scanner.nextLine());

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        if(equation.getDiscriminant() >= 0) {
            System.out.println("Nghiem 1: " + equation.getRoot1());
            System.out.println("Nghiem 2: " + equation.getRoot2());
        } else if(equation.getDiscriminant() == 0) {
            System.out.println("Nghiem bang: " + equation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}