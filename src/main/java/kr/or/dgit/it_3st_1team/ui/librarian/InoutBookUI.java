package kr.or.dgit.it_3st_1team.ui.librarian;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import kr.or.dgit.it_3st_1team.dto.Book;
import kr.or.dgit.it_3st_1team.dto.Takeinout;
import kr.or.dgit.it_3st_1team.dto.User;
import kr.or.dgit.it_3st_1team.service.TakeinoutService;
import kr.or.dgit.it_3st_1team.service.UserService;

@SuppressWarnings("serial")
public class InoutBookUI extends JPanel implements ActionListener, KeyListener {
	private JTable table;
	private JButton btnUserSearch;
	private JTextField tfUserCode;
	private JTextField tfName;
	private JTextField tfId;
	private JTextField tfPhone;
	private JTextField tfEmail;
	private JTextField tfZipCode;
	private JTextField tfAddress;
	private JTextField tfAddr_de;
	private JTextField tfBkCode;
	private JScrollPane scrollPane;
	private JPanel pTable;
	private JButton btnOut;
	private JButton btnIn;

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
		lblNewLabel.setBounds(40, 10, 106, 30);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("이           름");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		label.setBounds(40, 56, 106, 30);
		panel.add(label);
		
		JLabel label_1 = new JLabel("아    이    디");
		label_1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		label_1.setBounds(40, 102, 106, 30);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("연    락    처");
		label_2.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		label_2.setBounds(40, 146, 106, 30);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("이    메    일");
		label_3.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		label_3.setBounds(40, 192, 106, 30);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("주           소");
		label_4.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		label_4.setBounds(40, 275, 106, 30);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("도  서  코  드");
		label_5.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		label_5.setBounds(40, 357, 106, 30);
		panel.add(label_5);
		
		tfUserCode = new JTextField();
		tfUserCode.addKeyListener(this);
		tfUserCode.setBounds(170, 13, 400, 30);
		panel.add(tfUserCode);
		tfUserCode.setColumns(10);
		
		tfName = new JTextField();
		tfName.setBounds(170, 59, 580, 30);
		panel.add(tfName);
		tfName.setColumns(10);
		
		tfId = new JTextField();
		tfId.setBounds(170, 103, 580, 30);
		panel.add(tfId);
		tfId.setColumns(10);
		
		tfPhone = new JTextField();
		tfPhone.setBounds(170, 149, 580, 30);
		panel.add(tfPhone);
		tfPhone.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(170, 195, 580, 30);
		panel.add(tfEmail);
		tfEmail.setColumns(10);
		
		tfZipCode = new JTextField();
		tfZipCode.setColumns(10);
		tfZipCode.setBounds(170, 234, 580, 30);
		panel.add(tfZipCode);
		
		tfAddress = new JTextField();
		tfAddress.setBounds(170, 277, 580, 30);
		panel.add(tfAddress);
		tfAddress.setColumns(10);
		
		tfAddr_de = new JTextField();
		tfAddr_de.setColumns(10);
		tfAddr_de.setBounds(170, 317, 580, 30);
		panel.add(tfAddr_de);
		
		tfBkCode = new JTextField();
		tfBkCode.addKeyListener(this);
		tfBkCode.setBounds(170, 360, 580, 30);
		panel.add(tfBkCode);
		tfBkCode.setColumns(10);
		
		JLabel label_6 = new JLabel("우  편  번  호");
		label_6.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		label_6.setBounds(40, 232, 106, 30);
		panel.add(label_6);
		
		btnUserSearch = new JButton("검    색");
		btnUserSearch.addActionListener(this);
		btnUserSearch.setBounds(582, 12, 168, 33);
		btnUserSearch.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		btnUserSearch.setForeground(Color.WHITE);
		btnUserSearch.setBackground(new Color(94,94,94));
		btnUserSearch.setBorder(null);
		panel.add(btnUserSearch);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(800, 0, 350, 400);
		panel_1.setBorder(new EmptyBorder(20, 20, 20, 20));
		pUser.add(panel_1);
		panel_1.setLayout(null);
		
		btnOut = new JButton("대 여");
		btnOut.addActionListener(this);
		btnOut.setFont(new Font("맑은 고딕", Font.PLAIN, 99));
		btnOut.setForeground(Color.WHITE);
		btnOut.setBounds(16, 17, 300, 160);
		btnOut.setBackground(new Color(94,94,94));
		btnOut.setBorder(null);
		btnOut.setMaximumSize(new Dimension(150, 150));
		btnOut.setMinimumSize(new Dimension(150, 150));
		panel_1.add(btnOut);
		
		btnIn = new JButton("반 납");
		btnIn.addActionListener(this);
		btnIn.setBorder(null);
		btnIn.setFont(new Font("맑은 고딕", Font.PLAIN, 99));
		btnIn.setForeground(Color.WHITE);
		btnIn.setBounds(16, 217, 300, 160);
		btnIn.setBackground(new Color(94,94,94));
		panel_1.add(btnIn);
		
