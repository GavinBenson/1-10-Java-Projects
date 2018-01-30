package stopwatch;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Stopwatch extends JFrame {

	long startTime;
	long stopTime;
	double elapsedTime;
	boolean timeStarted = false;
	String runner1 = "a";
	String runner2 = "b";
	String runner3 = "c";
	String runner4 = "d";
	String runner5 = "e";
	String runner6 = "f";
	String runner7 = "g";

	JButton startButton = new JButton();
	JLabel startLabel = new JLabel();
	JTextField startTextField = new JTextField();

	JButton stopButton = new JButton();
	JLabel stopLabel = new JLabel();
	JTextField stopTextField = new JTextField();
	JButton stopButton2 = new JButton();
	JLabel stopLabel2 = new JLabel();
	JTextField stopTextField2 = new JTextField();
	JButton stopButton3 = new JButton();
	JLabel stopLabel3 = new JLabel();
	JTextField stopTextField3 = new JTextField();
	JButton stopButton4 = new JButton();
	JLabel stopLabel4 = new JLabel();
	JTextField stopTextField4 = new JTextField();
	JButton stopButton5 = new JButton();
	JLabel stopLabel5 = new JLabel();
	JTextField stopTextField5 = new JTextField();
	JButton stopButton6 = new JButton();
	JLabel stopLabel6 = new JLabel();
	JTextField stopTextField6 = new JTextField();
	JButton stopButton7 = new JButton();
	JLabel stopLabel7 = new JLabel();
	JTextField stopTextField7 = new JTextField();

	JButton exitButton = new JButton();

	JLabel elapsedLabel = new JLabel();
	JTextField elapsedTextField = new JTextField();
	JLabel elapsedLabel2 = new JLabel();
	JTextField elapsedTextField2 = new JTextField();
	JLabel elapsedLabel3 = new JLabel();
	JTextField elapsedTextField3 = new JTextField();
	JLabel elapsedLabel4 = new JLabel();
	JTextField elapsedTextField4 = new JTextField();
	JLabel elapsedLabel5 = new JLabel();
	JTextField elapsedTextField5 = new JTextField();
	JLabel elapsedLabel6 = new JLabel();
	JTextField elapsedTextField6 = new JTextField();
	JLabel elapsedLabel7 = new JLabel();
	JTextField elapsedTextField7 = new JTextField();

	public Stopwatch(String title) {

		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		for (int i=0; i<7; i++) {
			
			if (i == 0) {
				runner1 = JOptionPane.showInputDialog("Enter runner " + (i+1) + "name: ");
			}
			else if (i==1) {	
				runner2 = JOptionPane.showInputDialog("Enter runner " + (i+1) + "name: ");
			}
			else if (i==2) {	
				runner3 = JOptionPane.showInputDialog("Enter runner " + (i+1) + "name: ");
			}
			else if (i==3) {	
				runner4 = JOptionPane.showInputDialog("Enter runner " + (i+1) + "name: ");
			}
			else if (i==4) {	
				runner5 = JOptionPane.showInputDialog("Enter runner " + (i+1) + "name: ");
			}
			else if (i==5) {	
				runner6 = JOptionPane.showInputDialog("Enter runner " + (i+1) + "name: ");
			}
			else if (i==6) {	
				runner7 = JOptionPane.showInputDialog("Enter runner " + (i+1) + "name: ");
			}
			//i++;
		}

		// Create and set up the content pane.d
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints gridConstraints = new GridBagConstraints();

		// Create and set up the components
		startButton.setText("Start Timing");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 0;
		getContentPane().add(startButton, gridConstraints);

		// Add an Action Listener to detect and respond to clicks
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startButtonActionPerformed(e);
			}

		});

		startLabel.setText("  Start System Time  ");
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 0;
		getContentPane().add(startLabel, gridConstraints);

		startTextField.setText("");
		startTextField.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 0;
		getContentPane().add(startTextField, gridConstraints);

		stopButton.setText("Stop Timing");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 1;
		getContentPane().add(stopButton, gridConstraints);
		
		stopButton2.setText("Stop Timing");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 2;
		getContentPane().add(stopButton2, gridConstraints);
		
		stopButton3.setText("Stop Timing");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 3;
		getContentPane().add(stopButton3, gridConstraints);
		
		stopButton4.setText("Stop Timing");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 4;
		getContentPane().add(stopButton4, gridConstraints);
		
		stopButton5.setText("Stop Timing");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 5;
		getContentPane().add(stopButton5, gridConstraints);
		
		stopButton6.setText("Stop Timing");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 6;
		getContentPane().add(stopButton6, gridConstraints);
		
		stopButton7.setText("Stop Timing");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 7;
		getContentPane().add(stopButton7, gridConstraints);
	

		stopButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopButtonActionPerformed(e);
			}

		});
		
		stopButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopButton2ActionPerformed(e);
			}

		});
		
		stopButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopButton3ActionPerformed(e);
			}

		});
		
		stopButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopButton4ActionPerformed(e);
			}

		});
		
		stopButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopButton5ActionPerformed(e);
			}

		});
		
		stopButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopButton6ActionPerformed(e);
			}

		});
		
		stopButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopButton7ActionPerformed(e);
			}

		});
		

		stopLabel.setText(runner1);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 1;
		getContentPane().add(stopLabel, gridConstraints);
		
		stopLabel2.setText(runner2);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 2;
		getContentPane().add(stopLabel2, gridConstraints);
		
		stopLabel3.setText(runner3);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 3;
		getContentPane().add(stopLabel3, gridConstraints);
		
		stopLabel4.setText(runner4);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 4;
		getContentPane().add(stopLabel4, gridConstraints);
		
		stopLabel5.setText(runner5);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 5;
		getContentPane().add(stopLabel5, gridConstraints);
		
		stopLabel6.setText(runner6);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 6;
		getContentPane().add(stopLabel6, gridConstraints);
		
		stopLabel7.setText(runner7);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 7;
		getContentPane().add(stopLabel7, gridConstraints);
		
		

		stopTextField.setText("");
		stopTextField.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 1;
		getContentPane().add(stopTextField, gridConstraints);

		stopTextField2.setText("");
		stopTextField2.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 2;
		getContentPane().add(stopTextField2, gridConstraints);
		
		stopTextField3.setText("");
		stopTextField3.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 3;
		getContentPane().add(stopTextField3, gridConstraints);

		stopTextField4.setText("");
		stopTextField4.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 4;
		getContentPane().add(stopTextField4, gridConstraints);
		
		stopTextField5.setText("");
		stopTextField5.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 5;
		getContentPane().add(stopTextField5, gridConstraints);

		stopTextField6.setText("");
		stopTextField6.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 6;
		getContentPane().add(stopTextField6, gridConstraints);
		
		stopTextField7.setText("");
		stopTextField7.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 7;
		getContentPane().add(stopTextField7, gridConstraints);



		exitButton.setText("Close ALL Watches");
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 8;
		getContentPane().add(exitButton, gridConstraints);

		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exitButtonActionPerformed(e);
			}

			

		});
		

		elapsedLabel.setText("  Elapsed Time Seconds  ");
		gridConstraints.gridx = 3;
		gridConstraints.gridy = 1;
		getContentPane().add(elapsedLabel, gridConstraints);
		
		elapsedLabel2.setText("  Elapsed Time Seconds  ");
		gridConstraints.gridx = 3;
		gridConstraints.gridy = 2;
		getContentPane().add(elapsedLabel2, gridConstraints);
		
		elapsedLabel3.setText("  Elapsed Time Seconds  ");
		gridConstraints.gridx = 3;
		gridConstraints.gridy = 3;
		getContentPane().add(elapsedLabel3, gridConstraints);
		
		elapsedLabel4.setText("  Elapsed Time Seconds  ");
		gridConstraints.gridx = 3;
		gridConstraints.gridy = 4;
		getContentPane().add(elapsedLabel4, gridConstraints);
		
		elapsedLabel5.setText("  Elapsed Time Seconds  ");
		gridConstraints.gridx = 3;
		gridConstraints.gridy = 5;
		getContentPane().add(elapsedLabel5, gridConstraints);
		
		elapsedLabel6.setText("  Elapsed Time Seconds  ");
		gridConstraints.gridx = 3;
		gridConstraints.gridy = 6;
		getContentPane().add(elapsedLabel6, gridConstraints);
		
		elapsedLabel7.setText("  Elapsed Time Seconds  ");
		gridConstraints.gridx = 3;
		gridConstraints.gridy = 7;
		getContentPane().add(elapsedLabel7, gridConstraints);

		
		elapsedTextField.setText("");
		elapsedTextField.setColumns(20);
		gridConstraints.gridx = 4;
		gridConstraints.gridy = 1;
		getContentPane().add(elapsedTextField, gridConstraints);
		
		elapsedTextField2.setText("");
		elapsedTextField2.setColumns(20);
		gridConstraints.gridx = 4;
		gridConstraints.gridy = 2;
		getContentPane().add(elapsedTextField2, gridConstraints);
		
		elapsedTextField3.setText("");
		elapsedTextField3.setColumns(20);
		gridConstraints.gridx = 4;
		gridConstraints.gridy = 3;
		getContentPane().add(elapsedTextField3, gridConstraints);
		
		elapsedTextField4.setText("");
		elapsedTextField4.setColumns(20);
		gridConstraints.gridx = 4;
		gridConstraints.gridy = 4;
		getContentPane().add(elapsedTextField4, gridConstraints);
		
		elapsedTextField5.setText("");
		elapsedTextField5.setColumns(20);
		gridConstraints.gridx = 4;
		gridConstraints.gridy = 5;
		getContentPane().add(elapsedTextField5, gridConstraints);
		
		elapsedTextField6.setText("");
		elapsedTextField6.setColumns(20);
		gridConstraints.gridx = 4;
		gridConstraints.gridy = 6;
		getContentPane().add(elapsedTextField6, gridConstraints);
		
		elapsedTextField7.setText("");
		elapsedTextField7.setColumns(20);
		gridConstraints.gridx = 4;
		gridConstraints.gridy = 7;
		getContentPane().add(elapsedTextField7, gridConstraints);
	

		// Make the window visible, and set the size to either a fixed size, or
		// have it packed tight
		setLocationRelativeTo(null);
		// setSize(500, 500);
		pack();
		// setVisible(true);

	} // end of constructor

	private void startButtonActionPerformed(ActionEvent e) {
		startTime = System.currentTimeMillis();

		Date startDate = new Date();
		startTextField.setText(startDate.toString());
		// startTextField.setText(String.valueOf(startTime));
		stopTextField.setText("");
		elapsedTextField.setText("");
		timeStarted = true;

	}

	private void stopButtonActionPerformed(ActionEvent e) {
		if (timeStarted) {
			stopTime = System.currentTimeMillis();
			Date stopDate = new Date();
			stopTextField.setText(stopDate.toString());
			// stopTextField.setText(String.valueOf(stopTime));
			elapsedTime = (stopTime - startTime) / 1000.0;
			elapsedTextField.setText(String.valueOf(elapsedTime));
		} else {
			return;
		}

	}
	
	private void stopButton2ActionPerformed(ActionEvent e) {
		if (timeStarted) {
			stopTime = System.currentTimeMillis();
			Date stopDate = new Date();
			stopTextField2.setText(stopDate.toString());
			// stopTextField.setText(String.valueOf(stopTime));
			elapsedTime = (stopTime - startTime) / 1000.0;
			elapsedTextField2.setText(String.valueOf(elapsedTime));
		} else {
			return;
		}

	}
	
	private void stopButton3ActionPerformed(ActionEvent e) {
		if (timeStarted) {
			stopTime = System.currentTimeMillis();
			Date stopDate = new Date();
			stopTextField3.setText(stopDate.toString());
			// stopTextField.setText(String.valueOf(stopTime));
			elapsedTime = (stopTime - startTime) / 1000.0;
			elapsedTextField3.setText(String.valueOf(elapsedTime));
		} else {
			return;
		}

	}
	
	private void stopButton4ActionPerformed(ActionEvent e) {
		if (timeStarted) {
			stopTime = System.currentTimeMillis();
			Date stopDate = new Date();
			stopTextField4.setText(stopDate.toString());
			// stopTextField.setText(String.valueOf(stopTime));
			elapsedTime = (stopTime - startTime) / 1000.0;
			elapsedTextField4.setText(String.valueOf(elapsedTime));
		} else {
			return;
		}

	}
	
	private void stopButton5ActionPerformed(ActionEvent e) {
		if (timeStarted) {
			stopTime = System.currentTimeMillis();
			Date stopDate = new Date();
			stopTextField5.setText(stopDate.toString());
			// stopTextField.setText(String.valueOf(stopTime));
			elapsedTime = (stopTime - startTime) / 1000.0;
			elapsedTextField5.setText(String.valueOf(elapsedTime));
		} else {
			return;
		}

	}
	
	private void stopButton6ActionPerformed(ActionEvent e) {
		if (timeStarted) {
			stopTime = System.currentTimeMillis();
			Date stopDate = new Date();
			stopTextField6.setText(stopDate.toString());
			// stopTextField.setText(String.valueOf(stopTime));
			elapsedTime = (stopTime - startTime) / 1000.0;
			elapsedTextField6.setText(String.valueOf(elapsedTime));
		} else {
			return;
		}

	}
	
	private void stopButton7ActionPerformed(ActionEvent e) {
		if (timeStarted) {
			stopTime = System.currentTimeMillis();
			Date stopDate = new Date();
			stopTextField7.setText(stopDate.toString());
			// stopTextField.setText(String.valueOf(stopTime));
			elapsedTime = (stopTime - startTime) / 1000.0;
			elapsedTextField7.setText(String.valueOf(elapsedTime));
		} else {
			return;
		}

	}
	
	
	private void exitButtonActionPerformed(ActionEvent e) {
		System.exit(0);
		
	}

} // end of class