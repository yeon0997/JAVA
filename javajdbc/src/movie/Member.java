package movie;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;

public class Member extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Member frame = new Member();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Member() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 553);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("TITLE");
		label.setBounds(22, 75, 57, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("WATCHA");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Ubuntu Medium", Font.BOLD, 28));
		label_1.setBounds(22, 21, 202, 31);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(108, 75, 116, 21);
		contentPane.add(textField);
		
		JLabel label_2 = new JLabel("GENRE");
		label_2.setBounds(22, 119, 57, 15);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(108, 119, 116, 21);
		contentPane.add(textField_1);
		
		JLabel label_3 = new JLabel("AGE");
		label_3.setBounds(22, 164, 57, 15);
		contentPane.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(108, 164, 116, 21);
		contentPane.add(textField_2);
		
		JLabel label_4 = new JLabel("RUNTIME");
		label_4.setBounds(22, 202, 57, 15);
		contentPane.add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(108, 202, 116, 21);
		contentPane.add(textField_3);
		
		JLabel label_5 = new JLabel("STARS");
		label_5.setBounds(22, 247, 57, 15);
		contentPane.add(label_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(108, 247, 116, 21);
		contentPane.add(comboBox);
		
		JLabel label_6 = new JLabel("REVIEW");
		label_6.setBounds(22, 291, 57, 15);
		contentPane.add(label_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(104, 290, 278, 179);
		contentPane.add(textArea);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(408, 78, 412, 379);
		contentPane.add(scrollPane);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(408, 46, 202, 21);
		contentPane.add(textField_4);
		
		JButton button = new JButton("SEARCH");
		button.setBounds(634, 45, 97, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("ADD");
		button_1.setBounds(408, 467, 97, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("UPDATE");
		button_2.setBounds(567, 467, 97, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("DELETE");
		button_3.setBounds(723, 467, 97, 23);
		contentPane.add(button_3);
	}

}
