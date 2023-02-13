package swing;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class JLabelDemo {
	public JLabelDemo() {
		JFrame jfrm = new JFrame("JLabelDemo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(500, 400);
		
		ImageIcon ii = new ImageIcon("hourglass.png");
		
		JLabel jl = new JLabel("Hourglass", ii, JLabel.CENTER);
		
		jfrm.add(jl);
		
		jfrm.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(
			new Runnable() {
				public void run() {
					new JLabelDemo();
				}
			}
		);
	}
}
