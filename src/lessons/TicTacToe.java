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
	ImageIcon x = new ImageIcon(getClass().getResource("/resources/x.png"));
	ImageIcon o = new ImageIcon(getClass().getResource("/resources/o.png"));
	ImageIcon blank = new ImageIcon(getClass().getResource("/resources/blank.png"));
	JButton[] buttons = new JButton[9];  // to hold all the buttons
	int[] gameBoard = new int[9];  // Gameboard is used to track x's and o's (0 = no pick, 1=x, 2=o)


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
			}
		});
		zeroButton.setBounds(47, 74, 90, 90);
		frame.getContentPane().add(zeroButton);
		
		JButton oneButton = new JButton("");
		oneButton.setBounds(168, 74, 90, 90);
		frame.getContentPane().add(oneButton);
		
		JButton twoButton = new JButton("");
		twoButton.setBounds(290, 74, 90, 90);
		frame.getContentPane().add(twoButton);
		
		JButton threeButton = new JButton("");
		threeButton.setBounds(47, 186, 90, 90);
		frame.getContentPane().add(threeButton);
		
		JButton fourButton = new JButton("");
		fourButton.setBounds(168, 186, 90, 90);
		frame.getContentPane().add(fourButton);
		
		JButton fiveButton = new JButton("");
		fiveButton.setBounds(290, 186, 90, 90);
		frame.getContentPane().add(fiveButton);
		
		JButton sixButton = new JButton("");
		sixButton.setBounds(47, 295, 90, 90);
		frame.getContentPane().add(sixButton);
		
		JButton sevenButton = new JButton("");
		sevenButton.setBounds(168, 295, 90, 90);
		frame.getContentPane().add(sevenButton);
		
		JButton eightButton = new JButton("");
		eightButton.setBounds(290, 295, 90, 90);
		frame.getContentPane().add(eightButton);
		
		JButton xButton = new JButton("X");
		xButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				
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
			
				// display blank images on all buttons
				for (int i=0; i<buttons.length; i++)  {
					
					buttons[i].setIcon(blank);
				}
				
				
				// button code ends here
			}
		});
		xButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		xButton.setBounds(94, 413, 43, 35);
		frame.getContentPane().add(xButton);
		
		JButton oButton = new JButton("O");
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
		
		JLabel infoLabel = new JLabel("First player picks X or O to start/reset.");
		infoLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		infoLabel.setBounds(116, 473, 227, 23);
		frame.getContentPane().add(infoLabel);
	}
}
