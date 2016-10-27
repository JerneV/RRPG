package rpgPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.SystemColor;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.DropMode;
import java.awt.Color;

public class RpgWindow {


	private JFrame frmJernesRpg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RpgWindow window = new RpgWindow();
					window.frmJernesRpg.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	Main.main(null);
	}

	/**
	 * Create the application.
	 */
	public RpgWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmJernesRpg = new JFrame();
		frmJernesRpg.setTitle("Jerne's RPG ~ 2016-2017");
		frmJernesRpg.setResizable(false);
		frmJernesRpg.setAlwaysOnTop(true);
		frmJernesRpg.getContentPane().setBackground(SystemColor.controlShadow);
		frmJernesRpg.setBounds(100, 100, 882, 495);
		frmJernesRpg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJernesRpg.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 24, 846, 352);
		frmJernesRpg.getContentPane().add(scrollPane);
		
		JTextArea textPane = new JTextArea();
		textPane.setForeground(new Color(0, 255, 0));
		textPane.setBackground(new Color(0, 0, 0));
		scrollPane.setViewportView(textPane);
		textPane.setFont(new Font("Calibri", Font.PLAIN, 11));
		textPane.setEditable(false);
		
				
		
		JTextArea txtrText = new JTextArea();
		txtrText.setForeground(new Color(0, 255, 0));
		txtrText.setDropMode(DropMode.INSERT);
		txtrText.setColumns(0);
		txtrText.setRows(0);
		txtrText.setBackground(new Color(0, 0, 0));
		txtrText.setFont(new Font("Calibri", Font.PLAIN, 13));
		txtrText.setToolTipText("Type here!");
		txtrText.setBounds(10, 387, 709, 58);
		frmJernesRpg.getContentPane().add(txtrText);
		txtrText.addKeyListener(new KeyListener(){
			
			@Override
			public void keyPressed(KeyEvent e) { //Event listener voor Enter, wanneer de tekst verzonden wordt
			    if (e.getKeyCode()==KeyEvent.VK_ENTER){
			    	
			    	String addedText = txtrText.getText(); //Takes the entered text
					textPane.append(addedText + "\n"); //Appends the entered text + a enter
					txtrText.setText(""); //Clears the textpane
					//txtrText.requestFocus(); //Zou de cursus moeten verplaatsen naar beginpunt maara ja
					
			    	
					//Misschien een handige funciton voor later, displayed een dialog box
			        //JOptionPane.showMessageDialog(null , "You've Submitted the name " + txtrText.getText());
			    }

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

		});
		
	
		
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setForeground(new Color(0, 255, 0));
		btnNewButton.setToolTipText("Click here to enter text");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//Should send the text if enter is not used
					String addedText = txtrText.getText(); //Takes the entered text
					textPane.append(addedText + "\n"); //Appends the entered text + a enter
					txtrText.setText(""); //Clears the textpane
					Main.testGen();
					textPane.append(Main.sendText + "\n");
			}
		});
		btnNewButton.setBounds(729, 387, 127, 58);
		frmJernesRpg.getContentPane().add(btnNewButton);
		
	}
//Text van Main.java moet hier geappend kunnen worden om zo gedisplayed te kunnen worden
 public static void printOnScreen(String text){
	 //textPane.append(text + \n);
 }


}
