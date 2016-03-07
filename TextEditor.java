package test;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class TextEditor extends JFrame {

	private JPanel contentPane;
	JMenuBar menuBar = new JMenuBar();
	JMenuItem mntmNew = new JMenuItem("new");
	JMenuItem mntmSave = new JMenuItem("save");
	JMenuItem mntmPrint = new JMenuItem("print");
	JMenu mnEdit = new JMenu("edit");
	JMenuItem mntmFonts = new JMenuItem("fonts");
	JMenuItem mntmCut = new JMenuItem("cut");
	JMenuItem mntmCopy = new JMenuItem("copy");
	JMenuItem mntmPaste = new JMenuItem("paste");
	JMenu mnAboutUs = new JMenu("about us");
	JMenuItem mntmHistory = new JMenuItem("history");
	JMenuItem mntmAboutCompany = new JMenuItem("about company");
	JMenuItem mntmOtherProducts = new JMenuItem("other products");

	public static void main(String[] args) {
	
			
					TextEditor frame = new TextEditor();
					frame.setTitle("Mynotepad");
					frame.setVisible(true);
				
	}

	public TextEditor() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 441);
		
		
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("file");
		menuBar.add(mnFile);
		mntmNew.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		
		mnFile.add(mntmNew);
		
		JMenuItem mntmOpen = new JMenuItem("open");
		mntmOpen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			/*	JFileChooser opnef = new JFileChooser(new File("c:"));
				opnef.showOpenDialog(this);
				File filepath = openf.getselectedfile();*/
				
			}
		});
		mnFile.add(mntmOpen);
		
		mnFile.add(mntmSave);
		
		mnFile.add(mntmPrint);
		
		menuBar.add(mnEdit);
		
		mnEdit.add(mntmFonts);
		
		mnEdit.add(mntmCut);
		
		mnEdit.add(mntmCopy);
		
		mnEdit.add(mntmPaste);
		
		menuBar.add(mnAboutUs);
		
		mnAboutUs.add(mntmHistory);
		
		mnAboutUs.add(mntmAboutCompany);
		
		
		mnAboutUs.add(mntmOtherProducts);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 679, 369);
		contentPane.add(textArea);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(680, 37, 9, -23);
		contentPane.add(scrollPane);
		
	}
}
