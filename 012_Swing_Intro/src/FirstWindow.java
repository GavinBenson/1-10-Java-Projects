import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FirstWindow extends JFrame{
	
	
	public FirstWindow() {
		super("My computer is VERY special!");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//JPanels
		JPanel p1 = new JPanel();
		p1.setBackground(Color.PINK);
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.PINK);
		
		JPanel p3 = new JPanel(new GridBagLayout( ));
		p3.setBackground(Color.CYAN);
		
		JPanel p4 = new JPanel();
		p4.setBackground(Color.BLUE);
		
		JPanel p5 = new JPanel();
		p5.setBackground(Color.BLUE);
		//end jpanels
		
		//start buttons
		JButton b1 = new JButton("Button 1");
		b1.setBackground(Color.CYAN);
		
		JButton b2 = new JButton("Button 2");
		b2.setBackground(Color.CYAN);
		
		
		JCheckBox cb1 = new JCheckBox("Do you love bacon?");
		cb1.setBackground(Color.CYAN);
		
		JCheckBox cb2 = new JCheckBox("Do you love java?");
		Color myNewColor = new Color (150, 100, 250, 100);
		cb2.setBackground(myNewColor);
		
		JLabel myLabel = new JLabel("Fancy Label");
		JLabel myLabel1 = new JLabel("Left side!");
		JLabel myLabel2 = new JLabel("Right Side!");
		JLabel myLabel3 = new JLabel("3");
		JLabel myLabel4 = new JLabel("3");
		JLabel myLabel5 = new JLabel("3");
		JLabel myLabel6 = new JLabel("3");
		JLabel myLabel7 = new JLabel("3");
		JLabel myLabel8 = new JLabel("3");
		JLabel myLabel9 = new JLabel("3");
		JLabel myLabel10 = new JLabel("3");
		JLabel myLabel11 = new JLabel("3");
		JLabel myLabel12 = new JLabel("3");
		JTextArea myTextArea = new JTextArea("Fancy TextArea");
		JTextField myTextField = new JTextField("Fancy TextField");
		
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(15, 15, 15, 15);
		
		//East Panel 1 x 3 (vertical)
		//Center 3 x 3
		//West Panel 2 x 3 (2 across, 3 deep)
		
		p2.add(b1);
		p2.add(b2);
		p1.add(cb1);
		p1.add(cb2);
		p4.add(myLabel1);
		p5.add(myLabel2);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		p3.add(myLabel9, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		p3.add(myLabel10, gbc);
		gbc.gridx = 2;
		gbc.gridy = 0;
		p3.add(myLabel3, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		p3.add(myLabel4, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		p3.add(myLabel5, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		p3.add(myLabel6, gbc);
		gbc.gridx = 1;
		gbc.gridy = 2;
		p3.add(myLabel7, gbc);
		gbc.gridx = 2;
		gbc.gridy = 1;
		p3.add(myLabel8, gbc);
		gbc.gridx = 2;
		gbc.gridy = 2;
		p3.add(myLabel11, gbc);
		
		
		
		add(p1, BorderLayout.SOUTH);
		add(p4, BorderLayout.WEST);
		add(p3, BorderLayout.CENTER);
		add(p5, BorderLayout.EAST);
		add(p2, BorderLayout.NORTH);
		
				
		setVisible(true);
	}
}