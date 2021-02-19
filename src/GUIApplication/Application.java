package GUIApplication;

import java.awt.EventQueue;

public class Application {
	//Instantiating data access layer object, view object and a controller object and connecting them.
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FancyJavaClientWithGUI client = new FancyJavaClientWithGUI();
					Controller controller = new Controller(client);
					client.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
