package kr.or.dgit.it_3st_1team.ui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

@SuppressWarnings("serial")
public class NoticeUI extends JPanel {
	private JTextField textField;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton button_1;
	private JButton button_2;

	/**
	 * Create the panel.
	 */
	public NoticeUI() {

		initComponents();
	}
	private void initComponents() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JLabel label = new JLabel("공지사항");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 35));
		label.setBounds(120, 78, 140, 64);
		add(label);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setMaximumRowCount(5);
		comboBox.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		comboBox.setBorder(null);
		comboBox.setBounds(517, 155, 120, 50);
		add(comboBox);
		
		textField = new JTextField();
		textField.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		textField.setBounds(654, 154, 321, 50);
		add(textField);
		
		JButton button = new JButton("검색");
		button.setForeground(Color.BLACK);
		button.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		button.setBorder(null);
		button.setBackground(new Color(52, 152, 219));
		button.setBounds(1001, 158, 82, 40);
		add(button);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 257, 1110, 370);
		add(scrollPane);
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		
		table = new JTable();
		table.setRowHeight(30);
		table.getTableHeader().setBackground(new Color(245,245,245));
		table.getTableHeader().setFont(new Font("맑은 고딕", Font.BOLD, 18));
		table.setModel(new DefaultTableModel(getRow(),getColunmNames()));
		table.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.getColumnModel().getColumn(0).setPreferredWidth(40);	//번호
		table.getColumnModel().getColumn(1).setPreferredWidth(400); //도서명
		table.getColumnModel().getColumn(2).setPreferredWidth(160); //저자
		table.getColumnModel().getColumn(3).setPreferredWidth(150);  //출판사
		table.getColumnModel().getColumn(4).setPreferredWidth(100);  //출판년도
		scrollPane.setViewportView(table);
		
		
		button_1 = new JButton("목록");
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		button_1.setBorder(null);
		button_1.setBackground(new Color(52, 152, 219));
		button_1.setBounds(1032, 659, 90, 40);
		add(button_1);
		
		button_2 = new JButton("삭제");
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		button_2.setBorder(null);
		button_2.setBackground(new Color(52, 152, 219));
		button_2.setBounds(930, 659, 90, 40);
		add(button_2);
	}
	private Object[][] getRow() {
		Object[][] rows = new Object[][] {
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null}
		};
		return rows;
	}
	private Object[] getColunmNames() {
		return new String[] {"번호", "제목", "글쓴이", "등록일", "조회"};
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
