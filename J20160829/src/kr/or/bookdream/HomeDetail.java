package kr.or.bookdream;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class HomeDetail extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Create the panel.
	 */
	public HomeDetail() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\304-4\\Pictures\\images.jpg"));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(24, 26, 148, 225);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(217, 26, 253, 21);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(217, 68, 253, 21);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(217, 110, 209, 21);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(217, 152, 127, 21);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(217, 194, 127, 32);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(217, 236, 127, 32);
		add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(217, 277, 127, 32);
		add(textField_6);

	}
}
