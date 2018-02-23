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
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;

@SuppressWarnings("serial")
public class InoutBookUI extends JPanel {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	public InoutBookUI() {
		
		initComponents();
	}
	private void initComponents() {
		setBackground(Color.WHITE);
		setBounds(new Rectangle(0, 0, 1150, 800));
		setLayout(null);
		
		JPanel pUser = new JPanel();
		pUser.setBackground(Color.WHITE);
		pUser.setBounds(0, 0, 1150, 400);
		add(pUser);
		pUser.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(new Rectangle(0, 0, 800, 400));
		pUser.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회  원  코  드");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel.setBounds(40, 43, 106, 15);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("이           름");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		label.setBounds(40, 89, 106, 15);
		panel.add(label);
		
		JLabel label_1 = new JLabel("아    이    디");
		label_1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		label_1.setBounds(40, 133, 106, 15);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("연    락    처");
		label_2.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		label_2.setBounds(40, 179, 106, 15);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("이    메    일");
		label_3.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		label_3.setBounds(40, 225, 106, 15);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("주           소");
		label_4.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		label_4.setBounds(40, 289, 106, 15);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("도  서  코  드");
		label_5.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		label_5.setBounds(40, 356, 106, 15);
		panel.add(label_5);
		
		textField = new JTextField();
		textField.setBounds(170, 40, 580, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(170, 86, 580, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(170, 130, 580, 21);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(170, 176, 580, 21);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(170, 222, 580, 21);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(170, 267, 580, 60);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(170, 353, 580, 21);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(800, 0, 350, 400);
		panel_1.setBorder(new EmptyBorder(20, 20, 20, 20));
		pUser.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnOut = new JButton("대 여");
		btnOut.setFont(new Font("맑은 고딕", Font.PLAIN, 99));
		btnOut.setForeground(Color.WHITE);
		btnOut.setBounds(16, 39, 300, 160);
		btnOut.setBackground(new Color(94,94,94));
		btnOut.setBorder(null);
		btnOut.setMaximumSize(new Dimension(150, 150));
		btnOut.setMinimumSize(new Dimension(150, 150));
		panel_1.add(btnOut);
		
		JButton btnIn = new JButton("반 납");
		btnIn.setBorder(null);
		btnIn.setFont(new Font("맑은 고딕", Font.PLAIN, 99));
		btnIn.setForeground(Color.WHITE);
		btnIn.setBounds(16, 220, 300, 160);
		btnIn.setBackground(new Color(94,94,94));
		panel_1.add(btnIn);
		
		JPanel pTable = new JPanel();
		pTable.setBackground(Color.WHITE);
		pTable.setBounds(0, 400, 1150, 400);
		add(pTable);
		pTable.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1150, 400);
		scrollPane.setBackground(Color.WHITE);
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
