package codekamp;

/**
 * Created by cerebro on 15/09/17.
 */
abstract public class Demo implements Runnable {

    volatile public static int total = 0;

    public static void main(String[] args) {

        Demo d1 = new Demo();
        Thread t = new Thread(d1);
        t.setName("codekamp");
        t.start();

        Demo.countCars();
    }

    public static void countCars() {
        for (int i = 1; i <= 50; i++) {
            try {
                Thread.sleep(100);
                total++;
            } catch (InterruptedException e) {
                System.out.println("hello");
            }
            System.out.println("Car number " + i + ". Thread: " + Thread.currentThread().getName());
        }
    }


    public static void countPadesterian() {
        for (int i = 1; i <= 30; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("hello");
            }
            System.out.println("Padesterian number " + i + ". Thread: " + Thread.currentThread().getName());
        }
    }

    @Override
    public void run() {
        Demo.countPadesterian();
        Demo.countCars();
        System.out.println("Hello world!");
    }
}
