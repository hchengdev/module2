//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SelectionSort.selectionSort(SelectionSort.list);
        for (int i = 0; i < SelectionSort.list.length; i++)
            System.out.print(SelectionSort.list[i] + " ");
    }
}