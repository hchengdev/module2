//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(bs.list);
        for (int i = 0; i < BubbleSort.list.length; i++)
            System.out.print(BubbleSort.list[i] + " ");
    }
}