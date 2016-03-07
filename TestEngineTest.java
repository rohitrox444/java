package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.BevelBorder;

public class TestEngineTest extends JFrame {
	ImageIcon icon = new ImageIcon(TestEngineTest.class.getResource("atom-128.png"));
	private JPanel contentPane ;
	int lblen=704;
	int lbwid = 52;
	JLabel lblLabelWillIncrease = new JLabel("label will increase");
	
	
	public static void main(String[] args) {
		
					TestEngineTest frame = new TestEngineTest();
					frame.setVisible(true);
				
	}
	public TestEngineTest() {
		setFont(new Font("Arial Rounded MT Bold", Font.BOLD | Font.ITALIC, 12));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 483);
	lblLabelWillIncrease.setOpaque(true);
		
	lblLabelWillIncrease.setBackground(Color.CYAN);
		this.setTitle("Twist Test-engine");
		this.setIconImage(icon.getImage());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		lblLabelWillIncrease.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 16));
		lblLabelWillIncrease.setForeground(Color.BLACK);
		//label start here
		lblLabelWillIncrease.setBackground(Color.CYAN);
		lblLabelWillIncrease.setBounds(12, 33,700,44);
		contentPane.add(lblLabelWillIncrease);
		//size increase button 
		JButton btnIncrease = new JButton("increase");
		btnIncrease.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				increasesize();
				}
		});
		btnIncrease.setBounds(270, 193, 89, 23);
		contentPane.add(btnIncrease);
		
		//radio buttons start
		JRadioButton rdbtnA = new JRadioButton("A).");
		rdbtnA.setBounds(24, 287, 49, 23);
		contentPane.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("B).");
		rdbtnB.setBounds(24, 361, 49, 23);
		contentPane.add(rdbtnB);
		
		JRadioButton rdbtnC = new JRadioButton("C).");
		rdbtnC.setBounds(459, 287, 49, 23);
		contentPane.add(rdbtnC);
		
		JRadioButton rdbtnD = new JRadioButton("D).");
		rdbtnD.setBounds(459, 361, 49, 23);
		contentPane.add(rdbtnD);
		//radio buttons ends
		
		//option 1 answer label
		JLabel lblOption = new JLabel("option 1");
		lblOption.setBounds(72, 291, 79, 19);
		contentPane.add(lblOption);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, -4, 718, 23);
		contentPane.add(menuBar);
		
		JMenu mnFile = new JMenu("file");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpen = new JMenuItem("open");
		mnFile.add(mntmOpen);
		
		JMenuItem mntmNew = new JMenuItem("new");
		mnFile.add(mntmNew);
		
		JMenuItem mntmEdit = new JMenuItem("edit");
		mnFile.add(mntmEdit);
		
		JMenu mnFormat = new JMenu("format");
		menuBar.add(mnFormat);
		
		JMenu mnAbout = new JMenu("about");
		menuBar.add(mnAbout);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.RED, Color.MAGENTA, Color.DARK_GRAY, Color.GREEN));
		label.setBackground(Color.RED);
		label.setBounds(50, 111, 55, 16);
		contentPane.add(label);
	}
	private void increasesize() {
		lblen=lblen+20;
		lbwid=lbwid+20;
		this.lblLabelWillIncrease.setBounds(10, 32, lblen, lbwid);
		
		
	}
}
