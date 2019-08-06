package tutorial;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class UserForm extends JFrame {
	
	Connection conn;
	PreparedStatement pstmt;
	String sql;
	ResultSet result;

	private JPanel contentPane;
	private JTextField txtPhone;
	private JTextField txtAddress;
	private JTextField txtUserPWD;
	private JTextField txtUserID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserForm frame = new UserForm();
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
	public UserForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("PHONE");
		label.setBounds(31, 95, 57, 15);
		contentPane.add(label);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(122, 92, 116, 21);
		contentPane.add(txtPhone);
		
		JLabel label_1 = new JLabel("ADDRESS");
		label_1.setBounds(31, 133, 57, 15);
		contentPane.add(label_1);
		
		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(122, 130, 116, 21);
		contentPane.add(txtAddress);
		
		JButton button = new JButton("UPDATE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dbconnect();
				String uid = txtUserID.getText();
				String upwd = txtUserPWD.getText();
				String uphone = txtPhone.getText();
				String uaddr = txtAddress.getText();
				sql = "UPDATE members SET userpwd = ?, userphone = ?, useraddr = ? WHERE userid = ?";
				
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, upwd);
					pstmt.setString(2, uphone);
					pstmt.setString(3, uaddr);
					pstmt.setString(4, uid);
					int rst = pstmt.executeUpdate();
					if(rst == 1) {
						JOptionPane.showMessageDialog(null, "정보가 수정됐습니다.");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button.setBounds(291, 258, 97, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("RESET");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	txtUserID.setText("");
				txtUserPWD.setText("");
				txtPhone.setText("");
				txtAddress.setText("");
			}
		});
		button_1.setBounds(426, 179, 97, 23);
		contentPane.add(button_1);
		
		txtUserPWD = new JTextField();
		txtUserPWD.setColumns(10);
		txtUserPWD.setBounds(122, 52, 116, 21);
		contentPane.add(txtUserPWD);
		
		JLabel label_2 = new JLabel("USER PWD");
		label_2.setBounds(31, 55, 79, 15);
		contentPane.add(label_2);
		
		txtUserID = new JTextField();
		txtUserID.setBounds(122, 10, 116, 21);
		contentPane.add(txtUserID);
		txtUserID.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("USER ID");
		lblNewLabel.setBounds(31, 13, 57, 15);
		contentPane.add(lblNewLabel);
	}
	void dbconnect() {
		 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "madang", "madang");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버가 로드되지 않았습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("데이터베이스 연결에 문제가 있습니다.");
			e.printStackTrace();
		}
        
	}//end of dbconnect()
}
