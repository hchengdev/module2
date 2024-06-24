import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một chuỗi: ");
        String n = scanner.nextLine();

        String[] words = n.trim().split("\\s+");

        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);

        System.out.println(Arrays.toString(words));

        System.out.println("Nhập từ cần tìm kiếm: ");
        String searchWord = scanner.nextLine();

        int result = binarySearch(words, 0, words.length - 1, searchWord);
        if (result == -1) {
            System.out.println("Từ không được tìm thấy.");
        } else {
            System.out.println(result);
        }

    }

    public static int binarySearch(String[] array, int left, int right, String value ) {
        while (left <= right) {
            int mid = left + (left + right) / 2;
            int cmp = value.compareToIgnoreCase(array[mid]);
            if (cmp == 0) {
                System.out.println(mid);
            } else if (cmp < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

