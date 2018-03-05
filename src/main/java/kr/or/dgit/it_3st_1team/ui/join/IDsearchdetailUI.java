package kr.or.dgit.it_3st_1team.ui.join;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class IDsearchdetailUI extends JFrame {

	private JPanel contentPane;

	public IDsearchdetailUI() {
		initComponents();
	}
	private void initComponents() {
		setTitle("아이디 확인");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 350, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserName = new JLabel("");
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblUserName.setBounds(55, 33, 117, 40);
		contentPane.add(lblUserName);
		
		JLabel lblText1 = new JLabel("님의 아이디는");
		lblText1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblText1.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblText1.setBounds(140, 33, 113, 40);
		contentPane.add(lblText1);
		
		JLabel lblUserId = new JLabel("");
		lblUserId.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserId.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblUserId.setBounds(70, 83, 125, 40);
		contentPane.add(lblUserId);
		
		JLabel lblText2 = new JLabel("입니다.");
		lblText2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblText2.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblText2.setBounds(181, 81, 71, 40);
		contentPane.add(lblText2);
	}

}
