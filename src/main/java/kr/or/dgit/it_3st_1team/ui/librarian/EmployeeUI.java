package kr.or.dgit.it_3st_1team.ui.librarian;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import kr.or.dgit.db_setting.service.BackupService;
import kr.or.dgit.db_setting.service.InitService;
import kr.or.dgit.db_setting.service.LoadService;
import kr.or.dgit.it_3st_1team.dto.Employee;
import kr.or.dgit.it_3st_1team.dto.Phone;
import kr.or.dgit.it_3st_1team.dto.Title;
import kr.or.dgit.it_3st_1team.service.EmployeeService;
import kr.or.dgit.it_3st_1team.service.TitleService;
import kr.or.dgit.it_3st_1team.ui.join.SearchAddrdetailUI;

@SuppressWarnings("serial")
public class EmployeeUI extends JPanel implements ActionListener, MouseListener {
	private JTable table;
	private JTextField tfEmpNo;
	private JTextField tfEmpName;
	private JTextField tfEmpID;
	private JTextField tfEmpTel1;
	private JTextField tfEmpEmail;
	private JTextField tfAddr_id;
	private JTextField tfEmpTel2;
	private JTextField tfEmpTel3;
	private JTextField tfAddr_de;
	private JTextField tfZipCode;
	private JButton btnSearchAddr;
	private JComboBox<Title> cbkTitle;
	private List<Employee> list;
	private JButton btnAdd;
	private JPanel pTable;
	private JScrollPane scrollPane;
	private JButton btnUpdate;
	private JButton btnCancel;

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
		lblEmpNo.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		lblEmpNo.setBounds(246, 24, 105, 30);
		pNorth.add(lblEmpNo);
		
		JLabel lblEmpName = new JLabel("이         름");
		lblEmpName.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		lblEmpName.setBounds(246, 61, 105, 30);
		pNorth.add(lblEmpName);
		
		JLabel lblEmpID = new JLabel("아   이   디");
		lblEmpID.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		lblEmpID.setBounds(246, 100, 105, 30);
		pNorth.add(lblEmpID);
		
		JLabel lblEmpTel = new JLabel("연   락   처");
		lblEmpTel.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		lblEmpTel.setBounds(246, 141, 105, 30);
		pNorth.add(lblEmpTel);
		
		JLabel lblEmpEmail = new JLabel("메         일");
		lblEmpEmail.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		lblEmpEmail.setBounds(246, 181, 105, 30);
		pNorth.add(lblEmpEmail);
		
		JLabel lblEmpAddr = new JLabel("주         소");
		lblEmpAddr.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		lblEmpAddr.setBounds(246, 259, 105, 30);
		pNorth.add(lblEmpAddr);
		
		JLabel lblEmpTitle = new JLabel("직         책");
		lblEmpTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		lblEmpTitle.setBounds(246, 341, 105, 30);
		pNorth.add(lblEmpTitle);
		
		JLabel label = new JLabel("우 편 번 호");
		label.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		label.setBounds(246, 219, 105, 30);
		pNorth.add(label);
		
		tfEmpNo = new JTextField();
		tfEmpNo.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tfEmpNo.setBounds(376, 21, 515, 30);
		pNorth.add(tfEmpNo);
		tfEmpNo.setColumns(10);
		
		tfEmpName = new JTextField();
		tfEmpName.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tfEmpName.setBounds(376, 58, 515, 30);
		pNorth.add(tfEmpName);
		tfEmpName.setColumns(10);
		
		tfEmpID = new JTextField();
		tfEmpID.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tfEmpID.setBounds(376, 97, 515, 30);
		pNorth.add(tfEmpID);
		tfEmpID.setColumns(10);
		
		tfEmpTel1 = new JTextField();
		tfEmpTel1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tfEmpTel1.setBounds(376, 138, 90, 30);
		pNorth.add(tfEmpTel1);
		tfEmpTel1.setColumns(10);
		
		tfEmpTel2 = new JTextField();
		tfEmpTel2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tfEmpTel2.setColumns(10);
		tfEmpTel2.setBounds(515, 138, 90, 30);
		pNorth.add(tfEmpTel2);
		
		tfEmpTel3 = new JTextField();
		tfEmpTel3.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tfEmpTel3.setColumns(10);
		tfEmpTel3.setBounds(657, 138, 90, 30);
		pNorth.add(tfEmpTel3);
		
		tfEmpEmail = new JTextField();
		tfEmpEmail.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tfEmpEmail.setBounds(376, 178, 515, 30);
		pNorth.add(tfEmpEmail);
		tfEmpEmail.setColumns(10);
		
