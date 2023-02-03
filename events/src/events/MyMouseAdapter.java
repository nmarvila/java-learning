package events;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseAdapter extends MouseAdapter {
	AdapterDemo adapterDemo;
	
	public MyMouseAdapter(AdapterDemo adapterDemo) {
		this.adapterDemo = adapterDemo;
	}
	
	public void mouseClicked(MouseEvent me) {
		adapterDemo.msg = "Mouse clicked";
		adapterDemo.repaint();
	}
	
	public void mouseDragged(MouseEvent me) {
		adapterDemo.msg = "Mouse dragged";
		adapterDemo.repaint();
	}
}
