package lab9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MyFrame extends JFrame{

	private MyPanel panel;
	private JMenuBar menubar;
	private JMenu menu;
	private JMenuItem m1;
	private JMenuItem m2;
	private  String[] sTomb;
	public Pizza p2;
	private Pizza piz;
	public MyFrame() {
	
		menubar = new JMenuBar();
		menu = new JMenu("                     MENU           ");
		m1 = new JMenuItem("Elmentes");
		m2 = new JMenuItem("Betoltes");

		panel = new MyPanel();
		add(panel);
		m1.addActionListener(e->{
			panel.getP();
			System.out.println(panel.getP() + " betoltve");
			JFileChooser jfc = new JFileChooser();
			jfc.setAcceptAllFileFilterUsed(false);
			jfc.setFileFilter(new FileNameExtensionFilter("TEXT FILES","txt","text"));
			int ment = jfc.showSaveDialog(this);
			if (ment == JFileChooser.APPROVE_OPTION) {
				File f = jfc.getSelectedFile();
				String utvonal = f.getPath();
				try (PrintWriter out = new PrintWriter(utvonal)){
					out.write(panel.getP());
					
				}catch(FileNotFoundException e1) {
					System.out.println("Error, file not found");
				}
				
			}
			
		});
		m2.addActionListener(e->{
			System.out.println("Betoltes");
			JFileChooser jfc = new JFileChooser();
			jfc.setAcceptAllFileFilterUsed(false);
			jfc.setFileFilter(new FileNameExtensionFilter("TEXT FILES","txt","text"));
			int betolt = jfc.showOpenDialog(this);
			if (betolt == JFileChooser.APPROVE_OPTION) {
				File f = jfc.getSelectedFile();
				String utvonal = f.getPath();
				
				try {
					BufferedReader br = new BufferedReader(new FileReader(f));
					String s;
					try {
						while ((s = br.readLine()) != null) {
							System.out.println(s + " kiolvastam");
							sTomb = s.split(" ");
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				piz = new PizzaBase();
				
				for (int i = 0; i<sTomb.length; i++) {
					switch(sTomb[i]) {
						
						case "Salami":
							piz = new Salami(piz);
							break;
						case "Corn":
							piz = new Corn(piz);
							break;
						case "Mushroom":
							piz = new Mushroom(piz);
							break;
						case "Olive":
							piz = new Olive(piz);
							break;
						case "Tomato":
							piz = new Tomato(piz);
							break;
					}
				}
			}
			panel.setP(piz);
			panel.repaint();
		});
	
	
		menubar.add(menu);
		menu.add(m1);
		menu.add(m2);
		
		setJMenuBar(menubar);
		setSize(800,800);
		setVisible(true);
	}
}
