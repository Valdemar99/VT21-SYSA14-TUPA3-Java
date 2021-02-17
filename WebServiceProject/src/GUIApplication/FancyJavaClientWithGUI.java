package GUIApplication;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FancyJavaClientWithGUI extends JFrame {

	

	private JPanel contentPane;
	private JTextField textFieldFileName;
	private JTextArea textAreaForFileReading;
	private JButton btnReadFile;
	private JLabel lblFeedback;
	private Controller controller;


	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}

	public JTextField getTextFieldFileName() {
		return textFieldFileName;
	}

	public void setTextFieldFileName(JTextField textFieldFileName) {
		this.textFieldFileName = textFieldFileName;
	}

	public JTextArea getTextAreaForFileReading() {
		return textAreaForFileReading;
	}

	public void setTextAreaForFileReading(JTextArea textAreaForFileReading) {
		this.textAreaForFileReading = textAreaForFileReading;
	}

	public JButton getBtnReadFile() {
		return btnReadFile;
	}

	public void setBtnReadFile(JButton btnReadFile) {
		this.btnReadFile = btnReadFile;
	}

	public JLabel getLblFeedback() {
		return lblFeedback;
	}

	public void setLblFeedback(JLabel lblFeedback) {
		this.lblFeedback = lblFeedback;
	}

	/**
	 * Create the frame.
	 */
	public FancyJavaClientWithGUI() {
		Controller controller = new Controller(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 672);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldFileName = new JTextField();
		textFieldFileName.setBounds(110, 35, 133, 20);
		contentPane.add(textFieldFileName);
		textFieldFileName.setColumns(10);
		
		JLabel lblFileName = new JLabel("File name:");
		lblFileName.setBounds(10, 38, 67, 14);
		contentPane.add(lblFileName);
		
		lblFeedback = new JLabel("");
		lblFeedback.setBounds(10, 77, 382, 14);
		contentPane.add(lblFeedback);
		
		textAreaForFileReading = new JTextArea();
		textAreaForFileReading.setBounds(10, 104, 587, 518);
		contentPane.add(textAreaForFileReading);
		textAreaForFileReading.setEditable(false);
		
		btnReadFile = new JButton("Read file");
		btnReadFile.addActionListener(controller.readFile(textFieldFileName, lblFileName, textAreaForFileReading));
		
		btnReadFile.setBounds(303, 34, 89, 23);
		contentPane.add(btnReadFile);
	}
}
