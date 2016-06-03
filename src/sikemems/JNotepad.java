package sikemems;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class JNotepad {
	JFrame frame;
	JTextArea tArea;
	JNotepad(){
		BorderLayout bl = new BorderLayout();
		frame = new JFrame("C.Michael's - JNotepad");
		frame.setPreferredSize(new Dimension(400, 400));
		tArea = new JTextArea();
		JScrollPane jsp = new JScrollPane(tArea);
		frame.add(jsp);
		frame.setLocationByPlatform(true);
		frame.setVisible(true);
	}
	public void setMenu(JFrame jf){
		MenuBar mBar = new MenuBar();
		jf.setMenuBar(mBar);

		JMenu fileM = new JMenu("File");
		fileM.setMnemonic(KeyEvent.VK_F);

		JMenuItem newMI = new JMenuItem("New");
		newMI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, 
				InputEvent.CTRL_MASK));
		//declare/instantiate JFileChooser
		JFileChooser jfc = new JFileChooser();
		JMenuItem openMI = new JMenuItem("Open...");
		openMI.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				/*JFileChooser usage implementation
				 * 
				 */
				int result = jfc.showOpenDialog(null);

				if(result == JFileChooser.APPROVE_OPTION){
					tArea.setText("");
					tArea.setText("");
				}
			}
		});
	}
	public static void main(String args[]) {    
		// Create the frame on the event dispatching thread.    
		SwingUtilities.invokeLater(new Runnable() {    
			public void run() {    
				new JNotepad();    
			}    
		});    
	}  
}
