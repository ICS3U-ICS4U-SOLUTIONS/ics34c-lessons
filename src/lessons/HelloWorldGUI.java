package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloWorldGUI {

	private JFrame frame;
	private JTextField myTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorldGUI window = new HelloWorldGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HelloWorldGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 411, 202);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton myButton = new JButton("Click Here");
		myButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				
				myTextField.setText("Hello World!");
				
				// button code ends here
			}
		});
		myButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		myButton.setBackground(new Color(0, 255, 255));
		myButton.setBounds(31, 105, 115, 20);
		frame.getContentPane().add(myButton);
		
		JLabel myLabel = new JLabel("My Hello World Program!");
		myLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		myLabel.setBounds(87, 27, 258, 52);
		frame.getContentPane().add(myLabel);
		
		myTextField = new JTextField();
		myTextField.setBounds(224, 105, 149, 20);
		frame.getContentPane().add(myTextField);
		myTextField.setColumns(10);
	}
}