		tfZipCode = new JTextField();
		tfZipCode.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tfZipCode.setColumns(10);
		tfZipCode.setBounds(376, 216, 370, 30);
		pNorth.add(tfZipCode);
		
		tfAddr_id = new JTextField();
		tfAddr_id.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tfAddr_id.setBounds(376, 256, 515, 30);
		pNorth.add(tfAddr_id);
		tfAddr_id.setColumns(10);
		
		tfAddr_de = new JTextField();
		tfAddr_de.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		tfAddr_de.setColumns(10);
		tfAddr_de.setBounds(376, 298, 515, 30);
		pNorth.add(tfAddr_de);
		
		btnSearchAddr = new JButton("주소찾기");
		btnSearchAddr.addActionListener(this);
		btnSearchAddr.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnSearchAddr.setForeground(new Color(64,64,64));
		btnSearchAddr.setBackground(new Color(190, 190, 190));
		btnSearchAddr.setBounds(758, 216, 133, 30);
		
		pNorth.add(btnSearchAddr);
		
		cbkTitle = new JComboBox<>();
		TitleService service = new TitleService();
		try {
			List<Title> list = service.selectAllTitle();
			list.add(0, new Title("직책"));
			DefaultComboBoxModel<Title> model = new DefaultComboBoxModel<>(list.toArray(new Title[list.size()]));
			cbkTitle.setModel(model);
			
		}catch(Exception e) {
			e.getStackTrace();
		}
		cbkTitle.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		cbkTitle.setBounds(376, 338, 515, 30);
		pNorth.add(cbkTitle);
		
		JLabel lblBar1 = new JLabel("-");
		lblBar1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblBar1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBar1.setBounds(463, 138, 57, 30);
		pNorth.add(lblBar1);
		
		JLabel lblBar2 = new JLabel("-");
		lblBar2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblBar2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBar2.setBounds(603, 138, 57, 30);
		pNorth.add(lblBar2);
		
		btnAdd = new JButton("추  가");
		btnAdd.addActionListener(this);
		btnAdd.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnAdd.setBounds(408, 389, 90, 40);
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setBackground(new Color(94,94,94));
		pNorth.add(btnAdd);
		
		btnUpdate = new JButton("수  정");
		btnUpdate.addActionListener(this);
		btnUpdate.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnUpdate.setBounds(588, 389, 90, 40);
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setBackground(new Color(94,94,94));
		pNorth.add(btnUpdate);
		
		btnCancel = new JButton("취  소");
		btnCancel.addActionListener(this);
		btnCancel.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnCancel.setBounds(765, 389, 90, 40);
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setBackground(new Color(94,94,94));
		pNorth.add(btnCancel);
		
