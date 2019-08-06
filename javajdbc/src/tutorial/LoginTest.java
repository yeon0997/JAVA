package tutorial;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;

public class LoginTest extends JFrame {

   private JPanel contentPane;
   private JTextField txtUserID;
   private JTextField txtUserPWD;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               LoginTest frame = new LoginTest();
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
   public LoginTest() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 536, 277);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JLabel lblUserId = new JLabel("User ID");
      lblUserId.setBounds(257, 101, 57, 15);
      contentPane.add(lblUserId);
      
      JLabel lblUserPwd = new JLabel("User PWD");
      lblUserPwd.setBounds(257, 139, 57, 15);
      contentPane.add(lblUserPwd);
      
      txtUserID = new JTextField();
      txtUserID.setBounds(326, 98, 116, 21);
      contentPane.add(txtUserID);
      txtUserID.setColumns(10);
      
      txtUserPWD = new JTextField();
      txtUserPWD.setColumns(10);
      txtUserPWD.setBounds(326, 136, 116, 21);
      contentPane.add(txtUserPWD);
      
      JButton btnLogin = new JButton("Login");
      btnLogin.addActionListener(new ActionListener() {
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
            	//연결설정
               Class.forName("oracle.jdbc.driver.OracleDriver");
               conn = DriverManager.getConnection(url, user, pwd);
               sql = "SELECT * FROM members WHERE userid=? AND userpwd = ?";
               pstmt = conn.prepareStatement(sql);
               pstmt.setString(1, txtUserID.getText());
               pstmt.setString(2, txtUserPWD.getText());
               
               result = pstmt.executeQuery();
               
               if(result.next()) {
                  JOptionPane.showMessageDialog(null, "로그인 성공");
               }else {
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
      btnLogin.setBounds(238, 177, 97, 23);
      contentPane.add(btnLogin);
      
      JButton btnCancel = new JButton("Cancel");
      btnCancel.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            System.exit(0);
         }
      });
      btnCancel.setBounds(351, 177, 97, 23);
      contentPane.add(btnCancel);
      
      JLabel lblLoginTest = new JLabel("Login Test");
      lblLoginTest.setHorizontalAlignment(SwingConstants.CENTER);
      lblLoginTest.setFont(new Font("Tahoma", Font.BOLD, 13));
      lblLoginTest.setBounds(305, 25, 82, 43);
      contentPane.add(lblLoginTest);
      
      JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(27, 25, 136, 189);
		contentPane.add(label);
      
   }

}