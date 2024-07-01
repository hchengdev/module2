//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        oddThread.start();
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for OddThread.");
        }
        evenThread.start();
        try {
            evenThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for EvenThread.");
        }


    }
}