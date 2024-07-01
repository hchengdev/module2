public class OddThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
