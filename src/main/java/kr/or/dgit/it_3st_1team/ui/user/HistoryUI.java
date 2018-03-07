package kr.or.dgit.it_3st_1team.ui.user;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import kr.or.dgit.it_3st_1team.dto.Book;
import javax.swing.JLabel;

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
		pTableHistory.setBounds(20, 10, 1140, 542);
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
		List<Book> list = new ArrayList<>();
		table.setModel(new DefaultTableModel(getRow(list),getColunmNames()));
		table.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		cellAlign(SwingConstants.CENTER, 0, 3, 4, 5, 6);
		cellAlign(SwingConstants.LEFT, 1, 2);
		PreferredWidth(50,430,430,140,140,100,100);
		/*table.getColumnModel().getColumn(0).setPreferredWidth(40);	//번호
		table.getColumnModel().getColumn(1).setPreferredWidth(400); //도서명
		table.getColumnModel().getColumn(2).setPreferredWidth(110); //저자
		table.getColumnModel().getColumn(3).setPreferredWidth(130);  //대출일
		table.getColumnModel().getColumn(4).setPreferredWidth(130);  //반납예정일
		table.getColumnModel().getColumn(5).setPreferredWidth(100); //연체일수
		table.getColumnModel().getColumn(6).setPreferredWidth(100); //상태
*/		scrollPane.setViewportView(table);
				
		JPanel pPage = new JPanel();
		pPage.setBackground(Color.WHITE);
		pPage.setBounds(5, 611, 1150, 80);
		add(pPage);
		pPage.setLayout(null);
		
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton rdbtnAll = new JRadioButton("모두보기");
		rdbtnAll.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		rdbtnAll.setBackground(Color.WHITE);
		rdbtnAll.setBounds(0, 0, 100, 30);
		pTableHistory.add(rdbtnAll);
		group.add(rdbtnAll);
		
		JRadioButton rdbtnout = new JRadioButton("대출");
		rdbtnout.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		rdbtnout.setBackground(Color.WHITE);
		rdbtnout.setBounds(100, 0, 60, 30);
		pTableHistory.add(rdbtnout);
		group.add(rdbtnout);
		
		JRadioButton rdbtnin = new JRadioButton("반납");
		rdbtnin.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		rdbtnin.setBackground(Color.WHITE);
		rdbtnin.setBounds(160, 0, 60, 30);
		pTableHistory.add(rdbtnin);
		group.add(rdbtnin);
		
		JLabel label = new JLabel("/");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		label.setBounds(225, 0, 30, 30);
		pTableHistory.add(label);
		
		JRadioButton rdbreserve = new JRadioButton("예약");
		rdbreserve.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		rdbreserve.setBackground(Color.WHITE);
		rdbreserve.setBounds(240, 0, 60, 30);
		group.add(rdbreserve);
		pTableHistory.add(rdbreserve);
		
		JRadioButton rdbrequest = new JRadioButton("신청");
		rdbrequest.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		rdbrequest.setBackground(Color.WHITE);
		rdbrequest.setBounds(300, 0, 58, 30);
		group.add(rdbrequest);
		pTableHistory.add(rdbrequest);
		
	}
	
	private Object[][] getRow(List<Book> list) {
		Object[][] rows = null;
		rows = new Object[list.size()][];
		for (int i = 0; i < rows.length; i++) {
			rows[i] = list.get(i).toArray(i);
		}
		return rows;
	}
	private Object[] getColunmNames() {
		return new String[] {"번호", "도서명", "저자", "대출일","반납예정일", "연체일수","상태"};
	}
	private void cellAlign(int align, int...idx) {
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(align);
		
		TableColumnModel model = table.getColumnModel();
		for(int i=0; i<idx.length; i++) {
			model.getColumn(idx[i]).setCellRenderer(dtcr);
		}
	}
	public void PreferredWidth(int... width) {
		TableColumnModel model1 = table.getColumnModel();
		for (int i = 0; i < width.length; i++) {
			model1.getColumn(i).setPreferredWidth(width[i]);
		}
	}
}
