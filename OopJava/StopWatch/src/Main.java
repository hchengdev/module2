//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        long sum = 0;
        for (long i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        stopWatch.stop();
        System.out.println("Thời gian đã trôi qua: "  + stopWatch.getElapsedTime() +  " milliseconds");
        System.out.println("Tổng: " + sum);
    }
}