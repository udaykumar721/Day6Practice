public class StopWatch {
    private long startTime;
    private long endTime;
    private boolean isRunning;
    public void start() {
        if (!isRunning) {
            startTime = System.currentTimeMillis();
            isRunning = true;
        }
    }
    public void stop() {
        if (isRunning) {
            endTime = System.currentTimeMillis();
            isRunning = false;
        }
    }
    public long getElapsedTime() {
        if (isRunning) {
            return System.currentTimeMillis() - startTime;
        } else {
            return endTime - startTime;
        }
    }
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();

        System.out.println("Press Enter to start the stopwatch.");
        try {
            System.in.read();
        } catch (Exception e) {
        }
        stopwatch.start();
        System.out.println("Stopwatch started. Press Enter to stop.");
        try {
            System.in.read();
        } catch (Exception e) {
        }
        stopwatch.stop();
        long elapsedTime = stopwatch.getElapsedTime();
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
    }
}

