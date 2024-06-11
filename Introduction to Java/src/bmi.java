import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height in pounds");
        double height = input.nextDouble();
        System.out.println("Enter your weight in inches");
        double weight = input.nextDouble();
        double bmi = weight / Math.pow(height, 2);;

        if (bmi < 18.5) {
            System.out.println("Underweight " + bmi);
        } else if (bmi < 25) {
            System.out.println("Normal " + bmi);
        } else if (bmi < 30) {
            System.out.println("Overweight  "+ bmi);
        } else {
            System.out.println("Obese" + bmi);
        }
    }
}
