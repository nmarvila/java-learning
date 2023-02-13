package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class JButtonDemo implements ActionListener {
	JLabel jlab;
	
	public JButtonDemo() {
		JFrame jfrm = new JFrame("JButtonDemo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(550, 500);
		
		ImageIcon hourglass = new ImageIcon("hourglass.png");
		JButton jb = new JButton(hourglass);
		jb.setActionCommand("Hourglass");
		jb.addActionListener(this);
		jfrm.add(jb);
		
		ImageIcon analog = new ImageIcon("analog.png");
		jb = new JButton(analog);
		jb.setActionCommand("Analog Clock");
		jb.addActionListener(this);
		jfrm.add(jb);
		
		ImageIcon digital = new ImageIcon("digital.png");
		jb = new JButton(digital);
		jb.setActionCommand("Digital Clock");
		jb.addActionListener(this);
		jfrm.add(jb);
		
		ImageIcon stopwatch = new ImageIcon("stopwatch.png");
		jb = new JButton(stopwatch);
		jb.setActionCommand("Stopwatch");
		jb.addActionListener(this);
		jfrm.add(jb);
		
		jlab = new JLabel("Choose a Timepiece");
		jfrm.add(jlab);
		
		jfrm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		jlab.setText("You selected " + ae.getActionCommand());
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(
			new Runnable() {
				public void run() {
					new JButtonDemo();
				}
			}
		);
	}
}
