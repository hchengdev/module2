//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        LinkedList lists = new LinkedList(10);
        lists.addFirst(1);
        lists.addFirst(22);
        lists.addFirst(33);
        lists.addFirst(44);

        lists.add(4, 55);
        lists.add(5, 66);
        lists.printList();
    }
}