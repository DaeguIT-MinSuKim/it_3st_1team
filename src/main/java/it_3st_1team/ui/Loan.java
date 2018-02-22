package it_3st_1team.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.Rectangle;

@SuppressWarnings("serial")
public class Loan extends JPanel {

	
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	
	public Loan() {
		initComponents();
	}
	private void initComponents() {
			JPanel panel = new JPanel();
			panel.setBounds(new Rectangle(0, 0, 1150, 800));
			

			JTable table = new JTable();
			table.setForeground(Color.BLACK);
			table.setRowHeight(30);
			table.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
			table.setModel(new DefaultTableModel(
				new Object[][] { { "1", "코끼리의 마음", "톤 텔레헨", "2018-02-12","2018-02-19","0","대출중",null }, 
					{  "2", "해피엔딩으로 만나요", "샤를로테 루카스", "2018-02-12","2018-02-19","0","대출중",null  },
					{  "3", "이 삶을 사랑하지 않을 이유가 없다", "니나 리그스", "2018-02-10","2018-02-17","0","대출중",null },
					{  "4", "하루 10분 내 인생의 재발견", "리이언 홀리데이", "2018-02-07","2018-02-14","0","반납",null },
					{  "5", "언어의 온도", "이기주", "2018-02-05","2018-02-12","0","반납",null },
					{  "6", "인생극장", "노명우", "2018-02-01","2018-02-08","0","반납",null },
					{  null, null, null, null, null, null, null,null },
					{  null, null, null, null, null, null, null,null },
					{  null, null, null, null, null, null, null,null },
					{  null, null, null, null, null, null, null,null },
					{  null, null, null, null, null, null, null,null },
					{  null, null, null, null, null, null, null,null },
					{  null, null, null, null, null, null, null,null },
					{  null, null, null, null, null, null, null,null },
					{  null, null, null, null, null, null, null,null }
				},
				new String[] {
						"번호", "도서명", "저자", "대출일","반납예정일", "연체일수","상태","연기"
				}
			));
			
		
			
			
			
			table.getColumnModel().getColumn(0).setPreferredWidth(15);
			table.getColumnModel().getColumn(0).setMinWidth(10);
			table.getColumnModel().getColumn(1).setPreferredWidth(150);
			table.getColumnModel().getColumn(1).setMinWidth(150);
		
			
			panel.setLayout(null);
			table.setBackground(Color.WHITE); //테이블 배경색지정
			

			// Table Container Parameters
			JScrollPane pane = new JScrollPane(table); //테이블에 스크롤바 나오도록 Jscrollpane생성
			pane.setFont(new Font("맑은 고딕", Font.BOLD, 16));
			pane.setBackground(Color.WHITE);
			
			
			
			pane.setBounds(0, 0, 1150, 478);
			pane.setPreferredSize(new Dimension(1150, 500));
			panel.add(pane, "Center");
			
			btnNewButton = new JButton("반납연기");
			btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
			btnNewButton.setBounds(1048, 498, 90, 30);
			panel.add(btnNewButton);
			
			btnNewButton_1 = new JButton("<");
			btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 14));
			btnNewButton_1.setBounds(327, 514, 46, 36);
			panel.add(btnNewButton_1);
			
			button = new JButton("1");
			button.setFont(new Font("굴림", Font.PLAIN, 14));
			button.setBounds(397, 514, 46, 36);
			panel.add(button);
			
			button_1 = new JButton("2");
			button_1.setFont(new Font("굴림", Font.PLAIN, 14));
			button_1.setBounds(466, 514, 46, 36);
			panel.add(button_1);
			
			button_2 = new JButton("3");
			button_2.setFont(new Font("굴림", Font.PLAIN, 14));
			button_2.setBounds(534, 514, 46, 36);
			panel.add(button_2);
			
			button_3 = new JButton("4");
			button_3.setFont(new Font("굴림", Font.PLAIN, 14));
			button_3.setBounds(604, 514, 46, 36);
			panel.add(button_3);
			
			button_4 = new JButton(">");
			button_4.setFont(new Font("굴림", Font.PLAIN, 14));
			button_4.setBounds(672, 514, 46, 36);
			panel.add(button_4);

		}
	
}
