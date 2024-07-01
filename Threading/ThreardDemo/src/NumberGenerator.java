public class NumberGenerator implements Runnable {
    private Thread thread;
    private String threadName;

    public NumberGenerator(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Number: " + i + "| hashCode: " + this.hashCode()  );
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
