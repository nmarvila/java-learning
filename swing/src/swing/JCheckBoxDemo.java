package swing;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class JCheckBoxDemo implements ItemListener {
	JLabel jlab;
	
	public JCheckBoxDemo() {
		JFrame jfrm = new JFrame("JCheckBoxDemo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(250, 100);
		
		JCheckBox cb = new JCheckBox("C");
		cb.addItemListener(this);
		jfrm.add(cb);
		
		cb = new JCheckBox("C++");
		cb.addItemListener(this);
		jfrm.add(cb);
		
		cb = new JCheckBox("Java");
		cb.addItemListener(this);
		jfrm.add(cb);
		
		cb = new JCheckBox("Perl");
		cb.addItemListener(this);
		jfrm.add(cb);
		
		jlab = new JLabel("Select languages");
		jfrm.add(jlab);
		
		jfrm.setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent ie) {
		JCheckBox cb = (JCheckBox)ie.getItem();
		
		if(cb.isSelected())
			jlab.setText(cb.getText() + " is selected");
		else
			jlab.setText(cb.getText() + " is cleared");
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(
			new Runnable() {
				public void run() {
					new JCheckBoxDemo();
				}
			}
		);
	}
}
