package running;

public class Duing extends Thread{
    // 重写run方法
    private int i;

    public void run()
    {
        for(;i<=4;i++)
        {
            String msg = "线程名称：" + getName();
            System.out.print(msg);
        }
        System.out.println();
    }
}