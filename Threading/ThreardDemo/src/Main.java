//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running... ");
        NumberGenerator numberGenerator = new NumberGenerator("a");
        NumberGenerator numberGenerator2 = new NumberGenerator("b");

        Thread thread1 = new Thread(numberGenerator);
        Thread thread2 = new Thread(numberGenerator2);

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
    }
}