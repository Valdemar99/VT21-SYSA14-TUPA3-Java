package GUIApplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Controller { //Extra feature - if the user forgets the .txt file extension, the program will handle it.
	//Instance variables
	private DataAccessLayer data;
	private FancyJavaClientWithGUI client;
	
	public Controller(FancyJavaClientWithGUI client) {
		data = new DataAccessLayer();
		this.client = client;
		this.initialize();
	}
	
	public void initialize() {
		client.getBtnReadFile().addActionListener(onReadFileAction());
	}
	
	
	public ActionListener onReadFileAction() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg){
				String fileName = client.getTextFieldFileName().getText();
				String contents = "";
				try {
					client.getLblFeedback().setText("Reading...");
					contents = data.readFile(fileName);
					client.getLblFeedback().setText("File read.");
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					client.getLblFeedback().setText("File not found. Please try again with a different file name.");
				}
				client.getTextAreaForFileReading().setText(contents);
			}
		};
	}
}
