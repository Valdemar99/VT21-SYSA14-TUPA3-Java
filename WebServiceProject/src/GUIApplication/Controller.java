package GUIApplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Controller {
	//Instance variables
	private DataAccessLayer data;
	private FancyJavaClientWithGUI client;
	
	public Controller(FancyJavaClientWithGUI client) {
		data = new DataAccessLayer();
		this.client = client;
	}
	public ActionListener readFile(JTextField textFieldFileName, JLabel lblFeedback, JTextArea textAreaForFileReading) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg){
				String fileName = textFieldFileName.getText();
				String contents = "";
				try {
					lblFeedback.setText("Reading...");
					contents = data.readFile(fileName);
					lblFeedback.setText("File read.");
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					lblFeedback.setText("An error occurred.");
				}
				textAreaForFileReading.setText(contents);
			}
		};
	}
}
