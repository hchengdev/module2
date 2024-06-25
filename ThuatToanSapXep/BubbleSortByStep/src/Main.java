import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Your Input List: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(array);
    }

    public static void bubbleSortByStep(int[] array) {
        boolean flag = true;
        for (int i = 1; i < array.length - 1 && flag; i++) {
            flag = false;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    System.out.println("Swap " + array[i] + " with " + array[i + 1]);
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag==false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.println("List after the  " + i + "' sort: ");
            for (int k = 0; k < array.length; k++) {
                System.out.print(array[k] +  "\t");

            }
        }
    }
}