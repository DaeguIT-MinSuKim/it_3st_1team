package it_3st_1team.ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class SearchAddrdetailUI extends JFrame {

	private JPanel contentPane;
	private JTextField tfAddrName;
	private JTable table;
	private JScrollPane scrollPane;


	public SearchAddrdetailUI() {
		initComponents();
	}
	private void initComponents() {
		setTitle("주소 찾기");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(415, 260, 800, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfAddrName = new JTextField();
		tfAddrName.setBounds(36, 23, 537, 42);
		tfAddrName.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfAddrName.setColumns(10);
		tfAddrName.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		contentPane.add(tfAddrName);
		
		JButton btnSearch = new JButton("검색");
		btnSearch.setForeground(Color.BLACK);
		btnSearch.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btnSearch.setBorder(null);
		btnSearch.setBackground(new Color(52, 152, 219));
		btnSearch.setBounds(615, 24, 129, 40);
		contentPane.add(btnSearch);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 86, 708, 215);
		getContentPane().add(scrollPane);
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		
		table = new JTable();
		table.setRowHeight(30);
		table.getTableHeader().setBackground(new Color(245,245,245));
		table.getTableHeader().setFont(new Font("맑은 고딕", Font.BOLD, 18));
		table.setModel(new DefaultTableModel(getRow(),getColunmNames()));
		table.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.getColumnModel().getColumn(0).setPreferredWidth(10);	//번호
		table.getColumnModel().getColumn(1).setPreferredWidth(500); //주소
		table.getColumnModel().getColumn(2).setPreferredWidth(30); //우편번호		
		scrollPane.setViewportView(table);
		
	}
	private Object[][] getRow() {
		Object[][] rows = new Object[][] {
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null},
			{null, null, null}
		};
		return rows;
	}
	private Object[] getColunmNames() {
		return new String[] {"No", "주소", "우편번호"};
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
