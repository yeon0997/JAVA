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
	private JTextField search;

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
		setBounds(100, 100, 712, 539);
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
		
		JButton add = new JButton("ADD");
		add.addActionListener(new ActionListener() {
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
						JOptionPane.showMessageDialog(null, wtitle + "이(가) 추가됐습니다.");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dataload();

			}
		});
		add.setBounds(27, 327, 97, 23);
		contentPane.add(add);
		
		JButton update = new JButton("UPDATE");
		update.addActionListener(new ActionListener() {
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
						JOptionPane.showMessageDialog(null, wtitle + "이(가) 수정됐습니다.");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dataload();
			}
		});
		update.setBounds(136, 327, 97, 23);
		contentPane.add(update);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dbconnect();
				dataload();
				String mtitle = title.getText();

				sql = "DELETE FROM movie where title = ?";
				
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, mtitle);
					int rst = pstmt.executeUpdate();
					if(rst == 1) {
						JOptionPane.showMessageDialog(null, "1개의 레코드를 삭제했습니다.");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dataload();
			}
		});
		delete.setBounds(27, 360, 97, 23);
		contentPane.add(delete);
		
		JButton btnsearch = new JButton("SEARCH");
		btnsearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dbconnect();
				dataload();
				String wtitle = title.getText();
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
		btnsearch.setBounds(570, 36, 97, 23);
		contentPane.add(btnsearch);
		
		search = new JTextField();
		search.setBounds(308, 37, 238, 21);
		contentPane.add(search);
		search.setColumns(10);
		
		JLabel lblWatcha = new JLabel("WATCHA");
		lblWatcha.setFont(new Font("Ubuntu Medium", Font.BOLD, 28));
		lblWatcha.setHorizontalAlignment(SwingConstants.CENTER);
		lblWatcha.setBounds(27, 36, 202, 31);
		contentPane.add(lblWatcha);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(299, 467, 97, 23);
		contentPane.add(btnExit);
		
		JButton clear = new JButton("CLEAR");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				title.setText("");
				genre.setText("");
				age.setText("");
				runtime.setText("");
				
			}
		});
		clear.setBounds(136, 360, 97, 23);
		contentPane.add(clear);
		
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
				JOptionPane.showMessageDialog(null, "새로운 ID");
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
		
		try {
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(result));
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}//end of dataload()
}
