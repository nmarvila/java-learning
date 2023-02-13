package swing;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListDemo {
	String[] cities = { "New York", "Chicago", "Houston",
						"Denver", "Los Angeles", "Seattle",
						"London", "Paris", "New Delhi",
						"Hong Kong", "Tokyo", "Sydney" };
	
	public JListDemo() {
		JFrame jfrm = new JFrame("JListDemo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setSize(200, 200);
		
		JList<String> jlst = new JList<String>(cities);
		
		jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JScrollPane jscrlp = new JScrollPane(jlst);
		
		jscrlp.setPreferredSize(new Dimension(120, 90));
		
		JLabel jlab = new JLabel("Choose a City");
		
		jlst.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent le) {
				int idx = jlst.getSelectedIndex();
				
				if(idx != -1)
					jlab.setText("Current selection: " + cities[idx]);
				else
					jlab.setText("Choose a City");
			}
		});
		
		jfrm.add(jscrlp);
		jfrm.add(jlab);
		
		jfrm.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(
			new Runnable() {
				public void run() {
					new JListDemo();
				}
			}
		);
	}
}
