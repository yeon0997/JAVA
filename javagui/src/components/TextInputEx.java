package components;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JList;

public class TextInputEx extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JPasswordField txtPwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {	//메인함수
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextInputEx frame = new TextInputEx();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	//익명클래스
	}

	/**
	 * Create the frame.
	 */
	public TextInputEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 700);	//왼쪽, 위쪽 기준으로 100만큼 떨어뜨리고 1200*700해상도(크기)를 가진다
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(49, 69, 57, 15);
		contentPane.add(lblName);
		
		JLabel lblComtents = new JLabel("Comtents");
		lblComtents.setBounds(49, 114, 57, 15);
		contentPane.add(lblComtents);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(49, 306, 57, 15);
		contentPane.add(lblPassword);
		
		textName = new JTextField();
		textName.setText("input your name");
		textName.setBounds(143, 66, 116, 21);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(143, 110, 216, 184);
		contentPane.add(textArea);
		
		txtPwd = new JPasswordField();
		txtPwd.setBounds(143, 303, 116, 21);
		contentPane.add(txtPwd);
		
		JButton btnStore = new JButton("STORE");
		btnStore.setBounds(143, 367, 97, 23);
		contentPane.add(btnStore);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textName.setText("");
				textArea.setText("");
				txtPwd.setText("");
				
			}
		});
		btnReset.setBounds(262, 367, 97, 23);
		contentPane.add(btnReset);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(605, 144, 135, 23);
		contentPane.add(tglbtnNewToggleButton);
		
		JCheckBox chkCpp = new JCheckBox("C++");
		chkCpp.setBounds(373, 144, 115, 23);
		contentPane.add(chkCpp);
		
		JCheckBox chkJava = new JCheckBox("JAVA");
		chkJava.setBounds(509, 144, 115, 23);
		contentPane.add(chkJava);
		
		ButtonGroup grp = new ButtonGroup();
		
		JRadioButton rdomale = new JRadioButton("male");
		rdomale.setBounds(367, 185, 121, 23);
		contentPane.add(rdomale);
		
		JRadioButton rdofemale = new JRadioButton("female");
		rdofemale.setBounds(367, 210, 121, 23);
		contentPane.add(rdofemale);
		
		grp.add(rdomale);
		grp.add(rdofemale);
		
		String[] pet = {"Make selection", "Cat", "Dog", "Rabbit", "Pig"};
		
		JList list = new JList(pet);
		list.setBounds(610,	320, 170, 100);
		contentPane.add(list);
		
		JComboBox combo = new JComboBox(pet);
		list.setBounds(815,	320, 170, 30);
		contentPane.add(combo);
	}
}
















