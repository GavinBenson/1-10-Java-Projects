import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScoreBoard implements ActionListener {
	
	// example ...Scoreboard extends JFrame implements ActionListener GOOD
	// emaple. .. Score board etends jframe implemetns ActionListener, anotherone, GOOD
	// emaple. .. Score board etends jframe, jpanel implemetns actionlistener, anotherone, GOOD
	
	// extends means inherit - use all vars and methods of the superclass
	// implements mean you must use an "interface"
	
	int homeScoreAmount = 0;
	int visitorScoreAmount = 0;
	
	JPanel titlePanel, scorePanel, buttonPanel;
	JLabel homeLabel, visitorLabel, homeScore, visitorScore;
	JButton a1h, a2h, a3h, a6h, m1h, a1v, a2v, a3v, a6v, m1v, resetButton;
	
	public Container createContentPane() {
		
		
		JPanel totalGUI = new JPanel();
		totalGUI.setSize(400,300);
		totalGUI.setBackground(Color.BLUE);
		totalGUI.setLayout(null);
		
		
		titlePanel = new JPanel();
		titlePanel.setLayout(null);
		titlePanel.setLocation(10, 10);
		titlePanel.setSize(370, 30);
		titlePanel.setBackground(Color.LIGHT_GRAY);
		totalGUI.add(titlePanel);
		
		homeLabel = new JLabel("Home Team");
		homeLabel.setLocation(0, 0);
		homeLabel.setSize(200, 30);
		homeLabel.setHorizontalAlignment(0);
		homeLabel.setForeground(Color.RED);
		titlePanel.add(homeLabel);
		
		visitorLabel = new JLabel("Visitor Team");
		visitorLabel.setLocation(160, 0);
		visitorLabel.setSize(200, 30);
		visitorLabel.setHorizontalAlignment(0);
		visitorLabel.setForeground(Color.RED);
		titlePanel.add(visitorLabel);
		
		scorePanel = new JPanel();
		scorePanel.setLayout(null);
		scorePanel.setLocation(10, 50);
		scorePanel.setSize(370, 30);
		totalGUI.add(scorePanel);
		
		homeScore = new JLabel("" + homeScoreAmount);
		homeScore.setLocation(0, 0);
		homeScore.setSize(200, 30);
		homeScore.setHorizontalAlignment(0);
		scorePanel.add(homeScore);
		
		visitorScore = new JLabel("" + visitorScoreAmount);
		visitorScore.setLocation(160, 0);
		visitorScore.setSize(200, 30);
		visitorScore.setHorizontalAlignment(0);
		scorePanel.add(visitorScore);
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(null);
		buttonPanel.setLocation(10, 80);
		buttonPanel.setSize(370, 200);
		totalGUI.add(buttonPanel);
		
		
		a1h = new JButton("+1");
		a1h.setLocation(10, 0);
		a1h.setSize(160, 30);
		a1h.addActionListener(this);
		buttonPanel.add(a1h);
		
		a1v = new JButton("+1");
		a1v.setLocation(180, 0);
		a1v.setSize(172, 30);
		a1v.addActionListener(this);
		buttonPanel.add(a1v);
		
		a2h = new JButton("+2");
		a2h.setLocation(10, 32);
		a2h.setSize(160, 30);
		a2h.addActionListener(this);
		buttonPanel.add(a2h);
		
		a2v = new JButton("+2");
		a2v.setLocation(180, 32);
		a2v.setSize(172, 30);
		a2v.addActionListener(this);
		buttonPanel.add(a2v);
		
		a3h = new JButton("+3");
		a3h.setLocation(10, 64);
		a3h.setSize(160, 30);
		a3h.addActionListener(this);
		buttonPanel.add(a3h);
		
		a3v = new JButton("+3");
		a3v.setLocation(180, 64);
		a3v.setSize(172, 30);
		a3v.addActionListener(this);
		buttonPanel.add(a3v);
		
		a6h = new JButton("+6");
		a6h.setLocation(10, 96);
		a6h.setSize(160, 30);
		a6h.addActionListener(this);
		buttonPanel.add(a6h);
		
		a6v = new JButton("+6");
		a6v.setLocation(180, 96);
		a6v.setSize(172, 30);
		a6v.addActionListener(this);
		buttonPanel.add(a6v);
		
		m1h = new JButton("-1");
		m1h.setLocation(10, 128);
		m1h.setSize(160, 30);
		m1h.addActionListener(this);
		buttonPanel.add(m1h);
		
		m1v = new JButton("-1");
		m1v.setLocation(180, 128);
		m1v.setSize(172, 30);
		m1v.addActionListener(this);
		buttonPanel.add(m1v);
				
		resetButton = new JButton("Reset");
		resetButton.setLocation(100, 160);
		resetButton.setSize(160, 30);
		resetButton.addActionListener(this);
		buttonPanel.add(resetButton);
		
		return totalGUI;
		
		/*
		 * +1 button
		 * +2 button
		 * +3 button
		 * +6 button
		 * -1 button
		 * both sides
		 */
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == a1h) {
			homeScoreAmount = homeScoreAmount + 1;
			homeScore.setText("" + homeScoreAmount);
		} else if (e.getSource() == a1v) {
			visitorScoreAmount = visitorScoreAmount + 1;
			visitorScore.setText("" + visitorScoreAmount);
		} else if (e.getSource() == a2h) {
			homeScoreAmount = homeScoreAmount + 2;
			homeScore.setText("" + homeScoreAmount);
		} else if (e.getSource() == a2v) {
			visitorScoreAmount = visitorScoreAmount + 2;
			visitorScore.setText("" + visitorScoreAmount);
		} else if (e.getSource() == a3h) {
			homeScoreAmount = homeScoreAmount + 3;
			homeScore.setText("" + homeScoreAmount);
		} else if (e.getSource() == a3v) {
			visitorScoreAmount = visitorScoreAmount + 3;
			visitorScore.setText("" + visitorScoreAmount);
		} else if (e.getSource() == a6h) {
			homeScoreAmount = homeScoreAmount + 6;
			homeScore.setText("" + homeScoreAmount);
		} else if (e.getSource() == a6v) {
			visitorScoreAmount = visitorScoreAmount + 6;
			visitorScore.setText("" + visitorScoreAmount);
		} else if (e.getSource() == m1h) {
			homeScoreAmount = homeScoreAmount - 1;
			homeScore.setText("" + homeScoreAmount);
		} else if (e.getSource() == m1v) {
			visitorScoreAmount = visitorScoreAmount - 1;
			visitorScore.setText("" + visitorScoreAmount);
		}else if (e.getSource() == resetButton) {
			homeScoreAmount = 0;
			visitorScoreAmount = 0;
			homeScore.setText("" + homeScoreAmount);
			visitorScore.setText("" + visitorScoreAmount);
		}
	}
}