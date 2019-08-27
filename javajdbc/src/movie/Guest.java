package movie;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Guest extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guest frame = new Guest();
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
	public Guest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(23, 53, 528, 363);
		contentPane.add(table);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(23, 22, 202, 21);
		contentPane.add(textField);
		
		JButton button = new JButton("SEARCH");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( jTextField.getText().trim().length() > 0 )
				{

					switch( jComboBox.getSelectedIndex() )
					{
						//아이디
						case SEARCH_ID:
							searchMember(SEARCH_ID, jTextField.getText().trim());
						break;

							
						//이름
						case SEARCH_NAME:
							searchMember(SEARCH_NAME, jTextField.getText().trim());
						break;
						
						
						//주소
						case SEARCH_ADDR:
							searchMember(SEARCH_ADDR, jTextField.getText().trim());
						break;
						
						//전체
						case SEARCH_ALL:
							searchMember(SEARCH_ALL, jTextField.getText().trim());
						break;
					}
					
					jButton.setText("취소");
				}
				else
				{
					JOptionPane.showMessageDialog(jFrame, "검색어를 입력해주세요!");
				}
			}
			
			else
			{
				//검색 초기화
				searchMember(SEARCH_NONE, null);
			}

		}			
	});
		button.setBounds(239, 20, 97, 23);
		contentPane.add(button);
	}

}
