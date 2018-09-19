package limitedNumOfThreads;

public class Thread1 extends Thread{
    private int v[];
    private int result1;

    public Thread1(int v[]) {
        this.v = v;
    }

    public void run() {
        int sum = 0;
        for (int i = 0; i < v.length / 2; ++i) {
            sum = sum + v[i];
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        result1 = sum;
        System.out.println("Suma primei jumatati a vectorului este "+result1);
    }
    public int getResult1(){
        return result1;
    }

}
