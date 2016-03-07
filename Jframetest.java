package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jframetest extends JFrame {

	private JPanel contentPane;
	private boolean isXorZero= false;
	JButton btn1 = new JButton("");
	JButton btn2 = new JButton("");
	JButton btn3 = new JButton("");
	JButton btn4 = new JButton("");
	JButton btn5 = new JButton("");
	JButton btn6 = new JButton("");
	JButton btn7 = new JButton("");
	JButton btn8 = new JButton("");
	JButton btn9 = new JButton("");

	public static void main(String[] args) {
		Jframetest test= new Jframetest();
		test.setVisible(true);
	}
	public Jframetest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				xandzero(btn1);
			}
		});
		
		btn1.setBounds(10, 25, 103, 42);
		contentPane.add(btn1);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xandzero(btn2);
			}
		});
		
		btn2.setBounds(144, 25, 103, 42);
		contentPane.add(btn2);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xandzero(btn3);
			}
		});
		
		btn3.setBounds(300, 25, 103, 42);
		contentPane.add(btn3);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xandzero(btn4);
			}
		});
		
		btn4.setBounds(10, 123, 103, 42);
		contentPane.add(btn4);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xandzero(btn5);
			}
		});
		
		btn5.setBounds(144, 123, 103, 42);
		contentPane.add(btn5);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xandzero(btn6);
			}
		});
		
		btn6.setBounds(300, 123, 103, 42);
		contentPane.add(btn6);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xandzero(btn7);
			}
		});
		
		btn7.setBounds(10, 214, 103, 42);
		contentPane.add(btn7);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xandzero(btn8);
			}
		});
		
		btn8.setBounds(144, 214, 103, 42);
		contentPane.add(btn8);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xandzero(btn9);
			}
		});
		
		btn9.setBounds(300, 214, 103, 42);
		contentPane.add(btn9);
	}
	private void xandzero(JButton button){
	
		if(button.getText().trim().length()==0)
		{
			if(isXorZero)
			{
				button.setText("x");
				isXorZero=false ;
			}
			else{
				button.setText("0");
			isXorZero=true;
			}
		}
	}
	private void iswin(){
		char checkX = 'x';
		char check0 = '0';
	}
	
}
