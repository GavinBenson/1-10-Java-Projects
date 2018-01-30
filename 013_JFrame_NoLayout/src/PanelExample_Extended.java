import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelExample_Extended {

	public JPanel createContentPane() {

		// We create a bottom JPanel to place everything on.
		JPanel totalGUI = new JPanel();

		// We set the Layout Manager to null so we can manually place
		// the Panels.
		totalGUI.setLayout(null);

		// Now we create a new panel, size it, shape it,color it red.
		// then add it to the bottom JPanel.

		JPanel redPanel = new JPanel();
		redPanel.setLayout(null);
		redPanel.setBackground(Color.RED);
		redPanel.setLocation(10, 35);
		redPanel.setSize(100, 100);
		totalGUI.add(redPanel);

		JPanel bluePanel = new JPanel();
		bluePanel.setLayout(null);
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setLocation(460, 35);
		bluePanel.setSize(100, 100);
		totalGUI.add(bluePanel);

		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setLocation(120, 35);
		greenPanel.setSize(330, 100);
		totalGUI.add(greenPanel);

		JPanel pinkPanel = new JPanel();
		pinkPanel.setLayout(null);
		pinkPanel.setBackground(Color.PINK);
		pinkPanel.setLocation(10, 145);
		pinkPanel.setSize(550, 100);
		totalGUI.add(pinkPanel);
		
		
		JPanel cyanPanel = new JPanel();
		cyanPanel.setLayout(null);
		cyanPanel.setBackground(Color.CYAN);
		cyanPanel.setLocation(10, 10);
		cyanPanel.setSize(530, 70);
		pinkPanel.add(cyanPanel);
		
		
		JPanel bluePanel1 = new JPanel();
		bluePanel1.setLayout(null);
		bluePanel1.setBackground(Color.BLUE);
		bluePanel1.setLocation(10, 10);
		bluePanel1.setSize(510, 50);
		cyanPanel.add(bluePanel1);

		JButton startButton = new JButton("Start");
		startButton.setBounds(15, 40, 70, 20);
		bluePanel.add(startButton);

		JButton stopButton = new JButton("Stop");
		stopButton.setBounds(15, 40, 70, 20);
		redPanel.add(stopButton);
		
		JButton pressButton = new JButton("Press me");
		pressButton.setBounds(15, 40, 70, 20);
		greenPanel.add(pressButton);
		
		JButton pushButton = new JButton("Push me");
		pushButton.setBounds(210, 10, 100, 20);
		bluePanel1.add(pushButton);

		
		JLabel redLabel = new JLabel("Red");
		redLabel.setLocation(10, 0);
		redLabel.setSize(50, 40);
		redLabel.setHorizontalAlignment(2);
		redPanel.add(redLabel);
		
		JLabel leftLabel = new JLabel("Left");
		leftLabel.setLocation(1, 70);
		leftLabel.setSize(50, 40);
		leftLabel.setHorizontalAlignment(2);
		pinkPanel.add(leftLabel);
		
		JLabel rightLabel = new JLabel("Right");
		rightLabel.setLocation(510, 70);
		rightLabel.setSize(50, 40);
		rightLabel.setHorizontalAlignment(2);
		pinkPanel.add(rightLabel);

		
		// Finally we return the JPanel.
		totalGUI.setOpaque(true);
		totalGUI.setBackground(Color.YELLOW);
		return totalGUI;
	}
}