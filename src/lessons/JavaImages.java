package lessons;

import javax.swing.ImageIcon;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JavaImages {

	// variables
	ImageIcon picture1 = new ImageIcon(getClass().getResource("/resources/MrClean.jpg"));
	ImageIcon picture2 = new ImageIcon(getClass().getResource("/resources/Lysol.jpg"));
	ImageIcon toDisplay = null;
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaImages window = new JavaImages();
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
	public JavaImages() {
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
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(236, 95, 119, 91);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here	
				
				if (toDisplay == null) {
					
					toDisplay = picture1;
				}
				
				else if(toDisplay == picture1)  {
					
					toDisplay = picture2;
				}
				
				else  {
					toDisplay = picture1;
				}
				
				lblNewLabel.setIcon(toDisplay);
				
				
				// button code ends here
			}
		});
		btnNewButton.setBounds(79, 129, 89, 23);
		frame.getContentPane().add(btnNewButton);
		

	}
}
