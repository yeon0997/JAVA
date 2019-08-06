package tutorial;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserID;
	private JTextField txtUserPWD;
	static LoginForm frame = new LoginForm();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
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
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 295);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToJavadb = new JLabel("Welcome to JAVADB CLASS");
		lblWelcomeToJavadb.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToJavadb.setFont(new Font("Jura SemiBold", Font.BOLD, 15));
		lblWelcomeToJavadb.setBounds(0, 33, 468, 15);
		contentPane.add(lblWelcomeToJavadb);
		
		txtUserID = new JTextField();
		txtUserID.setFont(new Font("Jura SemiBold", Font.PLAIN, 12));
		txtUserID.setBounds(300, 76, 116, 21);
		contentPane.add(txtUserID);
		txtUserID.setColumns(10);
		
		txtUserPWD = new JTextField();
		txtUserPWD.setFont(new Font("Jura SemiBold", Font.PLAIN, 12));
		txtUserPWD.setBounds(300, 122, 116, 21);
		contentPane.add(txtUserPWD);
		txtUserPWD.setColumns(10);
		
		JLabel lblUserName = new JLabel("USER NAME");
		lblUserName.setFont(new Font("Jura Medium", Font.PLAIN, 13));
		lblUserName.setBounds(166, 79, 116, 15);
		contentPane.add(lblUserName);
		
		JButton btnJoin = new JButton("JOIN");
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

		         dispose();
		         Join join = new Join();
		         join.setVisible(true);
			}
		});
		btnJoin.setFont(new Font("Jura SemiBold", Font.PLAIN, 12));
		btnJoin.setBounds(185, 183, 97, 23);
		contentPane.add(btnJoin);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 // DB Connection
	            Connection conn = null;
	            PreparedStatement pstmt = null;
	            ResultSet result = null;
	            String sql = null;
	            String url = "jdbc:oracle:thin:@localhost:1521:xe";
	            String user = "madang";
	            String pwd = "madang";
	            
	            try {
	               Class.forName("oracle.jdbc.driver.OracleDriver");
	               conn = DriverManager.getConnection(url, user, pwd);
	               String uid = txtUserID.getText();
	               String upwd = txtUserPWD.getText();
	               sql = "SELECT * FROM members WHERE userid=? AND userpwd = ?";
	               
	               pstmt = conn.prepareStatement(sql);
	               pstmt.setString(1, uid);
	               pstmt.setString(2, upwd);
	               
	               result = pstmt.executeQuery();
	               
	               if(result.next()) {
	            	   dispose();
	            	   if(uid.equals("admin")) {
	            	   //새로운 화면을 생성한 후
	            	   Memberinfo membinfo = new Memberinfo();
	            	   membinfo.setVisible(true);
	            	   //새로운 화면을 보이게 한다.
	            	   }
	            	   else {
	            		   UserForm userform = new UserForm();
	            		   userform.setVisible(true);
	            	   }
	               }
	            	else {
	                  JOptionPane.showMessageDialog(null, "로그인 실패");
	               }
	              
	            } catch (ClassNotFoundException e1) {
	               // TODO Auto-generated catch block
	               e1.printStackTrace();
	            }  catch (SQLException e1) {
	               // TODO Auto-generated catch block
	               e1.printStackTrace();
	            }
			}
		});
		btnLogin.setFont(new Font("Jura SemiBold", Font.PLAIN, 12));
		btnLogin.setBounds(319, 183, 97, 23);
		contentPane.add(btnLogin);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Jura Medium", Font.PLAIN, 13));
		lblPassword.setBounds(166, 125, 116, 15);
		contentPane.add(lblPassword);
		
		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(10, 58, 136, 160);
		contentPane.add(label);
	}
}
