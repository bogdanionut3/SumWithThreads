package limitedNumOfThreads;

public class Main {
    public static void main(String[] args) {
        int v[] = {1, 3, 5, 6, 2,3,4,5};
            Thread1 firstHalf = new Thread1(v);
            Thread2 secondHalf = new Thread2(v);
            firstHalf.start();
            secondHalf.start();
        try {
            firstHalf.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            secondHalf.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int a = firstHalf.getResult1();
        int b = secondHalf.getResult2();
        int sum = a+b;
        System.out.println("Suma este "+sum);

    }

    }

