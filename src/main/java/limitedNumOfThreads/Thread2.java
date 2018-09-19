package limitedNumOfThreads;

public class Thread2 extends Thread {
    private int v[];
    private int result2;

public Thread2 (int v[]){
    this.v = v;
}


    public void run(){
        int sum = 0;
        for(int i = v.length/2; i<v.length; i++){
            sum = sum+v[i];
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        result2 = sum;
        System.out.println("A doua suma este "+result2);
    }
  public int getResult2(){
    return result2;
  }
}
