package kr.or.dgit.it_3st_1team.ui.user;

import java.awt.Color;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

@SuppressWarnings("serial")
public class HistoryUI extends JPanel {
	private JTable table;
	private JScrollPane scrollPane;

	public HistoryUI() {
		initComponents();
	}
	
	private void initComponents() {
		setBackground(Color.white);
		setLayout(null);
		
		JPanel pTableHistory = new JPanel();
		pTableHistory.setBackground(Color.WHITE);
		pTableHistory.setBounds(0, 0, 1140, 542);
		add(pTableHistory);
		pTableHistory.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(0, 35, 1110, 542);
		scrollPane.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		pTableHistory.add(scrollPane);
		
		table = new JTable();
		table.setRowHeight(30);
		table.setBackground(Color.WHITE);
		table.getTableHeader().setBackground(new Color(245,245,245));
		table.getTableHeader().setFont(new Font("맑은 고딕", Font.BOLD, 18));
		table.setModel(new DefaultTableModel(getRow(),getColunmNames()));
		table.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.getColumnModel().getColumn(0).setPreferredWidth(40);	//번호
		table.getColumnModel().getColumn(1).setPreferredWidth(400); //도서명
		table.getColumnModel().getColumn(2).setPreferredWidth(110); //저자
		table.getColumnModel().getColumn(3).setPreferredWidth(130);  //대출일
		table.getColumnModel().getColumn(4).setPreferredWidth(130);  //반납예정일
		table.getColumnModel().getColumn(5).setPreferredWidth(100); //연체일수
		table.getColumnModel().getColumn(6).setPreferredWidth(100); //상태
		table.getColumnModel().getColumn(7).setPreferredWidth(80); //연기
		scrollPane.setViewportView(table);
		
		JButton btnDelay = new JButton("반납연기");
		btnDelay.setBorder(null);
		btnDelay.setBounds(1010, 0, 100, 30);
		pTableHistory.add(btnDelay);
		btnDelay.setBackground(new Color(51,152,219));
		btnDelay.setForeground(Color.WHITE);
		btnDelay.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		
		JPanel pPage = new JPanel();
		pPage.setBackground(Color.WHITE);
		pPage.setBounds(5, 611, 1150, 80);
		add(pPage);
		pPage.setLayout(null);
		
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton rdbtnAll = new JRadioButton("모두보기");
		rdbtnAll.setBackground(Color.WHITE);
		rdbtnAll.setBounds(0, 0, 80, 30);
		pTableHistory.add(rdbtnAll);
		group.add(rdbtnAll);
		
		JRadioButton rdbtnout = new JRadioButton("대출");
		rdbtnout.setBackground(Color.WHITE);
		rdbtnout.setBounds(80, 0, 60, 30);
		pTableHistory.add(rdbtnout);
		group.add(rdbtnout);
		
		JRadioButton rdbtnin = new JRadioButton("반납");
		rdbtnin.setBackground(Color.WHITE);
		rdbtnin.setBounds(140, 0, 80, 30);
		pTableHistory.add(rdbtnin);
		group.add(rdbtnin);
		
		/*JButton btnPrev = new JButton("<");
		btnPrev.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnPrev.setBounds(350, 10, 50, 50);
		pPage.add(btnPrev);
		
		JButton btnFirst = new JButton("1");
		btnFirst.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnFirst.setBounds(440, 10, 50, 50);
		pPage.add(btnFirst);
		
		JButton btnSecond = new JButton("2");
		btnSecond.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnSecond.setBounds(530, 10, 50, 50);
		pPage.add(btnSecond);
		
		JButton btnThird = new JButton("3");
		btnThird.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnThird.setBounds(620, 10, 50, 50);
		pPage.add(btnThird);
		
		JButton btnNext = new JButton(">");
		btnNext.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		btnNext.setBounds(710, 10, 50, 50);
		pPage.add(btnNext);*/
	}
	
	private Object[][] getRow() {
		Object[][] rows = new Object[][] { { "1", "코끼리의 마음", "톤 텔레헨", "2018-02-12","2018-02-19","0","대출중",null }, 
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
			{  null, null, null, null, null, null, null,null },
			{  null, null, null, null, null, null, null,null }
		};
		return rows;
	}
	private Object[] getColunmNames() {
		return new String[] {"번호", "도서명", "저자", "대출일","반납예정일", "연체일수","상태","연기"};
	}
	private void cellAlign(int align, int...idx) {
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(align);
		
		TableColumnModel model = table.getColumnModel();
		for(int i=0; i<idx.length; i++) {
			model.getColumn(idx[i]).setCellRenderer(dtcr);
		}
	}
}
