package lab11;

//Converts a Fahrenheit temperature entered by the user to Celsius, or vice versa

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConvertTemp extends JFrame
{
	
	private static final long serialVersionUID = 1L;
	private JTextField fahrenField = new JTextField();
	private JTextField celsiusField = new JTextField();
	
	// Constructor
	public ConvertTemp(String title)
	{
		
		super(title); // Set title for frame and choose layout
		getContentPane().setLayout(new GridLayout(2, 2));

		
		add(new JLabel("Fahrenheit")); // Add fahrenheit label and text field to frame
		add(fahrenField);
		
		
		fahrenField.addActionListener(new java.awt.event.ActionListener() // Attach listener to text field
		{
			public void actionPerformed(ActionEvent e)
			{
				float fahrenheit = Float.parseFloat(fahrenField.getText());
				float cel = fahrenheit * 5/9;
				System.out.println("The temperature in Fahrenheit is " + fahrenField.getText());
				System.out.println("The temperature in Celcius is " + cel + "\n" );
				celsiusField.setText(Float.toString((float) cel));
			
			}
		});
			
		
		
		add(new JLabel("Celsius")); // Add celsius label and text field to frame
		add(celsiusField);
			
		
		celsiusField.addActionListener(new java.awt.event.ActionListener() // Attach listener to text field
		{
			public void actionPerformed(ActionEvent a)
			{
				float cel = Float.parseFloat(celsiusField.getText());
				float fahrenheit = cel * 9/5;
				System.out.println("The temperature in Celcius is " + celsiusField.getText());
				System.out.println("The temperature in Fahrenheit is " + fahrenheit );
				fahrenField.setText(Float.toString((float) fahrenheit));
				
			}
		});

	
		
		// Attach window listener
		addWindowListener(new WindowCloser());
		
	}//end constructor


	// Listener for window
	class WindowCloser extends WindowAdapter
	{
		
		public void windowClosing(WindowEvent evt)
		{
			System.exit(0);
		}
	}

	public float fahToCel(float t_fah)
	{
		float cel;
		float multiplier = 5 / 9;
		t_fah = t_fah - 32;
		cel = t_fah * multiplier;
		return cel;
	}

}


