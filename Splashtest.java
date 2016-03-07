package test;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Splashtest extends JFrame {

	private JPanel contentPane;
	private Icon icon = new ImageIcon(Splashtest.class.getResource("mainimg.gif"));
	JLabel lblNewLabel = new JLabel("game-2016");
	int x =0;
	int y=11;
	JLabel lblNewLabel_1 = new JLabel("rohit rox's production");
	
	
	public static void main(String[] args) {
		
					Splashtest frame = new Splashtest();
					frame.setVisible(true);
					frame.setTitle("game-2016");
					
	}

	public Splashtest() {
		JFrame jfrmtitle = new JFrame("game-2016");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 427);
		contentPane = new JPanel();
		contentPane.setBorder(UIManager.getBorder("ToolTip.border"));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		JLabel label = new JLabel();
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		label.setIcon(icon);
		
		label.setBounds(40, 59, 612, 280);
		contentPane.add(label);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.BLUE);
		
		
		lblNewLabel.setBackground(SystemColor.textHighlight);
		if(x<10000)
		{
		for(x=50;x<99;x=x+100)
		{
			x++;
		}
		}
		else{
			 x=0;
			return;
					}
		lblNewLabel.setBounds(10,11, 164, 17);
		
		
		contentPane.add(lblNewLabel);
		
		
		lblNewLabel_1.setFont(new Font("Goudy Stout", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(154, 350, 368, 27);
		contentPane.add(lblNewLabel_1);
		
		JButton btnStart = new JButton("start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Jframetest started = new Jframetest();
				started.setVisible(true);
				Splashtest.this.setVisible(false);
				Splashtest.this.dispose();
			}
		});
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnStart.setBounds(275, 10, 89, 23);
		contentPane.add(btnStart);
		
	}

	private void setundecorated() {
		// TODO Auto-generated method stub
		
	}
}