import java.io.IOException;

public class Myball {

	public double ball_x;
	public double ball_y;
	public int ball_r;
	public double center_x;
	public double center_y;
	public double direction;
	private Constant c;
	public Myball(double x,double y,int r) throws IOException
	{
		c=new Constant();
		
		ball_x=x;
		ball_y=y;
		center_x=ball_x+ball_r;
		center_y=ball_y+ball_r;
		ball_r=r;
		//System.out.println(ball_y+" "+"1´Î");
		direction=270*c.k;
	}
	public void change(double start_x,double start_y,int flag)
	{
		angel_change(flag);
	    if(start_y==c.init_plank_y) direction=get_angle(start_x,start_y);
	    
	}
	public void angel_change(int flag)
	{
		//System.out.println("angle change"+flag);
		if(flag==c.up_collision||flag==c.down_collision)
		{
			direction=360*c.k-direction;
		}
		if(flag==c.left_collision||flag==c.right_colllision)
		{
			if(direction>180*c.k)
			{
				direction=540*c.k-direction;
			}
			else direction=180*c.k-direction;
		}
		
	}
	public void increase()
	{
		
		ball_x+=c.every_move*get_cos();
		ball_y+=c.every_move*get_sin();
		center_x=ball_x+ball_r;
		center_y=ball_y+ball_r;
	}
	public double get_angle(double plank_x,double plank_y)
	{
		double percentage=(Math.abs(ball_x-plank_x-c.plank_width/2)/(c.plank_width/2));
		if(center_x-plank_x-c.plank_width/2>0) return percentage*c.range_angle-90*c.k;
		else return 270*c.k-percentage*c.range_angle;		
	}
	public int is_border()
	{
		if(center_x-ball_r>0&&center_x+ball_r<c.game_width&&center_y-ball_r>0&&center_y+ball_r<c.game_height)
		{
			return 0;
		}
		if(center_x-ball_r<=0)
		{
			return c.right_colllision;
		}
		if(center_x+ball_r>=c.game_width)
		{
			return c.left_collision;
		}
		if(center_y-ball_r<=0)
		{
			return c.down_collision;
		}
		if(center_y+ball_r>=c.game_height)
		{
			return c.up_collision;
		}
		return 0;
	}
	public int is_collision(double start_x,double start_y,int height,int width)
	{
		int flag=1;
		double max_x=start_x+width;
		double max_y=start_y+height;
		if(center_x<max_x&&center_x>start_x&&is_border()==0)
		{
			if(center_y>max_y)
			{
				if((center_y-ball_r)>max_y) flag=0;
				else flag=c.down_collision;
			}
			else if(center_y<start_y)
			{
				if((center_y+ball_r)<start_y) flag=0;
				else flag=c.up_collision;
			}
			else flag=1;
		}
		else if(center_y>start_y&&center_y<max_y&&is_border()==0)
		{
			if(center_x>max_x)
			{
				if((center_x-ball_r)>max_x) flag=0;
				else flag=c.right_colllision;
			}
			else if(center_x<start_x)
			{
				if((center_x+ball_r)<start_x) flag=0;
				else flag=c.left_collision;
			}
			else flag=1;
		}
		else
		{
			if(is_incircle(start_x,start_y)==1)
			{
			
				if(abs_dis(start_x,start_y)==1)
				{
					flag=c.up_collision;
				}
				else
				{
					flag=c.left_collision;
				}
			}
			else if(is_incircle(start_x+width,start_y)==1)
			{
		
				if(abs_dis(start_x+width,start_y)==1)
				{
					flag=c.up_collision;
				}
				else
				{
					flag=c.right_colllision;
				}
			}
			else if(is_incircle(start_x,start_y+height)==1)
			{
			
				if(abs_dis(start_x,start_y+height)==1)
				{
					flag=c.down_collision;
				}
				else
				{
					flag=c.left_collision;
				}
			}
			else if(is_incircle(start_x+width,start_y+height)==1)
			{
				
				if(abs_dis(start_x+width,start_y+height)==1)
				{
					flag=c.down_collision;
				}
				else
				{
					flag=c.right_colllision;
				}
			}
			else
			{
				flag=0;
			}
		}
		if(flag==0)
		{
			
			flag=is_border();
			if(flag!=0)
			{
			angel_change(flag);
			flag=c.border;
			}
		}
		if(flag!=0&&flag!=c.border)
		{
			change(start_x,start_y,flag);
		}
		else
		{
			
		}
		if(center_y>c.init_plank_y+30) {
			flag=c.FAIL;
			}
		return flag;
	}
	public int abs_dis(double limitx,double limity)
	{
		if(Math.abs(limitx-center_x)<Math.abs(limity-center_y))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public double get_cos()
	{
		return(Math.cos(direction)); 
	}
	public double get_sin()
	{
		return (Math.sin(direction));
	}
	public int is_incircle(double x,double y)
	{
		double value=(x-center_x)*(x-center_x)+(y-center_y)*(y-center_y)-ball_r*ball_r;
		if(value>0) return 0;
		else return 1;
	}
}
