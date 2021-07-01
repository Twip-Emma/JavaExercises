package running;

public class Duing2 implements Runnable {
    private int i;
    private String name;
    private Thread t;

    Duing2(String name){
        this.name = name;
        System.out.println("创建：" + name);
    }

    public void run() {
        for(;i<=4;i++) {
            String msg = "线程运行：" + i;
            System.out.print(msg);
        }
        System.out.println();
    }

    public void start () {
        System.out.println("开始： " +  name );
        if (t == null) {
            t = new Thread (this, name);
            t.start ();
        }
    }
}
