package it_3st_1team.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ManagementBookUI extends JPanel {
	private JTextField tfSearch;
	private JTable table;

	public ManagementBookUI() {

		initComponents();
	}
	private void initComponents() {
		setBounds(new Rectangle(0, 0, 1150, 800));
		setBackground(new Color(255,255,255));
		setLayout(null);
		
		JPanel pNorth = new JPanel();
		pNorth.setBounds(0, 0, 1150, 150);
		pNorth.setBackground(new Color(255,255,255));
		add(pNorth);
		pNorth.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel pSearch = new JPanel();
		pSearch.setBackground(new Color(255,255,255));
		pNorth.add(pSearch);
		pSearch.setLayout(null);
		
		JComboBox cbkBig = new JComboBox();
		cbkBig.setBounds(new Rectangle(30, 10, 150, 50));
		pSearch.add(cbkBig);
		
		JComboBox cbkMiddle = new JComboBox();
		cbkMiddle.setBounds(200, 10, 150, 50);
		pSearch.add(cbkMiddle);
		
		tfSearch = new JTextField();
		tfSearch.setBounds(370, 10, 500, 50);
		pSearch.add(tfSearch);
		tfSearch.setColumns(10);
		
		JButton btnSearch = new JButton("검    색");
		btnSearch.setBounds(950, 15, 90, 40);
		pSearch.add(btnSearch);
		
		JPanel pState = new JPanel();
		pState.setBackground(new Color(255,255,255));
		pNorth.add(pState);
		pState.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("전 체 현 황");
		rdbtnNewRadioButton.setBounds(125, 20, 120, 30);
		pState.add(rdbtnNewRadioButton);
		
		JRadioButton radioButton = new JRadioButton("대 여 현 황");
		radioButton.setBounds(289, 20, 120, 30);
		pState.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("반 납 현 황");
		radioButton_1.setBounds(464, 20, 120, 30);
		pState.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("무 슨 현 황");
		radioButton_2.setBounds(627, 20, 120, 30);
		pState.add(radioButton_2);
		
		JButton btnNewButton = new JButton("추  가");
		btnNewButton.setBounds(826, 15, 90, 40);
		pState.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("삭  제");
		btnNewButton_1.setBounds(948, 15, 90, 40);
		pState.add(btnNewButton_1);
		
		JPanel pCenter = new JPanel();
		pCenter.setBackground(new Color(255,255,255));
		pCenter.setBounds(0, 150, 1150, 650);
		add(pCenter);
		pCenter.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 0, 1145, 650);
		pCenter.add(scrollPane);
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		table = new JTable();
		table.setRowHeight(30);
		table.setBackground(new Color(255,255,255));
		table.getTableHeader().setBackground(new Color(245,245,245));
		table.getTableHeader().setFont(new Font("맑은 고딕", Font.BOLD, 18));
		table.setModel(new DefaultTableModel(getRow(),getColunmNames()));
		table.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.getColumnModel().getColumn(0).setPreferredWidth(40);	//번호
		table.getColumnModel().getColumn(1).setPreferredWidth(100); //도서코드
		table.getColumnModel().getColumn(2).setPreferredWidth(100); //회원ID
		table.getColumnModel().getColumn(3).setPreferredWidth(400);  //도서명
		table.getColumnModel().getColumn(4).setPreferredWidth(100);  //저자
		table.getColumnModel().getColumn(5).setPreferredWidth(130); //출판사
		table.getColumnModel().getColumn(6).setPreferredWidth(80); //출판년도
		table.getColumnModel().getColumn(7).setPreferredWidth(100); //대여일
		table.getColumnModel().getColumn(8).setPreferredWidth(100); //반납일
		scrollPane.setViewportView(table);
		
	}
	
	private Object[][] getRow() {
		Object[][] rows = new Object[][] {
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null}
		};
		return rows;
	}
	private Object[] getColunmNames() {
		return new String[] {"NO", "도서코드", "회원ID", "도서명", "저자", "출판사", "출판년도","대여일","반납일"};
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
