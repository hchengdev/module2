public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch() {
        this.startTime = 0;
        this.endTime = 0;
    }
    public void start() {
        this.startTime = System.currentTimeMillis();
        this.endTime = 0;
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        if (this.endTime == 0) {
            return System.currentTimeMillis() - this.startTime;
        }
        return this.endTime - this.startTime;
    }
    public void reset() {
        this.startTime = 0;
        this.endTime = 0;
    }

}
