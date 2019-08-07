package tutorial;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;

public class Memberinfo extends JFrame {
	Connection conn;
	PreparedStatement pstmt;
	String sql;
	ResultSet result;
	
	private JPanel contentPane;
	private JTextField txtUserID;
	private JTextField txtUserPWD;
	private JTextField txtPhone;
	private JTextField txtAddress;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Memberinfo frame = new Memberinfo();
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
	public Memberinfo() {
		setTitle("Member Information Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1012, 616);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(255, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMemberInformaionForm = new JLabel("Member Informaion Form");
		lblMemberInformaionForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemberInformaionForm.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblMemberInformaionForm.setBounds(265, 27, 465, 40);
		contentPane.add(lblMemberInformaionForm);
		
		txtUserID = new JTextField();
		txtUserID.setBounds(125, 96, 116, 21);
		contentPane.add(txtUserID);
		txtUserID.setColumns(10);
		
		txtUserPWD = new JTextField();
		txtUserPWD.setBounds(125, 135, 116, 21);
		contentPane.add(txtUserPWD);
		txtUserPWD.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("USER ID");
		lblNewLabel.setBounds(46, 96, 116, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USER PWD");
		lblNewLabel_1.setBounds(46, 135, 116, 15);
		contentPane.add(lblNewLabel_1);

///////////////button//////////////////////////////////////////////////////////////////////////		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dbconnect();
				String uid = txtUserID.getText();
				sql= "SELECT * FROM members WHERE userid = ?";
				
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, uid);
					
					result = pstmt.executeQuery();
					
					while(result.next()) {
						String vuserid = result.getString("userid");
						String vuserpwd = result.getString("userpwd");
						String vphone = result.getString("userphone");
						String vaddress = result.getString("useraddr");
						txtUserID.setText(vuserid);
						txtUserPWD.setText(vuserpwd);
						txtPhone.setText(vphone);
						txtAddress.setText(vaddress);
					}//end of while
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		btnSearch.setBounds(35, 268, 97, 23);
		contentPane.add(btnSearch);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dbconnect();
				String uid = txtUserID.getText();
				String upwd = txtUserPWD.getText();
				String uphone = txtPhone.getText();
				String uaddr = txtAddress.getText();
				
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
						JOptionPane.showMessageDialog(null, "1개의 데이터가 삽입됐습니다.");
						
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dataload();
			}
			}//end of actionperformed
		});
		btnAdd.setBounds(144, 268, 97, 23);
		contentPane.add(btnAdd);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
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
						JOptionPane.showMessageDialog(null, "1개의 레코드를 업데이트했습니다.");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dataload();
			}//end of actionperformed
		});
		
		btnUpdate.setBounds(35, 301, 97, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dbconnect();
				String uid = txtUserID.getText();

				sql = "DELETE FROM members where userid = ?";
				
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, uid);
					int rst = pstmt.executeUpdate();
					if(rst == 1) {
						JOptionPane.showMessageDialog(null, "1개의 레코드를 삭제했습니다.");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dataload();
			}//end of actionperformed
		});
		btnDelete.setBounds(144, 301, 97, 23);
		contentPane.add(btnDelete);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnExit.setBounds(144, 334, 97, 23);
		contentPane.add(btnExit);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUserID.setText("");
				txtUserPWD.setText("");
				txtPhone.setText("");
				txtAddress.setText("");
				
			}
		});
/////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		btnReset.setBounds(35, 334, 97, 23);
		contentPane.add(btnReset);
		
		JLabel lblPhone = new JLabel("PHONE");
		lblPhone.setBounds(46, 178, 116, 15);
		contentPane.add(lblPhone);
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setBounds(46, 216, 116, 15);
		contentPane.add(lblAddress);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(125, 178, 116, 21);
		contentPane.add(txtPhone);
		txtPhone.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(125, 216, 116, 21);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(285, 96, 679, 447);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//테이블을 클릭했을 때 행을 추출하고
				//추출된 행의 각 컬럼을 왼쪽에 있는 각각의 텍스트박스에 전달한다
				dbconnect();
				int row = table.getSelectedRow();
				String uid = (table.getModel().getValueAt(row, 0)).toString();
				
				//uid를 이용하여 db검색하고 검색된 결과를 텍스트 필드에 전달
				sql= "SELECT * FROM members WHERE userid = ?";
				
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, uid);
					
					result = pstmt.executeQuery();
					
					while(result.next()) {
						String vuserid = result.getString("userid");
						String vuserpwd = result.getString("userpwd");
						String vphone = result.getString("userphone");
						String vaddress = result.getString("useraddr");
						txtUserID.setText(vuserid);
						txtUserPWD.setText(vuserpwd);
						txtPhone.setText(vphone);
						txtAddress.setText(vaddress);
					}//end of while
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnDataLoad = new JButton("DATA LOAD");
		btnDataLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dataload();
				
			}//end of action performed()
		});
		btnDataLoad.setBounds(35, 510, 206, 23);
		contentPane.add(btnDataLoad);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(156, 391, 30, 21);
		contentPane.add(comboBox);
		
		//테이블 데이터를 로드하는 메서드 호출
		dataload();
		
	}//end of memberinfo()
	
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
		
	}//end of chkDuplicate
	
	void dataload() {
		dbconnect();
		sql = "SELECT userid, userphone, useraddr FROM members";
		try {
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeQuery();
			//질의 결과를 table에 넘겨준다
			table.setModel(DbUtils.resultSetToTableModel(result));
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}//end of dataload()
}

















