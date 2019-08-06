package tutorial;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Join extends JFrame {
	
	Connection conn;
	PreparedStatement pstmt;
	String sql;
	ResultSet result;

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtPWD;
	private JTextField txtPhone;
	private JTextField txtAddr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Join frame = new Join();
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
	public Join() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("JOIN");
		lblNewLabel.setFont(new Font("Ubuntu", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(75, 10, 262, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(64, 65, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setBounds(64, 103, 85, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PHONE");
		lblNewLabel_3.setBounds(64, 143, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ADDRESS");
		lblNewLabel_4.setBounds(64, 187, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		txtID = new JTextField();
		txtID.setBounds(161, 62, 116, 21);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txtPWD = new JTextField();
		txtPWD.setBounds(161, 100, 116, 21);
		contentPane.add(txtPWD);
		txtPWD.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(161, 140, 116, 21);
		contentPane.add(txtPhone);
		txtPhone.setColumns(10);
		
		txtAddr = new JTextField();
		txtAddr.setBounds(161, 184, 116, 21);
		contentPane.add(txtAddr);
		txtAddr.setColumns(10);
		
		JButton btnJoin = new JButton("JOIN!");
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dbconnect();
				String uid = txtID.getText();
				String upwd = txtPWD.getText();
				String uphone = txtPhone.getText();
				String uaddr = txtAddr.getText();
				
				if(!chkDuplicate(uid)) {
				sql = "insert into members(userid, userpwd, userphone, useraddr) values(?, ?, ?, ?)";
				
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, uid);
					pstmt.setString(2, upwd);
					pstmt.setString(3, uphone);
					pstmt.setString(4, uaddr);
					int rst = pstmt.executeUpdate();
					
					if(rst == 1) {
						dispose();
						JOptionPane.showMessageDialog(null, "가입성공.");
					}
				}
				catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}	
			}
		});
		btnJoin.setBounds(325, 122, 97, 23);
		contentPane.add(btnJoin);
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
	
	boolean chkDuplicate(String newid) {
		boolean exist = false;
		dbconnect();
	
		sql = "SELECT * FROM members WHERE userid = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newid);
			result = pstmt.executeQuery();
			if(result.next()) {
				exist = true;
				JOptionPane.showMessageDialog(null, "중복된 ID");
			} else {
				exist = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return exist;
		
	}
	
	
}
