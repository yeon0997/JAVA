package movie;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tutorial.Join;
import tutorial.Memberinfo;
import tutorial.UserForm;

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

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField ID;
	private JTextField PWD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(106, 101, 57, 15);
		contentPane.add(lblNewLabel);
		
		ID = new JTextField();
		ID.setBounds(197, 98, 116, 21);
		contentPane.add(ID);
		ID.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
	               String uid = ID.getText();
	               String upwd = PWD.getText();
	               sql = "SELECT * FROM memberlist WHERE userid=? AND userpwd = ?";
	               
	               pstmt = conn.prepareStatement(sql);
	               pstmt.setString(1, uid);
	               pstmt.setString(2, upwd);
	               
	               result = pstmt.executeQuery();
	               
	               if(result.next()) {
	            	   dispose();
	            	   if(uid.equals("admin")) {
	            	   //새로운 화면을 생성한 후
	            	   Admin admin = new Admin();
	            	   admin.setVisible(true);
	            	   //새로운 화면을 보이게 한다.
	            	   }
	            	   else {
	            		   Member member = new Member();
	            		   member.setVisible(true);
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
		btnNewButton.setBounds(52, 181, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("JOIN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
		        WJoin join = new WJoin();
		        join.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(174, 181, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("GUEST");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
		        Guest guest = new Guest();
		        guest.setVisible(true);
				
			}
		});
		btnNewButton_2.setBounds(305, 181, 97, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("WATCHA");
		lblNewLabel_1.setBounds(185, 33, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setBounds(106, 138, 79, 15);
		contentPane.add(lblNewLabel_2);
		
		PWD = new JTextField();
		PWD.setBounds(197, 135, 116, 21);
		contentPane.add(PWD);
		PWD.setColumns(10);
	}
}
