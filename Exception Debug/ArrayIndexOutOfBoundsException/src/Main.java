import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        while (true) {
            Scanner scaner = new Scanner(System.in);
            System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
            int x = scaner.nextInt();

            try {
                System.out.println("Giá trị của phần tử có chỉ số" + x + " là " + arr[x]);
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Chỉ số vượt quá giới hạn của mảng");
            }
        }

    }
}