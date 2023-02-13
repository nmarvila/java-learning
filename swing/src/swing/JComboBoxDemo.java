package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class JComboBoxDemo {
	String[] timepieces = { "Hourglass", "Analog", "Digital", "Stopwatch" };
	
	public JComboBoxDemo() {
		JFrame jfrm = new JFrame("JComboBoxDemo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(400, 250);
		
		JComboBox<String> jcb = new JComboBox<String>(timepieces);
		jfrm.add(jcb);
		
		JLabel jlab = new JLabel(new ImageIcon("hourglass.png"));
		jfrm.add(jlab);
		
		jcb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String s = (String) jcb.getSelectedItem();
				jlab.setIcon(new ImageIcon(s + ".png"));
			}
		});
		
		jfrm.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(
			new Runnable() {
				public void run() {
					new JComboBoxDemo();
				}
			}
		);
	}
}
