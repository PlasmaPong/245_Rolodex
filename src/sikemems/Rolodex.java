package sikemems;

import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Rolodex extends JPanel implements ActionListener{
	public Rolodex(){
		/*
		 * TODO: JMenuBar
		 * 		 add JMenu to JMenuBar
		 * 		 Buttons for menu
		 */
		
		new JPanel();
		
		JTabbedPane jtp = new JTabbedPane();
		this.add(jtp);
		
		//create elements and add to tabbedpane
		JPanel tab1 = new JPanel(new GridLayout(2,2));
		JPanel
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
	private static void createAndShowGUI(){
		JFrame frame = new JFrame("Rolodex");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 500);
		frame.add(new Rolodex());
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		});
	}

}
