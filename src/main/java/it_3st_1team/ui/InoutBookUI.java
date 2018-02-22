package it_3st_1team.ui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Rectangle;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Insets;

@SuppressWarnings("serial")
public class InoutBookUI extends JPanel {
	private JTextField txtDksk;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;

	public InoutBookUI() {
		
		initComponents();
	}
	private void initComponents() {
		setBackground(Color.WHITE);
		setBounds(new Rectangle(0, 0, 1150, 800));
		setLayout(null);
		
		JPanel pUser = new JPanel();
		pUser.setBackground(Color.WHITE);
		pUser.setBounds(0, 10, 1110, 400);
		add(pUser);
		pUser.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		pUser.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel label = new JLabel("회원코드");
		label.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label);
		
		txtDksk = new JTextField();
		txtDksk.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		txtDksk.setColumns(10);
		panel.add(txtDksk);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		pUser.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel label_1 = new JLabel("아이디");
		label_1.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		textField_1.setColumns(10);
		panel_1.add(textField_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		pUser.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel label_2 = new JLabel("이름");
		label_2.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		textField_2.setColumns(10);
		panel_2.add(textField_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		pUser.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel label_3 = new JLabel("연락처");
		label_3.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		textField_3.setColumns(10);
		panel_3.add(textField_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		pUser.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel label_4 = new JLabel("이메일");
		label_4.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		textField_4.setColumns(10);
		panel_4.add(textField_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		pUser.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		pUser.add(panel_6);
		panel_6.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel label_5 = new JLabel("주소");
		label_5.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		textField_5.setColumns(10);
		panel_6.add(textField_5);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		pUser.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		pUser.add(panel_8);
		panel_8.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel label_6 = new JLabel("도서코드");
		label_6.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(label_6);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		textField_6.setColumns(10);
		panel_8.add(textField_6);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		pUser.add(panel_9);
		panel_9.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		pUser.add(panel_10);
		panel_10.setLayout(null);
		
		JButton btnOut = new JButton("대여");
		btnOut.setBorder(null);
		btnOut.setBackground(new Color(158,158,158));
		btnOut.setBounds(new Rectangle(429, 16, 90, 40));
		panel_10.add(btnOut);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		pUser.add(panel_11);
		panel_11.setLayout(null);
		
		JButton btnIn = new JButton("반납");
		btnIn.setBounds(33, 16, 90, 40);
		panel_11.add(btnIn);
		btnIn.setBorder(null);
		btnIn.setBackground(new Color(158,158,158));
		
		JPanel pTable = new JPanel();
		pTable.setBackground(Color.WHITE);
		pTable.setBounds(0, 410, 1150, 300);
		add(pTable);
		pTable.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 5, 1110, 300);
		pTable.add(scrollPane);
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
		table.getColumnModel().getColumn(2).setPreferredWidth(400);  //도서명
		table.getColumnModel().getColumn(3).setPreferredWidth(100);  //저자
		table.getColumnModel().getColumn(4).setPreferredWidth(130); //출판사
		table.getColumnModel().getColumn(5).setPreferredWidth(80); //출판년도
		table.getColumnModel().getColumn(6).setPreferredWidth(100); //대여일
		table.getColumnModel().getColumn(7).setPreferredWidth(100); //반납일
		scrollPane.setViewportView(table);
		pTable.add(scrollPane);
	}

	private Object[][] getRow() {
		Object[][] rows = new Object[][] {
			{null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null}
		};
		return rows;
	}
	private Object[] getColunmNames() {
		return new String[] {"NO", "도서코드", "도서명", "저자", "출판사", "출판년도","대여일","반납일"};
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
