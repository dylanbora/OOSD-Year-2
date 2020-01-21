package lab14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PrinterFrame extends JFrame{
	
	//Variables
	private JButton ok;
	private JButton cancel;
	private JButton setup;
	private JButton help;
	private JCheckBox image;
	private JCheckBox text;
	private JCheckBox code;
	private JCheckBox print;
	private JRadioButton selection;
	private JRadioButton all;
	private JRadioButton applet;
	private ButtonGroup rgroup;
	private JComboBox printqualitycombo;
	private JLabel printerlabel;
	private JLabel printqualitylabel;
	private JPanel labelpanel;
	private JPanel buttonpanel;
	private JPanel printpanel;
	private JPanel checkpanel;
	private JPanel radiopanel;
	private JPanel checkradiopanel;
	private JPanel lcrppanel;
	private JPanel lcrpbpanel;
	
	
	//Constructor
	public PrinterFrame(){
		super("Printer");
		
		//Label Panel
		printerlabel = new JLabel("Printer: MyPrinter");
		labelpanel = new JPanel();
		labelpanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		labelpanel.add(printerlabel);
		
		//Button Panel 
		ok = new JButton("Ok");
		cancel = new JButton("Cancel");
		setup = new JButton("Setup...");
		help = new JButton("Help");
		buttonpanel = new JPanel(new GridLayout(4,1,5,5));
		buttonpanel.add(ok);
		buttonpanel.add(cancel);
		buttonpanel.add(setup);
		buttonpanel.add(help);
		
		//Print Panel
		printqualitylabel = new JLabel("Print Quality:");
		printqualitycombo = new JComboBox();
		printqualitycombo.addItem("High");
		printqualitycombo.addItem("Low");
		print = new JCheckBox("Print to File");
		printpanel = new JPanel();
		printpanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,0));
		printpanel.add(printqualitylabel);
		printpanel.add(printqualitycombo);
		printpanel.add(print);
		
		//Check Panel
		image = new JCheckBox("Image");
		text = new JCheckBox("Text");
		code = new JCheckBox("Code");
		checkpanel = new JPanel();
		checkpanel.setLayout(new BorderLayout());
		checkpanel.add(image, BorderLayout.NORTH);
		checkpanel.add(text, BorderLayout.CENTER);
		checkpanel.add(code, BorderLayout.SOUTH);
		
		//Radio Panel
		selection = new JRadioButton("Selection", false);
		all = new JRadioButton("All", true);
		applet = new JRadioButton("Applet", false);
		radiopanel = new JPanel();
		radiopanel.setLayout(new BorderLayout());
		radiopanel.add(selection, BorderLayout.NORTH);
		radiopanel.add(all, BorderLayout.CENTER);
		radiopanel.add(applet, BorderLayout.SOUTH);
		rgroup = new ButtonGroup();
		rgroup.add(selection);
		rgroup.add(all);
		rgroup.add(applet);
		
		//Check & Radio Panel
		checkradiopanel = new JPanel();
		checkradiopanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30,0));
		checkradiopanel.setBackground(Color.WHITE);
		checkradiopanel.add(checkpanel);
		checkradiopanel.add(radiopanel);
		
		//Label Panel, Check & Radio Panel, Print Panel
		lcrppanel = new JPanel();
		lcrppanel.setLayout(new BorderLayout());
		lcrppanel.add(labelpanel, BorderLayout.NORTH);
		lcrppanel.add(checkradiopanel, BorderLayout.CENTER);
		lcrppanel.add(printpanel, BorderLayout.SOUTH);
		
		//Label Panel, Check & Radio Panel, Print Panel; Button Panel
		lcrpbpanel = new JPanel();
		lcrpbpanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10,0));
		lcrpbpanel.add(lcrppanel);
		lcrpbpanel.add(buttonpanel);
		add(lcrpbpanel);
	}//end constructor

}//end class

