package lessons;

import javax.swing.Icon;		// needed for images
import javax.swing.ImageIcon;	// needed for images

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToe {

	// variables
	
	// 3 images used for game
	ImageIcon x = new ImageIcon(getClass().getResource("/resources/x.png"));
	ImageIcon o = new ImageIcon(getClass().getResource("/resources/o.png"));
	ImageIcon blank = new ImageIcon(getClass().getResource("/resources/blank.png"));

	// array to hold all buttons
	JButton[] buttons = new JButton[9];
	
	// trackers
	boolean xTurn = false;
	boolean oTurn = false;
	boolean gameOver = false;
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 456, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tic Tac Toe");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(172, 24, 91, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JButton buttonOne = new JButton("");
		buttonOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonOne.setBounds(66, 73, 90, 90);
		frame.getContentPane().add(buttonOne);
		
		JButton buttonTwo = new JButton("");
		buttonTwo.setBounds(172, 73, 90, 90);
		frame.getContentPane().add(buttonTwo);
		
		JButton buttonThree = new JButton("");
		buttonThree.setBounds(278, 73, 90, 90);
		frame.getContentPane().add(buttonThree);
		
		JButton buttonFour = new JButton("");
		buttonFour.setBounds(66, 174, 90, 90);
		frame.getContentPane().add(buttonFour);
		
		JButton buttonFive = new JButton("");
		buttonFive.setBounds(172, 174, 90, 90);
		frame.getContentPane().add(buttonFive);
		
		JButton buttonSix = new JButton("");
		buttonSix.setBounds(278, 174, 90, 90);
		frame.getContentPane().add(buttonSix);
		
		JButton buttonSeven = new JButton("");
		buttonSeven.setBounds(66, 275, 90, 90);
		frame.getContentPane().add(buttonSeven);
		
		JButton buttonEight = new JButton("");
		buttonEight.setBounds(172, 275, 90, 90);
		frame.getContentPane().add(buttonEight);
		
		JButton buttonNine = new JButton("");
		buttonNine.setBounds(278, 275, 90, 90);
		frame.getContentPane().add(buttonNine);
		
		JButton xButton = new JButton("X");
		xButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				xTurn = true;
				oTurn = false;
				
				// button code ends here
			}
		});
		xButton.setBounds(67, 392, 89, 23);
		frame.getContentPane().add(xButton);
		
		JButton oButton = new JButton("O");
		oButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				xTurn = false;
				oTurn = true;
				
				// button code ends here
			}
		});
		oButton.setBounds(172, 392, 89, 23);
		frame.getContentPane().add(oButton);
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				System.exit(0);
				// button code ends here
			}
		});
		exitButton.setBounds(279, 392, 89, 23);
		frame.getContentPane().add(exitButton);
		
		JLabel lblNewLabel_1 = new JLabel("First player picks X or O to start/reset.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(88, 426, 284, 28);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
