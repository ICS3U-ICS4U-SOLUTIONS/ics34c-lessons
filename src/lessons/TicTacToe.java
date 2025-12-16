package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// THESE ARE THE ONLY TWO IMPORTS NEEDED
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class TicTacToe {

	// variables
	private JFrame frame;
	
	// 3 images used for game
	ImageIcon x = new ImageIcon(getClass().getResource("/resources/x.png"));
	ImageIcon o = new ImageIcon(getClass().getResource("/resources/o.png"));
	ImageIcon blank = new ImageIcon(getClass().getResource("/resources/blank.png"));

	// 2 arrays
	JButton[] buttons = new JButton[9];  // to hold all the buttons
	int[] gameBoard = new int[9];  // Gameboard is used to track x's and o's (0 = no pick, 1=x, 2=o)
	
	// 3 booleans
	boolean xTurn = false;
	boolean oTurn = false;
	boolean gameOver = false;
	
	// make the infoLabel visible through any method (without having to pass as argument)
	// this was moved from the initialize method without any changes
	JLabel infoLabel = new JLabel("First player picks X or O to start/reset.");
	
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
		frame.setBounds(100, 100, 448, 558);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel titleLabel = new JLabel("Mr. Wong's Tic Tac Toe");
		titleLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		titleLabel.setBounds(115, 34, 228, 35);
		frame.getContentPane().add(titleLabel);
		
		JButton zeroButton = new JButton("");
		zeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buttonCode(0);
			}
		});
		zeroButton.setBounds(47, 74, 90, 90);
		frame.getContentPane().add(zeroButton);
		
		JButton oneButton = new JButton("");
		oneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buttonCode(1); 
			}
		});
		oneButton.setBounds(168, 74, 90, 90);
		frame.getContentPane().add(oneButton);
		
		JButton twoButton = new JButton("");
		twoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buttonCode(2);
			}
		});
		twoButton.setBounds(290, 74, 90, 90);
		frame.getContentPane().add(twoButton);
		
		JButton threeButton = new JButton("");
		threeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buttonCode(3);
			}
		});
		threeButton.setBounds(47, 186, 90, 90);
		frame.getContentPane().add(threeButton);
		
		JButton fourButton = new JButton("");
		fourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buttonCode(4);
			}
		});
		fourButton.setBounds(168, 186, 90, 90);
		frame.getContentPane().add(fourButton);
		
		JButton fiveButton = new JButton("");
		fiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buttonCode(5);
			}
		});
		fiveButton.setBounds(290, 186, 90, 90);
		frame.getContentPane().add(fiveButton);
		
		JButton sixButton = new JButton("");
		sixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buttonCode(6);
			}
		});
		sixButton.setBounds(47, 295, 90, 90);
		frame.getContentPane().add(sixButton);
		
		JButton sevenButton = new JButton("");
		sevenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buttonCode(7);
			}
		});
		sevenButton.setBounds(168, 295, 90, 90);
		frame.getContentPane().add(sevenButton);
		
		JButton eightButton = new JButton("");
		eightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buttonCode(8);
			}
		});
		eightButton.setBounds(290, 295, 90, 90);
		frame.getContentPane().add(eightButton);
		
		// put all buttons into an array			
		buttons[0] = zeroButton; 
		buttons[1] = oneButton;
		buttons[2] = twoButton;
		buttons[3] = threeButton;
		buttons[4] = fourButton;
		buttons[5] = fiveButton;
		buttons[6] = sixButton;
		buttons[7] = sevenButton;
		buttons[8] = eightButton;
		
		JButton xButton = new JButton("X");
		xButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				xTurn = true;
				oTurn = false;
				initializeGame();
				// button code ends here
			}
		});
		xButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		xButton.setBounds(94, 413, 43, 35);
		frame.getContentPane().add(xButton);
		
		JButton oButton = new JButton("O");
		oButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				xTurn = false;
				oTurn = true;
				initializeGame();	
				// button code ends here
				
			}
		});
		oButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		oButton.setBounds(179, 413, 43, 35);
		frame.getContentPane().add(oButton);
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// exit button code starts here
				
				System.exit(0);
				// exit button code ends here
			}
		});
		exitButton.setBounds(271, 419, 89, 23);
		frame.getContentPane().add(exitButton);
		
		infoLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		infoLabel.setBounds(116, 473, 227, 23);
		frame.getContentPane().add(infoLabel);
	}
	
	public void initializeGame()  {
		
		gameOver = false;
		
		// display blank images on all buttons
		for (int i=0; i<buttons.length; i++)  {
			
			buttons[i].setIcon(blank);
		}
		
		// set gameBoard to all zero's
		for(int i=0; i<gameBoard.length; i++)  {
		
			gameBoard[i] = 0;
		}
	}
	
	// this method is used by every button
	public void buttonCode(int square)  {
		
		// check if game is over
		if (gameOver == true)  {
			
			return;   // kicks out of method, nothing will happen
		}
		
		// check if button has been picked already
		if (gameBoard[square] != 0)  {
			
			return;
		}
		
		// x's turn
		if (xTurn == true)  {
			
			// display x on square
			buttons[square].setIcon(x);
			
			// keep track of game on gameBoard
			gameBoard[square] = 1;
			
			// set xTurn to false
			xTurn = false;
			
			// set oTurn to true
			oTurn = true;
		}
		
		// o's turn
		else if (oTurn ==  true)  {
			
			// display o on square
			buttons[square].setIcon(o);
			
			// keep track of game on gameBoard
			gameBoard[square] = 2;
			
			// set xTurn to true
			xTurn = true;
			
			// set oTurn to false
			oTurn = false;
		}
		
		checkForWinner();
		
	}
	
	
	public void checkForWinner()  {
	
		
		// check if X won with top row
		if ( gameBoard[0] == 1 && gameBoard[1] == 1 && gameBoard[2] == 1)  {
			
			gameOver = true;
			infoLabel.setText("X is the winner");
		}
		
		// check if O won
		if ( false )  {
			
			
			gameOver = true;
			infoLabel.setText("O is the winner");
		}
		
		// check if tie game
		
		
		
	}
	
	
}
