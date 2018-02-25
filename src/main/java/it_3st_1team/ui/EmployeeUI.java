package it_3st_1team.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

public class EmployeeUI extends JPanel {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	public EmployeeUI() {

		initComponents();
	}
	private void initComponents() {
		setBackground(Color.WHITE);
		setBounds(new Rectangle(10, 0, 1150, 800));
		setLayout(null);
		
		JPanel pNorth = new JPanel();
		pNorth.setBackground(Color.WHITE);
		pNorth.setBounds(0, 0, 1150, 450);
		add(pNorth);
		pNorth.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("사 원 번 호");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblNewLabel.setBounds(432, 23, 105, 30);
		pNorth.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("이         름");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblNewLabel_1.setBounds(432, 58, 105, 30);
		pNorth.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("아   이   디");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblNewLabel_2.setBounds(432, 93, 105, 30);
		pNorth.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("비 밀 번 호");
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblNewLabel_3.setBounds(432, 128, 105, 30);
		pNorth.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("연   락   처");
		lblNewLabel_4.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblNewLabel_4.setBounds(432, 163, 105, 30);
		pNorth.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("메         일");
		lblNewLabel_5.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblNewLabel_5.setBounds(432, 198, 105, 30);
		pNorth.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("주         소");
		lblNewLabel_6.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblNewLabel_6.setBounds(432, 270, 105, 30);
		pNorth.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("직         책");
		lblNewLabel_7.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblNewLabel_7.setBounds(432, 340, 105, 30);
		pNorth.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		textField.setBounds(562, 20, 515, 30);
		pNorth.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		textField_1.setBounds(562, 55, 515, 30);
		pNorth.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		textField_2.setBounds(562, 90, 515, 30);
		pNorth.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		textField_3.setBounds(562, 125, 515, 30);
		pNorth.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		textField_4.setBounds(562, 160, 90, 30);
		pNorth.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		textField_5.setBounds(562, 195, 515, 30);
		pNorth.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		textField_6.setBounds(562, 267, 515, 30);
		pNorth.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		textField_7.setColumns(10);
		textField_7.setBounds(701, 160, 90, 30);
		pNorth.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		textField_8.setColumns(10);
		textField_8.setBounds(843, 160, 90, 30);
		pNorth.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		textField_9.setColumns(10);
		textField_9.setBounds(562, 302, 515, 30);
		pNorth.add(textField_9);
		
		JLabel label = new JLabel("우 편 번 호");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		label.setBounds(432, 234, 105, 30);
		pNorth.add(label);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		textField_10.setColumns(10);
		textField_10.setBounds(562, 231, 370, 30);
		pNorth.add(textField_10);
		
		JButton button = new JButton("주소찾기");
		button.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		button.setBounds(944, 231, 133, 30);
		pNorth.add(button);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		comboBox.setBounds(562, 337, 515, 30);
		pNorth.add(comboBox);
		
		JLabel lblNewLabel_8 = new JLabel("-");
		lblNewLabel_8.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(649, 163, 57, 30);
		pNorth.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("-");
		lblNewLabel_9.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(788, 163, 57, 30);
		pNorth.add(lblNewLabel_9);
		
		JButton btnAdd = new JButton("추  가");
		btnAdd.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnAdd.setBounds(594, 388, 90, 40);
		pNorth.add(btnAdd);
		
		JButton btnUpdate = new JButton("수  정");
		btnUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnUpdate.setBounds(774, 388, 90, 40);
		pNorth.add(btnUpdate);
		
		JButton btnCancel = new JButton("취  소");
		btnCancel.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnCancel.setBounds(951, 388, 90, 40);
		pNorth.add(btnCancel);
		
		JPanel panel = new JPanel();
		panel.setBounds(65, 20, 300, 350);
		pNorth.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_10 = new JLabel("No Image");
		lblNewLabel_10.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_10, BorderLayout.CENTER);
		
		JButton button_1 = new JButton("사진추가");
		button_1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		button_1.setBounds(75, 388, 120, 40);
		pNorth.add(button_1);
		
		JButton button_2 = new JButton("사진삭제");
		button_2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		button_2.setBounds(230, 388, 120, 40);
		pNorth.add(button_2);
		
		JPanel pTable = new JPanel();
		pTable.setBackground(Color.WHITE);
		pTable.setBounds(0, 450, 1150, 350);
		add(pTable);
		pTable.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 0, 1130, 390);
		pTable.add(scrollPane);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		table = new JTable();
		table.setRowHeight(30);
		table.setBackground(Color.WHITE);
		table.getTableHeader().setBackground(new Color(245,245,245));
		table.getTableHeader().setFont(new Font("맑은 고딕", Font.BOLD, 18));
		table.setModel(new DefaultTableModel(getRow(),getColunmNames()));
		table.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.getColumnModel().getColumn(0).setPreferredWidth(100);	//사원번호
		table.getColumnModel().getColumn(1).setPreferredWidth(100); //사원명
		table.getColumnModel().getColumn(2).setPreferredWidth(100); //아이디
		table.getColumnModel().getColumn(3).setPreferredWidth(100);  //비밀번호
		table.getColumnModel().getColumn(4).setPreferredWidth(100);  //연락처
		table.getColumnModel().getColumn(5).setPreferredWidth(150); //메일
		table.getColumnModel().getColumn(6).setPreferredWidth(400); //주소
		table.getColumnModel().getColumn(7).setPreferredWidth(100); //직책코드
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
			{null, null, null, null, null, null, null, null, null}
		};
		return rows;
	}
	private Object[] getColunmNames() {
		return new String[] {"NO", "이름", "아이디", "비밀번호", "연락처", "메일", "주소", "직책코드"};
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
