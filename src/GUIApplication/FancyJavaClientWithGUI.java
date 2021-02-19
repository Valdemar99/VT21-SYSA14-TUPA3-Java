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
import javax.swing.JScrollPane;

public class FancyJavaClientWithGUI extends JFrame {

	

	private JPanel contentPane;
	private JTextField textFieldFileName;
	private JButton btnReadFile;
	private JLabel lblFeedback;
	private JScrollPane scrollPane;
	private JTextArea textAreaForFileReading;


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
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 176, 589, 446);
		contentPane.add(scrollPane);
		
		textAreaForFileReading = new JTextArea();
		textAreaForFileReading.setEditable(false);
		scrollPane.setViewportView(textAreaForFileReading);
		
		btnReadFile = new JButton("Read file");
		
		btnReadFile.setBounds(303, 34, 89, 23);
		contentPane.add(btnReadFile);

	}
}
