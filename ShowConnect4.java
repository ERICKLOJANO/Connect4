package connectFour;

public class ShowConnect4 {

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(
				new Runnable() {
			
			@Override
			public void run() {
				Connect4 C4 = new Connect4();
			}
		});
	}

	
}
