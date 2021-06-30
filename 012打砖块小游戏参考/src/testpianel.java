
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.io.IOException;
import java.util.Calendar;
import javax.swing.*;

public class testpianel extends JPanel implements Runnable,KeyListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3059219276548802277L;
	private Constant c;
	private Myball ball;
	private Myplank plank;
	private int count;
	private int number;
	private int flag=1;
	private int score;
	private int dd=4;
	private int nowtime=0;
	public  testpianel(int degree) throws IOException
	{
		c=new Constant();
		count=0;
		score=0;
		number=c.brick_number;
		c.init_plank_x+=15*degree;
		c.range_angle+=degree*10*c.k;
		plank=new Myplank(c.init_plank_x,c.init_plank_y,c.plank_height,c.plank_width-degree*30);
		ball=new Myball(c.init_ball_x,c.init_ball_y,c.init_ball_r);
		setSize(c.screen_width,c.screen_height+50);
		if(degree==0) dd=8;
		if(degree==1) dd=4;
		if(degree==2) dd=2;
//		//System.out.println("once,构造");
		setVisible(true);
		this.addKeyListener(this);
		repaint();
	}
	public int d_to_int(double value)
	{
		int m=(int)value;
		double m1=m,m2=m+1;
		if((m-m1)>(m2-m)) return m+1;
		else return m;
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2d=(Graphics2D)g;
		if(flag==1)
		{
		int i;
		g.setColor(Color.black);
		g.drawLine(c.game_width, 0, c.game_width,c.game_height);// drawLine(int x1, int y1, int x2, int y2) 
		g.setColor(Color.green);
		for(i=0;i<c.brick_number;i++)
		{
			if(c.brick_x[i]>0)
			{
				if(i%3==0) g.setColor(Color.red);
				if(i%3==1) g.setColor(Color.yellow);
				if(i%3==2) g.setColor(Color.blue);
			g.fillRect(c.brick_x[i],c.brick_y[i],c.brick_width,c.brick_height);//drawRect(int x, int y, int width, int height) 
			}
		}
		g.setColor(Color.white);
		for(i=0;i<c.brick_number;i++)
		{
			if(c.brick_x[i]>0)
			{
				g.drawLine(c.brick_x[i],c.brick_y[i], c.brick_x[i],c.brick_y[i]+c.brick_height); 
				g.drawLine(c.brick_x[i],c.brick_y[i]+c.brick_height, c.brick_x[i]+c.brick_width,c.brick_y[i]+c.brick_height); 
			}
		}
		g.setColor(Color.blue);
		Ellipse2D.Double ov=new Ellipse2D.Double(ball.ball_x,ball.ball_y,(int)(2*c.init_ball_r),(int)(2*c.init_ball_r));
		g2d.draw(ov);
		g2d.setColor(Color.red);
		g2d.fill(ov);
		g.setColor(Color.black);
		//g.drawOval(d_to_int(ball.ball_x),d_to_int(ball.ball_y),(int)(2*c.init_ball_r),(int)(2*c.init_ball_r));//drawRect(int x, int y, int width, int height)
		g.fillRect(plank.plank_x,plank.plank_y,plank.plank_width,plank.plank_height);
		g.setColor(Color.red);
		g.drawString("红砖:10 point", c.game_width+10, 50);
		g.setColor(Color.yellow);
		g.drawString("黄砖:20 point", c.game_width+10, 70);
		g.setColor(Color.blue);
		g.drawString("蓝砖:30 point", c.game_width+10, 30);
		g.setColor(Color.black);
		g.drawString(to_add(c.condition_time,nowtime), c.game_width+10, c.game_height/2-20);
		g.drawString(to_add(c.condition_score,score), c.game_width+10, c.game_height/2);
		g.drawString(to_add(c.condition_rest,number), c.game_width+10, c.game_height/2+20);
		}
		else
		{
			g.setColor(Color.black);
			g.setFont(new Font("宋体",g.getFont().getStyle(),36));
			if(flag==2) g.drawString(c.over, c.screen_width/2-c.over.length()*18/2, c.game_height/2);
			if(flag==0)  g.drawString(c.complete, c.screen_width/2-c.complete.length()*18/2, c.game_height/2);
		}
	}
	public void keyPressed(KeyEvent e)
	{
		if(count==0)
		{
			count++;
			Thread me=new Thread(this);
			me.start();
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT)
		{
			if(plank.plank_x-dd>0)plank.plank_x-=dd;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			if(plank.plank_x+plank.plank_width+dd<c.game_width)plank.plank_x+=dd;
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
	
	}
	public String to_add(final String front,final int n)
	{
		String s= Integer.toString(n);
		String des=front+s;
		return des;
	}
	public void run()
	{
		Calendar rightnow=Calendar.getInstance();
        int timeBegin=rightnow.get(Calendar.SECOND);
        //System.out.println("time:"+timeBegin);
        int tt=60;
        int n=0;
		while(flag==1)
		{
			rightnow=Calendar.getInstance();
			nowtime=rightnow.get(Calendar.SECOND)-timeBegin;
			if(nowtime<0)
			{
				nowtime+=tt;
				tt+=60;
			}
			//System.out.println("nowtime:"+rightnow.get(Calendar.SECOND));
			
			int i,increase_count=0;
			for(i=0;i<c.brick_number;i++)
			{
				if(c.brick_x[i]>0)
				{
				    n=ball.is_collision(c.brick_x[i], c.brick_y[i], c.brick_height, c.brick_width);
					if(n!=0)
					{
		
						if(n!=c.border)
						{
						ball.increase();
						c.brick_x[i]=-1;
						number--;
						if(i%3==0) score+=10;
						if(i%3==1) score+=20;
						if(i%3==2)score+=30;
						}
						if(number==0) flag=0;
						if(n==c.FAIL) flag=2;
						if(n==c.border) ball.increase();
						break;
					}
					if(n==0) 
					{
						increase_count++;
						if(increase_count==1) ball.increase();
					}
					
				}
			}
			if(ball.ball_y>(plank.plank_y-20))ball.is_collision(plank.plank_x, plank.plank_y, plank.plank_height, plank.plank_width);
			repaint();
			 try{
	             Thread.sleep(5);//模拟过桥时间
	         }catch(InterruptedException e){}
		}
		
	}
}
