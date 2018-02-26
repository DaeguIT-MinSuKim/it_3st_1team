package it_3st_1team.ui.librarian;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import it_3st_1team.ui.join.SearchAddrdetailUI;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeUI extends JPanel implements ActionListener {
	private JTable table;
	private JTextField tfEmpNo;
	private JTextField tfEmpName;
	private JTextField tfEmpID;
	private JTextField tfEmpPW;
	private JTextField tfEmpTel1;
	private JTextField tfEmpEmail;
	private JTextField tfEmpAddr1;
	private JTextField tfEmpTel2;
	private JTextField tfEmpTel3;
	private JTextField tdEmpAddr2;
	private JTextField tfEmpZipCode;
	private JButton btnSearchAddr;

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
		
		JLabel lblEmpNo = new JLabel("사 원 번 호");
		lblEmpNo.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblEmpNo.setBounds(432, 23, 105, 30);
		pNorth.add(lblEmpNo);
		
		JLabel lblEmpName = new JLabel("이         름");
		lblEmpName.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblEmpName.setBounds(432, 58, 105, 30);
		pNorth.add(lblEmpName);
		
		JLabel lblEmpID = new JLabel("아   이   디");
		lblEmpID.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblEmpID.setBounds(432, 93, 105, 30);
		pNorth.add(lblEmpID);
		
		JLabel lblEmpPW = new JLabel("비 밀 번 호");
		lblEmpPW.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblEmpPW.setBounds(432, 128, 105, 30);
		pNorth.add(lblEmpPW);
		
		JLabel lblEmpTel = new JLabel("연   락   처");
		lblEmpTel.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblEmpTel.setBounds(432, 163, 105, 30);
		pNorth.add(lblEmpTel);
		
		JLabel lblEmpEmail = new JLabel("메         일");
		lblEmpEmail.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblEmpEmail.setBounds(432, 198, 105, 30);
		pNorth.add(lblEmpEmail);
		
		JLabel lblEmpAddr = new JLabel("주         소");
		lblEmpAddr.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblEmpAddr.setBounds(432, 270, 105, 30);
		pNorth.add(lblEmpAddr);
		
		JLabel lblEmpTitle = new JLabel("직         책");
		lblEmpTitle.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblEmpTitle.setBounds(432, 340, 105, 30);
		pNorth.add(lblEmpTitle);
		
		JLabel label = new JLabel("우 편 번 호");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		label.setBounds(432, 234, 105, 30);
		pNorth.add(label);
		
		tfEmpNo = new JTextField();
		tfEmpNo.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tfEmpNo.setBounds(562, 20, 515, 30);
		pNorth.add(tfEmpNo);
		tfEmpNo.setColumns(10);
		
		tfEmpName = new JTextField();
		tfEmpName.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tfEmpName.setBounds(562, 55, 515, 30);
		pNorth.add(tfEmpName);
		tfEmpName.setColumns(10);
		
		tfEmpID = new JTextField();
		tfEmpID.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tfEmpID.setBounds(562, 90, 515, 30);
		pNorth.add(tfEmpID);
		tfEmpID.setColumns(10);
		
		tfEmpPW = new JTextField();
		tfEmpPW.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tfEmpPW.setBounds(562, 125, 515, 30);
		pNorth.add(tfEmpPW);
		tfEmpPW.setColumns(10);
		
		tfEmpTel1 = new JTextField();
		tfEmpTel1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tfEmpTel1.setBounds(562, 160, 90, 30);
		pNorth.add(tfEmpTel1);
		tfEmpTel1.setColumns(10);
		
		tfEmpTel2 = new JTextField();
		tfEmpTel2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tfEmpTel2.setColumns(10);
		tfEmpTel2.setBounds(701, 160, 90, 30);
		pNorth.add(tfEmpTel2);
		
		tfEmpTel3 = new JTextField();
		tfEmpTel3.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tfEmpTel3.setColumns(10);
		tfEmpTel3.setBounds(843, 160, 90, 30);
		pNorth.add(tfEmpTel3);
		
		tfEmpEmail = new JTextField();
		tfEmpEmail.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tfEmpEmail.setBounds(562, 195, 515, 30);
		pNorth.add(tfEmpEmail);
		tfEmpEmail.setColumns(10);
		
		tfEmpZipCode = new JTextField();
		tfEmpZipCode.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tfEmpZipCode.setColumns(10);
		tfEmpZipCode.setBounds(562, 231, 370, 30);
		pNorth.add(tfEmpZipCode);
		
		tfEmpAddr1 = new JTextField();
		tfEmpAddr1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tfEmpAddr1.setBounds(562, 267, 515, 30);
		pNorth.add(tfEmpAddr1);
		tfEmpAddr1.setColumns(10);
		
		tdEmpAddr2 = new JTextField();
		tdEmpAddr2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tdEmpAddr2.setColumns(10);
		tdEmpAddr2.setBounds(562, 302, 515, 30);
		pNorth.add(tdEmpAddr2);
		
		btnSearchAddr = new JButton("주소찾기");
		btnSearchAddr.addActionListener(this);
		btnSearchAddr.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnSearchAddr.setForeground(new Color(64,64,64));
		btnSearchAddr.setBackground(new Color(190, 190, 190));
		btnSearchAddr.setBounds(944, 231, 133, 30);
		
		pNorth.add(btnSearchAddr);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		comboBox.setBounds(562, 337, 515, 30);
		pNorth.add(comboBox);
		
		JLabel lblBar1 = new JLabel("-");
		lblBar1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblBar1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBar1.setBounds(649, 160, 57, 30);
		pNorth.add(lblBar1);
		
		JLabel lblBar2 = new JLabel("-");
		lblBar2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblBar2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBar2.setBounds(789, 160, 57, 30);
		pNorth.add(lblBar2);
		
		JButton btnAdd = new JButton("추  가");
		btnAdd.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnAdd.setBounds(594, 388, 90, 40);
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setBackground(new Color(94,94,94));
		pNorth.add(btnAdd);
		
		JButton btnUpdate = new JButton("수  정");
		btnUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnUpdate.setBounds(774, 388, 90, 40);
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setBackground(new Color(94,94,94));
		pNorth.add(btnUpdate);
		
		JButton btnCancel = new JButton("취  소");
		btnCancel.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnCancel.setBounds(951, 388, 90, 40);
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setBackground(new Color(94,94,94));
		pNorth.add(btnCancel);
		
		JPanel pPicture = new JPanel();
		pPicture.setBounds(65, 20, 300, 350);
		pNorth.add(pPicture);
		pPicture.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_10 = new JLabel("No Image");
		lblNewLabel_10.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		pPicture.add(lblNewLabel_10, BorderLayout.CENTER);
		
		JButton btnPicAdd = new JButton("사진추가");
		btnPicAdd.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnPicAdd.setBounds(75, 388, 120, 40);
		btnPicAdd.setForeground(Color.WHITE);
		btnPicAdd.setBackground(new Color(94,94,94));
		pNorth.add(btnPicAdd);
		
		JButton btnPicDel = new JButton("사진삭제");
		btnPicDel.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnPicDel.setBounds(230, 388, 120, 40);
		btnPicDel.setForeground(Color.WHITE);
		btnPicDel.setBackground(new Color(94,94,94));
		pNorth.add(btnPicDel);
		
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
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSearchAddr) {
			actionPerformedButton(e);
		}
	}
	protected void actionPerformedButton(ActionEvent e) {
		SearchAddrdetailUI addr = new SearchAddrdetailUI();
		addr.setVisible(true);
	}
}
