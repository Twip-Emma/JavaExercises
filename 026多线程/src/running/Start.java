package running;

public class Start {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //第一题
//		new Duing().start();
//		new Duing().start();
//		new Duing().start();
//		new Duing().start();
//
//        Duing2 t1 = new Duing2("线程1");
//        t1.start();
//        Duing2 t2 = new Duing2("线程2");
//        t2.start();
//        Duing2 t3 = new Duing2("线程3");
//        t3.start();
//        Duing2 t4 = new Duing2("线程4");
//        t4.start();
//        Duing3 t1 = new Duing3("线程1");t1.start();
//        Duing3 t2 = new Duing3("线程2");t2.start();
//        Duing3 t3 = new Duing3("线程3");t3.start();

        //第二题
        Duing3 t = new Duing3();
        Thread a = new Thread(t, "线程1");
        Thread b = new Thread(t, "线程2");
        Thread c = new Thread(t, "线程3");
        a.start();
        b.start();
        c.start();

    }
}
