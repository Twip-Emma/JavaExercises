import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class initframe extends JFrame implements ActionListener,MouseListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Constant c;
	JButton b1=new JButton("��ʼ��Ϸ");
	JButton b2=new JButton("ѡ���Ѷ�");
	JLabel t=new JLabel("������Ϸ");
	JRadioButton jr1;
	JRadioButton jr2;
	JRadioButton jr3;
	int count=0;
	int hard_degree=0;
	public  int flag=0;
	public initframe() throws IOException
	{
		c=new Constant();
		setSize(300,450);
		setVisible(true);
		b1.addActionListener(this);
		b2.addMouseListener(this);
		add(b1);
		add(t);
		add(b2);
		t.setBounds(70, 50, 180, 60);
		t.setFont(new Font("����",Font.PLAIN,36));
		setLayout(null);
		b1.setBounds(80, 200, 120, 40);
		b2.setBounds(80, 250, 120, 40);
	}
	public void no_use()
	{
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
		try {
			Myframe p=new Myframe(hard_degree);
			p.no_use();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		count++;
		
		if(count==1)
		{
			System.out.print("mounse action");
		ButtonGroup  group=new ButtonGroup();//JRadioButton(String text)
	    jr1=new JRadioButton("��",true);
		jr2=new JRadioButton("����",false);
		 jr3=new JRadioButton("ج��",false);
		group.add(jr1);
		group.add(jr2);
		group.add(jr3);
		this.add(jr1);
		jr1.setBounds(60, 330, 60, 20);
		jr1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				hard_degree=0;
			}
			
		}
		);
		add(jr2);
		jr2.setBounds(120, 330, 60, 20);
		jr2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				hard_degree=1;
			}
			
		}
		);
		add(jr3);
		jr3.setBounds(180, 330, 60, 20);
		jr3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				hard_degree=2;
			}
			
		}
		);
		}
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