		pTable = new JPanel();
		pTable.setBackground(Color.WHITE);
		pTable.setBounds(0, 450, 1150, 350);
		add(pTable);
		pTable.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1130, 390);
		pTable.add(scrollPane);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		loadDataTable();
		
	}
	private void loadDataTable() {
		table = new JTable();
		table.addMouseListener(this);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
		table.getColumnModel().getColumn(3).setPreferredWidth(100);  //연락처
		table.getColumnModel().getColumn(4).setPreferredWidth(150); //메일
		table.getColumnModel().getColumn(5).setPreferredWidth(400); //주소
		table.getColumnModel().getColumn(6).setPreferredWidth(100); //직책명
		cellAlign(SwingConstants.CENTER, 0, 1, 6);
		cellAlign(SwingConstants.LEFT, 2, 3, 4, 5);
		scrollPane.setViewportView(table);
	}
	
	
	
	private Object[][] getRow() {
		Object[][] rows = null;
		try {
			EmployeeService empService= new EmployeeService();
			list = empService.selectEmployeeByAll();
			rows = new Object[list.size()][];
			for(int i=0;i<rows.length;i++){
				rows[i] = list.get(i).toArray();
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
		return rows;
	}
	private Object[] getColunmNames() {
		return new String[] {"사원번호", "이름", "아이디", "연락처", "메일", "주소", "직책"};
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
		if (e.getSource() == btnCancel) {
			actionPerformedBtnCancel(e);
		}
		if (e.getSource() == btnUpdate) {
			actionPerformedBtnUpdate(e);
		}
		if (e.getSource() == btnAdd) {
			actionPerformedBtnAdd(e);
		}
		if (e.getSource() == btnSearchAddr) {
			actionPerformedButton(e);
		}
	}
	protected void actionPerformedButton(ActionEvent e) {
		SearchAddrdetailUI addr = new SearchAddrdetailUI(tfAddr_id, tfZipCode);
		addr.setVisible(true);
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == table) {
			mouseClickedTable(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	
	protected void mouseClickedTable(MouseEvent e) {
		if (e.getClickCount() == 1) { 
			int row = table.getSelectedRow();
			Employee emp = list.get(row);
			tfEmpNo.setText(emp.getCode());
			tfEmpID.setText(emp.getId());
			tfEmpName.setText(emp.getName());
			tfEmpTel1.setText(emp.getTel().getPhone1());
			tfEmpTel2.setText(emp.getTel().getPhone2());
			tfEmpTel3.setText(emp.getTel().getPhone3());
			tfEmpEmail.setText(emp.getEmail());
			tfAddr_id.setText(emp.getAddr_id());
			tfAddr_de.setText(emp.getAddr_de());
			tfZipCode.setText(emp.getZipcode());
			cbkTitle.setSelectedIndex(emp.getTitle().getTitleno());
		}
	}
	
	// 사원 추가
	protected void actionPerformedBtnAdd(ActionEvent e) {
		if(isEmpty()) {
			EmployeeService service = new EmployeeService();
			Employee emp = new Employee();
			emp.setCode(tfEmpNo.getText());
			emp.setId(tfEmpID.getText());
			emp.setName(tfEmpName.getText());
			emp.setEmail(tfEmpEmail.getText());
			Phone tel = new Phone();
			tel.setPhone1(tfEmpTel1.getText());
			tel.setPhone2(tfEmpTel2.getText());
			tel.setPhone3(tfEmpTel3.getText());
			emp.setTel(tel);
			emp.setZipcode(tfZipCode.getText());
			emp.setAddr_id(tfAddr_id.getText());
			emp.setAddr_de(tfAddr_de.getText());
			emp.setPw(tfEmpNo.getText());
			Title title = new Title();
			title.setTitleno(cbkTitle.getSelectedIndex());
			emp.setTitle(title);
			service.insertEmployeeWithAPI(emp);
			JOptionPane.showMessageDialog(null, "추가 되었습니다");
			loadDataTable();			
		}else {
			JOptionPane.showMessageDialog(null, "모든 정보가 입력되어야 합니다.");
		}
	}
	private boolean isEmpty() {
		if(tfEmpNo.getText().equals("") || tfEmpID.getText().equals("") || tfEmpName.getText().equals("") ||
			tfEmpEmail.getText().equals("") || tfEmpTel1.getText().equals("") || tfEmpTel2.getText().equals("") || tfEmpTel3.getText().equals("") ||
			tfAddr_id.getText().equals("") || tfAddr_de.getText().equals("") || tfZipCode.getText().equals("")) {
			return false;
		}
		return true;
	}
	// 사원 정보 수정
	protected void actionPerformedBtnUpdate(ActionEvent e) {
		if(isEmpty()) {
			EmployeeService service = new EmployeeService();
			Employee emp = new Employee();
			emp.setCode(tfEmpNo.getText());
			emp.setId(tfEmpID.getText());
			emp.setName(tfEmpName.getText());
			emp.setEmail(tfEmpEmail.getText());
			Phone tel = new Phone();
			tel.setPhone1(tfEmpTel1.getText());
			tel.setPhone2(tfEmpTel2.getText());
			tel.setPhone3(tfEmpTel3.getText());
			emp.setTel(tel);
			emp.setZipcode(tfZipCode.getText());
			emp.setAddr_id(tfAddr_id.getText() + tfAddr_de.getText());
			emp.setAddr_de(tfAddr_de.getText());
			Title title = new Title();
			title.setTitleno(cbkTitle.getSelectedIndex());
			emp.setTitle(title);
			service.updateEmployeeWithAPI(emp);
			JOptionPane.showMessageDialog(null, "수정 되었습니다.");
			loadDataTable();
		}else {
			JOptionPane.showMessageDialog(null, "모든 정보가 입력되어야 합니다.");
		}
	}
	protected void actionPerformedBtnCancel(ActionEvent e) {
		tfEmpNo.setText("");
		tfEmpID.setText("");
		tfEmpName.setText("");
		tfEmpTel1.setText("");
		tfEmpTel2.setText("");
		tfEmpTel3.setText("");
		tfEmpEmail.setText("");
		tfAddr_id.setText("");
		tfZipCode.setText("");
		tfAddr_de.setText("");
		cbkTitle.setSelectedIndex(0);
	}
}
