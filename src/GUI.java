import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GUI extends Program {

	void si() {
	
	SwingUtilities.invokeLater(new Runnable() {
		
		public void run() {
			
			JFrame frame = new JFrame("MEWA yacht rental system");
			frame.setSize(600, 500);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		}
		
	});
	
	}
}
	
	


