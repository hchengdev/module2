public class InsertionSort {
    static int[] list = {1, 9, 4, 6, 5, -4};

    public static void insertionSort(double[] arr) {
        int pop, x;
        for (int i = 1; i < arr.length; i++) {
            x = (int) arr[i];
            pop = i;
            while (pop > 0 && x > arr[pop - 1]) {
                arr[pop] = arr[pop - 1];
                pop--;
            }
            arr[pop] = x;
        }
    }
}
