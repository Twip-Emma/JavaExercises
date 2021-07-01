package running;

public class Duing3 implements Runnable {
    private static int i = 1;
//    private String name;
    private Thread t;

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            synchronized (this) {
//			    String threadName = Thread.currentThread().getName();
                System.out.println(Thread.currentThread().getName() + ":" + i);
                i++;

            }
        }
    }
}
