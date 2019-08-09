package movie;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Admin extends JFrame {
	
	Connection conn;
	PreparedStatement pstmt, pstmtmem;
	String sql, sqlmem;
	ResultSet result, resultmem;

	private JPanel contentPane;
	private JTextField title;
	private JTextField genre;
	private JTextField age;
	private JTextField runtime;
	private JTable table;
	private JTable table_1;
	private JTextField search;
	private JTextField id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1105, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TITLE");
		lblNewLabel.setBounds(27, 99, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("GENRE");
		lblNewLabel_1.setBounds(27, 143, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("AGE");
		lblNewLabel_2.setBounds(27, 188, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("RUNTIME");
		lblNewLabel_3.setBounds(27, 226, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		title = new JTextField();
		title.setBounds(113, 99, 116, 21);
		contentPane.add(title);
		title.setColumns(10);
		
		genre = new JTextField();
		genre.setBounds(113, 143, 116, 21);
		contentPane.add(genre);
		genre.setColumns(10);
		
		age = new JTextField();
		age.setBounds(113, 188, 116, 21);
		contentPane.add(age);
		age.setColumns(10);
		
		runtime = new JTextField();
		runtime.setBounds(113, 226, 116, 21);
		contentPane.add(runtime);
		runtime.setColumns(10);
		
		JScrollPane moviet = new JScrollPane();
		moviet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dbconnect();
				int row = table.getSelectedRow();
				String wtitle = (table.getModel().getValueAt(row, 0)).toString();
				
				//uid瑜� �씠�슜�븯�뿬 db寃��깋�븯怨� 寃��깋�맂 寃곌낵瑜� �뀓�뒪�듃 �븘�뱶�뿉 �쟾�떖
				sql= "SELECT * FROM movie WHERE title = ?";
				
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, wtitle);
					
					result = pstmt.executeQuery();
					
					while(result.next()) {
					
						String mtitle = result.getString("title");
						String mgenre = result.getString("genre");
						String mage = result.getString("age");
						String mruntime = result.getString("runtime");
						title.setText(mtitle);
						genre.setText(mgenre);
						age.setText(mage);
						runtime.setText(mruntime);
					}//end of while
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		moviet.setBounds(255, 69, 412, 379);
		contentPane.add(moviet);
		
		table = new JTable();
		moviet.setViewportView(table);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dbconnect();
				String wtitle = title.getText();
				String wgenre = genre.getText();
				String wage = age.getText();
				String wruntime = runtime.getText();
		//		String wstar = stars.getText();

			//	String wreview = review.
				
				sql = "insert into movie(title, genre, age, runtime) values(?, ?, ?, ?)";
				
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, wtitle);
					pstmt.setString(2, wgenre);
					pstmt.setString(3, wage);
					pstmt.setString(4, wruntime);
				//	pstmt.setString(5, wstar);
				//	pstmt.setString(5, wreview);
					int rst = pstmt.executeUpdate();
					
					if(rst == 1) {
						JOptionPane.showMessageDialog(null, wtitle + "�씠 異붽��릱�뒿�땲�떎.");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dataload();

			}
		});
		btnNewButton.setBounds(23, 392, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dbconnect();
				String wtitle = title.getText();
				String wgenre = genre.getText();
				String wage = age.getText();
				String wruntime = runtime.getText();
				sql = "UPDATE movie SET genre = ?, age = ?, runtime = ? where title = ?";
				
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, wgenre);
					pstmt.setString(2, wage);
					pstmt.setString(3, wruntime);
					pstmt.setString(4, wtitle);
					int rst = pstmt.executeUpdate();
					if(rst == 1) {
						JOptionPane.showMessageDialog(null, wtitle + "�쓣(瑜�) �닔�젙�뻽�뒿�땲�떎.");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dataload();
			}
		});
		btnNewButton_1.setBounds(132, 392, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
				dbconnect();
				int row = table_1.getSelectedRow();
				String wid = (table_1.getModel().getValueAt(row, 0)).toString();
				
				//uid瑜� �씠�슜�븯�뿬 db寃��깋�븯怨� 寃��깋�맂 寃곌낵瑜� �뀓�뒪�듃 �븘�뱶�뿉 �쟾�떖
				sqlmem= "SELECT * FROM memberlist WHERE userid = ?";
				
				try {
					pstmtmem = conn.prepareStatement(sqlmem);
					pstmtmem.setString(1, wid);
					
					resultmem = pstmtmem.executeQuery();
					
					while(resultmem.next()) {
						String mid = resultmem.getString("userid");

						id.setText(mid);

					}//end of while
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		scrollPane_1.setBounds(697, 69, 351, 379);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dbconnect();
				
				int n = table.getSelectedRow();
				
				DefaultTableModel tm = (DefaultTableModel)table.getModel();
				if(n >= 0 && n < table.getRowCount()) {
					tm.removeRow(n);
				}
				
				
//				String wtitle = title.getText();
//
//				sql = "DELETE FROM movie where title = ?";
//				
//				try {
//					pstmt = conn.prepareStatement(sql);
//					pstmt.setString(1, wtitle);
//					int rst = pstmt.executeUpdate();
//					if(rst == 1) {
//						JOptionPane.showMessageDialog(null, wtitle + "�쓣(瑜�) �궘�젣�뻽�뒿�땲�떎.");
//					}
//					
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//				dataload();
			}
		});
		btnNewButton_2.setBounds(23, 425, 97, 23);
		contentPane.add(btnNewButton_2);
		
		JButton memdele = new JButton("DELETE");
		memdele.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dbconnect();
				dataload();
				String wid = id.getText();

				sql = "DELETE FROM memberlist where userid = ?";
				
				try {
					pstmtmem = conn.prepareStatement(sql);
					pstmtmem.setString(1, wid);
					int rst = pstmtmem.executeUpdate();
					if(rst == 1) {
						JOptionPane.showMessageDialog(null, wid + "�쓣(瑜�) �궘�젣�뻽�뒿�땲�떎.");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		memdele.setBounds(951, 36, 97, 23);
		contentPane.add(memdele);
		
		JButton btnNewButton_4 = new JButton("SEARCH");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dbconnect();
				String wtitle = title.getText();
				sql= "SELECT * FROM movie WHERE title like '%?%'";
				
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, wtitle);
					
					result = pstmt.executeQuery();
					
					while(result.next()) {
						String mtitle = result.getString("title");
						String mgenre = result.getString("genre");
						String mage = result.getString("age");
						String mruntime = result.getString("runtime");
						title.setText(mtitle);
						genre.setText(mgenre);
						age.setText(mage);
						runtime.setText(mruntime);
					}//end of while
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_4.setBounds(570, 36, 97, 23);
		contentPane.add(btnNewButton_4);
		
		search = new JTextField();
		search.setBounds(255, 37, 291, 21);
		contentPane.add(search);
		search.setColumns(10);
		
		JLabel lblWatcha = new JLabel("WATCHA");
		lblWatcha.setFont(new Font("Ubuntu Medium", Font.BOLD, 28));
		lblWatcha.setHorizontalAlignment(SwingConstants.CENTER);
		lblWatcha.setBounds(27, 36, 202, 31);
		contentPane.add(lblWatcha);
		
		JLabel label = new JLabel("ID");
		label.setBounds(697, 41, 57, 15);
		contentPane.add(label);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(733, 38, 116, 21);
		contentPane.add(id);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(951, 467, 97, 23);
		contentPane.add(btnExit);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				title.setText("");
				genre.setText("");
				age.setText("");
				runtime.setText("");
				
			}
		});
		btnClear.setBounds(132, 425, 97, 23);
		contentPane.add(btnClear);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(852, 36, 97, 23);
		contentPane.add(btnNewButton_3);
		
		dataload();
		
	}//end of main
	
	void dbconnect() {
		 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "madang", "madang");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("�뱶�씪�씠踰꾧� 濡쒕뱶�릺吏� �븡�븯�뒿�땲�떎.");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("�뜲�씠�꽣踰좎씠�뒪 �뿰寃곗뿉 臾몄젣媛� �엳�뒿�땲�떎.");
			e.printStackTrace();
		}
      
	}//end of dbconnect()
	
	boolean chkDuplicate(String newid) {
		boolean exist = false;
		dbconnect();
	
		sql = "SELECT * FROM memberlist WHERE userid = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newid);
			result = pstmt.executeQuery();
			if(result.next()) {
				exist = true;
				JOptionPane.showMessageDialog(null, "以묐났�맂 ID");
			} else {
				exist = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return exist;
		
	}
	
	void dataload() {
		dbconnect();
		sql = "SELECT title, genre, age, runtime FROM movie";
		sqlmem = "SELECT userid, userpwd FROM memberlist";
		
		try {
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(result));
			
			pstmtmem = conn.prepareStatement(sqlmem);
			resultmem = pstmtmem.executeQuery();
			table_1.setModel(DbUtils.resultSetToTableModel(resultmem));
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}//end of dataload()
}
