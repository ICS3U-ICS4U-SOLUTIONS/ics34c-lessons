package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCalculator {

	private JFrame frame;
	private JTextField firstNumber;
	private JTextField secondNumber;
	private JTextField answerTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCalculator window = new AddCalculator();
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
	public AddCalculator() {
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
		
		JLabel lblNewLabel = new JLabel("Add Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(155, 38, 132, 33);
		frame.getContentPane().add(lblNewLabel);
		
		firstNumber = new JTextField();
		firstNumber.setBounds(22, 113, 86, 20);
		frame.getContentPane().add(firstNumber);
		firstNumber.setColumns(10);
		
		secondNumber = new JTextField();
		secondNumber.setBounds(145, 113, 86, 20);
		frame.getContentPane().add(secondNumber);
		secondNumber.setColumns(10);
		
		answerTextField = new JTextField();
		answerTextField.setBounds(338, 113, 86, 20);
		frame.getContentPane().add(answerTextField);
		answerTextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("+");
		lblNewLabel_1.setBounds(118, 116, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton answerButton = new JButton("=");
		answerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// code starts here
				
				// variables
				int first = 0;
				int second = 0;
				int answer = 0;
				
				// input
				first = Integer.parseInt(firstNumber.getText());
				second = Integer.parseInt(secondNumber.getText());
				
				// processing
				answer = first + second;
				
				// output
				answerTextField.setText( Integer.toString(answer));

				
				// code ends here
			}
		});
		answerButton.setBounds(264, 114, 46, 19);
		frame.getContentPane().add(answerButton);
	}
}
