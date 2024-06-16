import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.4);
        circles[1] = new Circle();
        circles[2] = new Circle( "indigo", false, 3.5);

        System.out.println("Pre-sorted array:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        Comparator circleComparator = new ComparableCircle();
        Arrays.sort(circles, circleComparator);

        System.out.println("Sorted array:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}