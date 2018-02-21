package it_3st_1team.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.Rectangle;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class SearchBookUI extends JPanel {
	private JTextField tfbookname;
	private SearchBtn btnSearch = new SearchBtn();
	private JTable table;

	public SearchBookUI() {

		initComponents();
	}
	private void initComponents() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		String [] categoryBig = {"대분류 전체"};
		JComboBox<String> cbbbig = new JComboBox<String>();
		cbbbig.setBorder(null);
		cbbbig.setMaximumRowCount(10);
		cbbbig.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		cbbbig.setBounds(30, 50, 150, 50);
		add(cbbbig);
		
		String [] categoryMid = {"중분류 전체"};
		JComboBox<String> cbbmid = new JComboBox<>();
		cbbmid.setBorder(null);
		cbbmid.setMaximumRowCount(5);
		cbbmid.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		cbbmid.setBounds(200, 50, 150, 50);
		add(cbbmid);
		
		tfbookname = new JTextField();
		tfbookname.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfbookname.setText("책 제목을 입력해주세요.");
		tfbookname.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfbookname.setBounds(370, 50, 500, 50);
		add(tfbookname);
		tfbookname.setColumns(10);
		
		btnSearch.setBounds(880, 50, 45, 45);
		btnSearch.setBackground(null);
		btnSearch.setBorder(null);
		add(btnSearch);
		
		JButton btnSearchDe = new JButton("상세검색");
		btnSearchDe.setBorder(null);
		btnSearchDe.setBackground(new Color(52,152,219));
		btnSearchDe.setForeground(new Color(255, 255, 255));
		btnSearchDe.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btnSearchDe.setBounds(950, 55, 90, 40);
		add(btnSearchDe);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		scrollPane.setBounds(10, 120, 1110, 542);
		add(scrollPane);
		
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
		table.getColumnModel().getColumn(5).setPreferredWidth(130); //비치수/보유수
		table.getColumnModel().getColumn(6).setPreferredWidth(130); //대여가능여부
		scrollPane.setViewportView(table);
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
		return new String[] {"NO", "도서명", "저자", "출판사", "출판년도", "비치수/보유수", "대여가능여부"};
	}
	private void cellAlign(int align, int...idx) {
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(align);
		
		TableColumnModel model = table.getColumnModel();
		for(int i=0; i<idx.length; i++) {
			model.getColumn(idx[i]).setCellRenderer(dtcr);
		}
	}
	class SearchBtn extends JButton{
		private ImageIcon icon = new ImageIcon("images/search.png");
		private Image img = icon.getImage();
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}
}
