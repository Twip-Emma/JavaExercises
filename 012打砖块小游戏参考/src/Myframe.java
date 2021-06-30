import java.io.*;
import javax.swing.*;

public class Myframe extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5092084296615530126L;
	testpianel p1;
	Constant c;
	public Myframe(int degree) throws IOException
	{
		c=new Constant();
		p1=new testpianel(degree);
		setVisible(true);
		setSize(c.screen_width,c.screen_height+50);
		add(p1);
		p1.setFocusable(true);
	}
	public void no_use()
	{
		
	}
}
