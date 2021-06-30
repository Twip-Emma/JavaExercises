import java.io.*;
public class Constant   {
	
	public final int up_collision=1;
	public final int down_collision=2;
	public final int left_collision=3;
	public final int right_colllision=4;
	public final int screen_height=500;
	public final int screen_width=620;
	public final int game_height=500;
	public final int game_width=500;
	private final int cen_x=230;
	public final int init_ball_r=5;
	public final double init_ball_x=cen_x-init_ball_r;
	public final double init_ball_y=440;
	public final double PI=3.1415926;
	public final double k=PI/180;
	public  double range_angle=45*k;
	public final int brick_number=33; //砖块初始数量
	public int []brick_x; //砖块初始坐标
	public int []brick_y;
	public final int  plank_height=10;
	public final int  plank_width=80;
	public int brick_height=10;
	public int brick_width=40;
	public int init_plank_x=190;
	public int init_plank_y=450;
	public final int every_move=1;//球每次移动的距离
	public final int data_max_length=4;
	public final String file_name="data.txt";
	public final String over="Game over";
	public final String complete="Mission Complete";
	public final String condition_time="已用时间：";
	public final String condition_score="所得分数：";
	public final String condition_rest="剩余方块：";
	public final int FAIL=10;
	public final int border=11;
	public Constant() throws IOException 
	{
		brick_x=new int[brick_number];
		brick_y=new int[brick_number];
		int i;
		FileInputStream in;
		
		in = new FileInputStream(file_name);
		
		for(i=0;i<brick_number;i++)
		{
			int []data=new int [4];
			int j,t,length,flag;
			length = 0;
			j = 0;
			t = in.read();
			flag = 1;
			while(t==32||t==0x0d||t==0x0a)
			{
				t=in.read();
				
			}
			while(flag==1)
			{
				data[j]=t;
				t=in.read();
				if(t==32||t==0x0d||t==0x0a) 
				{
					flag=0;
				}
				j++;
				length++;
			}
			
			brick_x[i]=r_file(data,length);
		}
		for(i=0;i<brick_number;i++)
		{
			int []data=new int [4];
			int length=0,j=0,t=in.read(),flag=1;
			while(t==32||t=='\r'||t=='\n')
			{
				t=in.read();
			}
			while(flag==1)
			{
				data[j]=t;
				t=in.read();
				if(t==32||t=='\r'||t=='\n') 
				{
					flag=0;
				}
				j++;
				length++;
			}
		    brick_y[i]=r_file(data,length);
		}
		
		in.close();
	}
	
	public int  r_file(int []data,int length)
	{
		int value=0;
		int i,t=1;
		for(i=length-1;i>=0;i--)
		{
			value+=t*(data[i]-'0');
			t*=10;
		}
		return value;
	}
}