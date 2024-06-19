//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 1: "+listInteger.getElement(1));
        System.out.println("element 2: "+listInteger.getElement(2));
        System.out.println("element 4: "+listInteger.getElement(3));

        listInteger.getElement(-1);
        System.out.println("element -1: " + listInteger.getElement(-1));    }
}