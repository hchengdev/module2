import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi cac tu cach nhau bang dau cach: ");
        String str = sc.nextLine();

        String[] arr = str.split(" ");
        Arrays.sort(arr);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}