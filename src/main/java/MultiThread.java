public class MultiThread extends Thread {
    private long[] v;


    public MultiThread(long[] v) {
        this.v = v;
    }

    public void run() {
        long sum = 0;
        for (int i = 0; i < v.length; ++i) {
            sum = sum + v[i];
            try {
                MultiThread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread-ul cu numarul " + Thread.currentThread().getId() + " suma elementelor vectorului este  " + sum);
        }
    }
}




