package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewClass extends JFrame {


private int value=124;

	public static void main(String[] args) {
	
					NewClass frame = new NewClass();
					frame.setVisible(true);
		
	}

	
	public NewClass() {
		getContentPane().setBackground(Color.GREEN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblHelo = new JLabel("helo");
		lblHelo.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelo.setForeground(Color.ORANGE);
		lblHelo.setBackground(Color.ORANGE);
		lblHelo.setBounds(84, 44, 108, 144);
		lblHelo.setOpaque(true);
		getContentPane().add(lblHelo);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(273, 79, 61, 65);
		getContentPane().add(lblNewLabel);
	    lblNewLabel.setText(String.valueOf(value));
	    
	    JButton btnNewButton = new JButton("New button");
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		value++;
	    		 lblNewLabel.setText(String.valueOf(value));
	    	}
	    });
	    btnNewButton.setBounds(30, 210, 89, 23);
	    getContentPane().add(btnNewButton);
	    
	}
}