		pTable = new JPanel();
		pTable.setBackground(Color.WHITE);
		pTable.setBounds(0, 400, 1150, 400);
		add(pTable);
		pTable.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 0, 1130, 400);
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
	private Object[][] getRow2() {
		Object[][] rows = null;
		TakeinoutService service = new TakeinoutService();
		Takeinout inout = new Takeinout();
		User user = new User();
		user.setCode(tfUserCode.getText());
		inout.setUser(user);
		List<Takeinout> list = service.selectUserForBookByAll(inout);
		rows = new Object[list.size()][];
		for(int i=0;i<rows.length;i++){
			rows[i] = list.get(i).toArrayUserForBook(i);
		}
		return rows;
	}
	private Object[] getColunmNames() {
		return new String[] {"NO", "도서코드", "도서명", "저자", "출판사", "출판년도","대여일","반납예정일"};
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
		if (e.getSource() == btnIn) {
			actionPerformedBtnIn(e);
		}
		if (e.getSource() == btnOut) {
			actionPerformedBtnOut(e);
		}
		if (e.getSource() == btnUserSearch) {
			actionPerformedBtnUserSearch(e);
		}
	}
	protected void actionPerformedBtnUserSearch(ActionEvent e) {
		System.out.println(tfUserCode.getText());
		if(!(tfUserCode.getText().equals(""))) {
			User user = new User(tfUserCode.getText());
			UserService userService = new UserService();
			user = userService.selectUserByCode(user);
			setUserInfo(user);
			setTakeinoutTable();
			pTable.repaint();
		}/*else {
			JOptionPane.showMessageDialog(null, "회원코드를 입력해주세요");
		}*/
	}
	private void setTakeinoutTable() {
		NonEditableModel model = new NonEditableModel(getRow2(), getColunmNames());
		table.setModel(model);
		setAlignWidth();
	}
	
	public void setAlignWidth() {
		// 셀의 너비와 정렬 // 외울것
		tableCellAlign(SwingConstants.CENTER,0,1,2,3,4,5,6,7);	//해당컬럼의 정렬방식
		tableCellWidth(40,150,400,150,140,90,100,100);	//순서대로의 너비값
	}
	
	protected void tableCellWidth(int... width) {
		TableColumnModel model = table.getColumnModel();
		for (int i = 0; i < width.length; i++) {
			model.getColumn(i).setPreferredWidth(width[i]);
		}
	}
	
	class NonEditableModel extends DefaultTableModel {

		public NonEditableModel(Object[][] data, Object[] columnNames) {
			super(data, columnNames);
		}

		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}
		
	}	
	
	protected void tableCellAlign(int align, int... idx) {
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); // 각각의 셀의 틀
		dtcr.setHorizontalAlignment(align);
		TableColumnModel model = table.getColumnModel();
		for (int i = 0; i < idx.length; i++) {
			model.getColumn(idx[i]).setCellRenderer(dtcr);
		}
	}
	
	private void setUserInfo(User user) {
		tfId.setText(user.getId());
		tfName.setText(user.getName());
		tfPhone.setText(user.getTel().toString());
		tfEmail.setText(user.getEmail());
//		tfZipCode.setText(user.getZipcode());
//		tfAddress.setText(user.getAddr_id().getTotal());
	
	}
	public void keyPressed(KeyEvent arg0) {
	}
	public void keyReleased(KeyEvent arg0) {
		if (arg0.getSource() == tfBkCode) {
			keyReleasedTfBkCode(arg0);
		}
		if (arg0.getSource() == tfUserCode) {
			keyReleasedTfUserCode(arg0);
		}
	}
	public void keyTyped(KeyEvent arg0) {
	}
	protected void keyReleasedTfUserCode(KeyEvent arg0) {
		if(tfUserCode.getText().length() == 14) {
			User user = new User(tfUserCode.getText());
			UserService userService = new UserService();
			user = userService.selectUserByCode(user);
			setUserInfo(user);
			setTakeinoutTable();
			pTable.repaint();
		}
	}
	protected void keyReleasedTfBkCode(KeyEvent arg0) {
		if(tfBkCode.getText().length() == 19) {
			String str = tfBkCode.getText().substring(1, 19);
			Book book = new Book();
			book.setBkCode(str);
			User user = new User();
			user.setCode(tfUserCode.getText());
			Takeinout inout = new Takeinout();
			inout.setBook(book);
			inout.setUser(user);
			TakeinoutService service = new TakeinoutService();
			Takeinout findinout = service.selectTakeinoutByBkCode(inout);
			Takeinout outBook = service.selectMatchingBook(book);
			System.out.println(outBook);
			if(findinout == null) {
				if(outBook == null) {
					service.insertTakeinoutByBkcode(inout);
					JOptionPane.showMessageDialog(null, "대여 되었습니다");
					tfBkCode.setText("");
					setTakeinoutTable();
					pTable.repaint();					
				}else {
					JOptionPane.showMessageDialog(null, "현재 타인이 대여중인 도서 입니다");
					JOptionPane.showMessageDialog(null, "현재 타인이 대여중인 도서 입니다");
					tfBkCode.setText("");
				}
			}else {
				service.deleteTakeinoutByBkcode(inout);
				JOptionPane.showMessageDialog(null, "반납 되었습니다");
				tfBkCode.setText("");
				setTakeinoutTable();
				pTable.repaint();
			}
		}
	}
	
	// 대여
	protected void actionPerformedBtnOut(ActionEvent e) {
		
	}
	
	// 반납
	protected void actionPerformedBtnIn(ActionEvent e) {
		if(tfBkCode.getText().length() == 19) {
			String str = tfBkCode.getText().substring(1, 19);
			Book book = new Book();
			book.setBkCode(str);
			User user = new User();
			user.setCode(tfUserCode.getText());
			Takeinout inout = new Takeinout();
			inout.setBook(book);
			inout.setUser(user);
			TakeinoutService service = new TakeinoutService();
			Takeinout findinout = service.selectTakeinoutByBkCode(inout);
			if(findinout == null) {
				service.insertTakeinoutByBkcode(inout);
				JOptionPane.showMessageDialog(null, "대여 되었습니다");
				tfBkCode.setText("");
				setTakeinoutTable();
				pTable.repaint();
			}else {
				service.deleteTakeinoutByBkcode(inout);
				JOptionPane.showMessageDialog(null, "반납 되었습니다");
				tfBkCode.setText("");
				setTakeinoutTable();
				pTable.repaint();
			}
		}
	}
}
