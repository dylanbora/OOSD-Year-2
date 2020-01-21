package lab12;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class AlignFrame extends JFrame {
	
	private JButton ok;
	private JButton cancel;
	private JButton help;
	private JTextField xfield;
	private JTextField yfield;
	private JCheckBox snap;
	private JCheckBox show;
	private JLabel xlabel;
	private JLabel ylabel;
	private JPanel checkpanel;
	private JPanel buttonpanel;
	private JPanel xboxpanel;
	private JPanel yboxpanel;
	private JPanel xyboxpanel;
	
	public AlignFrame() {
		super("Align");
		
		//checkbox panel
		snap = new JCheckBox("Snap to Grid");
		show = new JCheckBox("Show Grid");
		checkpanel = new JPanel();
		checkpanel.setLayout(new GridLayout(2,1));
		checkpanel.add(snap);
		checkpanel.add(show);
		
		//xbox panel
		xlabel = new JLabel("X:");
		xfield = new JTextField("8", 3);
		xboxpanel = new JPanel();
		xboxpanel.setLayout(new FlowLayout());
		xboxpanel.add(xlabel);
		xboxpanel.add(xfield);
		
		//ybox panel
		ylabel = new JLabel("Y:");
		yfield = new JTextField("8", 3);
		yboxpanel = new JPanel();
		yboxpanel.setLayout(new FlowLayout());
		yboxpanel.add(ylabel);
		yboxpanel.add(yfield);
		
		//xybox panel
		xyboxpanel = new JPanel();
		xyboxpanel.setLayout(new BorderLayout());
		xyboxpanel.add(xboxpanel, BorderLayout.NORTH);
		xyboxpanel.add(yboxpanel, BorderLayout.SOUTH);
		
		//button panel
		ok = new JButton("Ok");
		cancel = new JButton("Cancel");
		help = new JButton("Help");
		buttonpanel = new JPanel();
		buttonpanel.setLayout(new GridLayout(3, 1, 10,5));
		buttonpanel.add(ok);
		buttonpanel.add(cancel);
		buttonpanel.add(help);
		
		
		setLayout(new FlowLayout(FlowLayout.CENTER, 10,5));
		add(checkpanel);
		add(xyboxpanel);
		add(buttonpanel);
	}

}//end class
