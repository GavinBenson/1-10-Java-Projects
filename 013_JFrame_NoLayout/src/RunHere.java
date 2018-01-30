import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class RunHere {

	public static void main(String[] args) {

		//Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

	private static void createAndShowGUI() {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame(" There are 4 JPanels in here! ");
        
        //Create and set up the content pane.
        PanelExample_Extended demo = new PanelExample_Extended();
        frame.setContentPane(demo.createContentPane());
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(580, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
        //JOptionPane.showMessageDialog(frame, "U N C O M M E N T");

	}
	
	/*
	 * Checkpoint Grade for fundamental Swing GUI:
	 * 
	 * 
	 * 1. All class code is working properly
	 * 2. Add one more panel to the bottom (3 panels total)
	 * 3. On the outer bottom panel, add "Left" label, and "Right" labe
	 * 4. On the center panel, add a JButton with "Push Me"
	 * 
	 * 
	 */
	
	
}