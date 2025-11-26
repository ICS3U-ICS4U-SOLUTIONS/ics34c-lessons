package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InputGUI {

	private JFrame frame;
	private JTextField inputTextField;
	private JTextField outputTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InputGUI window = new InputGUI();
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
	public InputGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		inputTextField = new JTextField();
		inputTextField.setBounds(61, 120, 86, 20);
		frame.getContentPane().add(inputTextField);
		inputTextField.setColumns(10);
		
		outputTextField = new JTextField();
		outputTextField.setBounds(283, 120, 86, 20);
		frame.getContentPane().add(outputTextField);
		outputTextField.setColumns(10);
		
		JButton btnNewButton = new JButton("Click Me");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				
				String myString = "";
				
				
				// input
				myString = inputTextField.getText();
				
				
				// output
				outputTextField.setText(myString);
				
				// button code ends here
				
			}
		});
		btnNewButton.setBounds(175, 181, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
