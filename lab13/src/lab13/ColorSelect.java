package lab13;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorSelect extends JFrame {
	
	private JButton ok;
	private JButton cancel;
	private JCheckBox background;
	private JCheckBox foreground;
	private JComboBox colour;
	private JPanel checkpanel;
	private JPanel buttonpanel;
	
	public ColorSelect() {
		
		super("ColourSelection");
		setLayout(new BorderLayout());
		
		
		// Combo Box
		colour = new JComboBox();
		colour.addItem("Red");
		colour.addItem("Blue");
		colour.addItem("Green");
		add(colour , BorderLayout.NORTH);
		
		// Check Box
		background = new JCheckBox("Background");
		foreground = new JCheckBox("foreground");
		checkpanel = new JPanel();
		
		checkpanel.add(background);
		checkpanel.add(foreground);
		
		add(checkpanel , BorderLayout.CENTER);
		
		// Buttons
		ok = new JButton("ok");
		cancel = new JButton("cancel");
		buttonpanel = new JPanel();
		buttonpanel.add(ok);
		buttonpanel.add(cancel);
		add(buttonpanel , BorderLayout.SOUTH);
		
		
		
	}
	

}
