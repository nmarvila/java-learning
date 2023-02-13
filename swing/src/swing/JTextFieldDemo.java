package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class JTextFieldDemo {
	public JTextFieldDemo() {
		JFrame jfrm = new JFrame("JTextFieldDemo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(260, 120);
		
		JTextField jtf = new JTextField(15);
		jfrm.add(jtf);
		
		JLabel jlab = new JLabel();
		jfrm.add(jlab);
		
		jtf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jlab.setText(jtf.getText());
			}
		});
		
		jfrm.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(
			new Runnable() {
				public void run() {
					new JTextFieldDemo();
				}
			}
		);
	}
}
