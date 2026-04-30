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
	
	
	/*
	 * 	array to hold gameBoard
	 * 	blank = 0
	 * 	X = 1
	 * 	O = 2
	 */
	int[] gameBoard = {0, 0, 0, 0, 0, 0, 0, 0, 0};
	
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
				
				// button code starts here
				buttonCode(0);
				// button code ends here
			}
		});
		buttonOne.setBounds(66, 73, 90, 90);
		frame.getContentPane().add(buttonOne);
		
		JButton buttonTwo = new JButton("");
		buttonTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// button code starts here
				buttonCode(1);
				// button code ends here
			}
		});
		buttonTwo.setBounds(172, 73, 90, 90);
		frame.getContentPane().add(buttonTwo);
		
		JButton buttonThree = new JButton("");
		buttonThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				buttonCode(2);
				// button code ends here
			}
		});
		buttonThree.setBounds(278, 73, 90, 90);
		frame.getContentPane().add(buttonThree);
		
		JButton buttonFour = new JButton("");
		buttonFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				buttonCode(3);
				// button code ends here
			}
		});
		buttonFour.setBounds(66, 174, 90, 90);
		frame.getContentPane().add(buttonFour);
		
		JButton buttonFive = new JButton("");
		buttonFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				buttonCode(4);
				// button code ends here
			}
		});
		buttonFive.setBounds(172, 174, 90, 90);
		frame.getContentPane().add(buttonFive);
		
		JButton buttonSix = new JButton("");
		buttonSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				buttonCode(5);
				// button code ends here
			}
		});
		buttonSix.setBounds(278, 174, 90, 90);
		frame.getContentPane().add(buttonSix);
		
		JButton buttonSeven = new JButton("");
		buttonSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				buttonCode(6);
				// button code ends here
			}
		});
		buttonSeven.setBounds(66, 275, 90, 90);
		frame.getContentPane().add(buttonSeven);
		
		JButton buttonEight = new JButton("");
		buttonEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				buttonCode(7);
				// button code ends here
			}
		});
		buttonEight.setBounds(172, 275, 90, 90);
		frame.getContentPane().add(buttonEight);
		
		JButton buttonNine = new JButton("");
		buttonNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				buttonCode(8);
				// button code ends here
			}
		});
		buttonNine.setBounds(278, 275, 90, 90);
		frame.getContentPane().add(buttonNine);
		
		// put all buttons into array, this must be done here,
		// after buttons have been generated
		buttons[0] = buttonOne;
		buttons[1] = buttonTwo;
		buttons[2] = buttonThree;
		buttons[3] = buttonFour;
		buttons[4] = buttonFive;
		buttons[5] = buttonSix;
		buttons[6] = buttonSeven;
		buttons[7] = buttonEight;
		buttons[8] = buttonNine;
		
		JButton xButton = new JButton("X");
		xButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				xTurn = true;
				oTurn = false;
				displayBlanks();
				resetGameBoard();
				printGameBoard();
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
				displayBlanks();
				resetGameBoard();
				printGameBoard();
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
	
	// this method displays blank images to all buttons
	// used when the "X" or "O" button is pressed
	public void displayBlanks()  {
		
		for(int i=0; i<buttons.length; i++)  {
			
			buttons[i].setIcon(blank);
		}
	}
	
	// this method sets gameBoard to all 0's
	public void resetGameBoard()  {
		
		gameBoard[0] = 0;	
	}
	
	
	// prints gameBoard so we can see it
	public void printGameBoard()  {
	
		System.out.print("GAMEBOARD: ");
		
		for(int i=0; i<gameBoard.length; i++)  {
			
			System.out.print(gameBoard[i] + " ");
		}
		
		System.out.println();
	}
	
	
	// code for all buttons
	public void buttonCode(int n)  {
		
		System.out.println("Button " + n + " code activated ...");
	}
	
}
