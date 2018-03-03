package kr.or.dgit.it_3st_1team.ui.librarian;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
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

import kr.or.dgit.it_3st_1team.dto.Book;
import kr.or.dgit.it_3st_1team.dto.Category;
import kr.or.dgit.it_3st_1team.dto.Location;
import kr.or.dgit.it_3st_1team.service.BookService;
import kr.or.dgit.it_3st_1team.service.CategoryService;

public class ManagementBookUI extends JPanel implements ActionListener, FocusListener{
	private JTextField tfSearch;
	private JTable table;
	private JButton btnAddbook;
	private JComboBox<Category> cbkBig;
	private JPanel pSearch;
	private CategoryService cateService;
	private JComboBox<Category> cbkMiddle;
	private JButton btnSearch;

	public ManagementBookUI() {
		cateService = new CategoryService();
		initComponents();
	}
	private void initComponents() {
		setBounds(new Rectangle(0, 0, 1150, 800));
		setBackground(Color.WHITE);
		setLayout(null);
		
		JPanel pNorth = new JPanel();
		pNorth.setBounds(0, 0, 1150, 135);
		pNorth.setBackground(new Color(255,255,255));
		add(pNorth);
		pNorth.setLayout(new GridLayout(2, 0, 0, 0));
		
		pSearch = new JPanel();
		pSearch.setBackground(new Color(255,255,255));
		pNorth.add(pSearch);
		pSearch.setLayout(null);		
		
		tfSearch = new JTextField();
		tfSearch.addFocusListener(this);
		tfSearch.setText("도서명으로 검색하세요");
		tfSearch.setToolTipText("도서명으로 검색하세요");
		tfSearch.setBounds(370, 10, 500, 50);
		pSearch.add(tfSearch);
		tfSearch.setColumns(10);
		
		btnSearch = new JButton("검색");
		btnSearch.addActionListener(this);
		btnSearch.setBorder(null);
		btnSearch.setBackground(new Color(52,152,219));
		btnSearch.setForeground(new Color(255, 255, 255));
		btnSearch.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btnSearch.setBounds(890, 15, 90, 40);
		pSearch.add(btnSearch);
		
		JPanel pState = new JPanel();
		pState.setBackground(new Color(255,255,255));
		pNorth.add(pState);
		pState.setLayout(null);
		
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton rdbtnAll = new JRadioButton("모두보기");
		rdbtnAll.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		rdbtnAll.setBackground(Color.WHITE);
		rdbtnAll.setBounds(10, 30, 100, 30);
		rdbtnAll.setSelected(true);
		group.add(rdbtnAll);
		pState.add(rdbtnAll);
		
		JRadioButton rdbtnOut = new JRadioButton("대여");
		rdbtnOut.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		rdbtnOut.setBackground(Color.WHITE);
		rdbtnOut.setBounds(110, 30, 70, 30);
		group.add(rdbtnOut);
		pState.add(rdbtnOut);
		
		JRadioButton rdbtnIn = new JRadioButton("반납");
		rdbtnIn.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		rdbtnIn.setBackground(Color.WHITE);
		rdbtnIn.setBounds(180, 30, 100, 30);
		group.add(rdbtnIn);
		pState.add(rdbtnIn);
		
		btnAddbook = new JButton("도서추가");
		btnAddbook.addActionListener(this);
		btnAddbook.setBorder(null);
		btnAddbook.setBackground(new Color(94,94,94));
		btnAddbook.setForeground(new Color(255, 255, 255));
		btnAddbook.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btnAddbook.setBounds(905, 15, 90, 40);
		pState.add(btnAddbook);
		
		JButton btnDeleteBook = new JButton("도서삭제");
		btnDeleteBook.setBorder(null);
		btnDeleteBook.setBackground(new Color(94,94,94));
		btnDeleteBook.setForeground(new Color(255, 255, 255));
		btnDeleteBook.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btnDeleteBook.setBounds(1007, 15, 90, 40);
		pState.add(btnDeleteBook);
		
		JPanel pCenter = new JPanel();
		pCenter.setBackground(new Color(255,255,255));
		pCenter.setBounds(0, 140, 1150, 650);
		add(pCenter);
		pCenter.setLayout(null);
		
		setcbkBigCategory();
		cbkBig.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				setcbkMidCategory();
				repaint();
				revalidate();
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 0, 1110, 542);
		pCenter.add(scrollPane);
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		table = new JTable();
		table.setRowHeight(30);
		table.setBackground(new Color(255,255,255));
		table.getTableHeader().setBackground(new Color(245,245,245));
		table.getTableHeader().setFont(new Font("맑은 고딕", Font.BOLD, 18));
		table.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setModel(new DefaultTableModel(getRow(),getColunmNames()));
		table.getColumnModel().getColumn(0).setPreferredWidth(40);	//번호
		table.getColumnModel().getColumn(1).setPreferredWidth(150); //도서코드
		table.getColumnModel().getColumn(2).setPreferredWidth(400);  //도서명
		table.getColumnModel().getColumn(3).setPreferredWidth(150);  //저자
		table.getColumnModel().getColumn(4).setPreferredWidth(140); //출판사
		table.getColumnModel().getColumn(5).setPreferredWidth(90); //출판년도
		table.getColumnModel().getColumn(6).setPreferredWidth(100); //대여일
		table.getColumnModel().getColumn(7).setPreferredWidth(100); //반납일
		scrollPane.setViewportView(table);
		
	}
	
	private void setcbkMidCategory() {
		cbkMiddle = new JComboBox();
		cbkMiddle.setBounds(200, 10, 150, 50);
		int num = cbkBig.getSelectedIndex()-1;
		List<Category> biglist = cateService.selectBigCategoryByAllWithAPI();
		Category cate1 = selectBigCategory(biglist.get(num));
		
		List<Category> midList = cateService.selectMidCategoryBySelectedWithAPI(cate1);
		midList.add(0, new Category("중분류"));
		Category[] cates = new Category[midList.size()];
		midList.toArray(cates);
		DefaultComboBoxModel<Category> dcbm = new DefaultComboBoxModel<>(cates);
		cbkMiddle.setModel(dcbm);
		pSearch.add(cbkMiddle);
	}
	private void setcbkBigCategory() {
		cbkBig = new JComboBox();
		cbkBig.setBounds(new Rectangle(30, 10, 150, 50));
		List<Category> bigList = cateService.selectBigCategoryByAllWithAPI();
		bigList.add(0, new Category("대분류"));
		Category[] cates = new Category[bigList.size()];
		bigList.toArray(cates);
		DefaultComboBoxModel<Category> dcbm = new DefaultComboBoxModel<>(cates);
		cbkBig.setModel(dcbm);
		pSearch.add(cbkBig);
		
	}
	private Object[][] getRow() {
		Object[][] rows = null;
		BookService service = new BookService();
		List<Book> list = service.selectBookByAllForResultMapExtendsWithAPI();
		rows = new Object[list.size()][];
		for(int i=0;i<rows.length;i++) {
			rows[i] = list.get(i).toArray(i);
		}
		return rows;
	}
	
	private Object[][] getRow2(Book book) {
		Object[][] rows = null;
		BookService service = new BookService();
		List<Book> list = service.selectBookByBigCategoryWithAPI(book);
		rows = new Object[list.size()][];
		for(int i=0;i<rows.length;i++) {
			rows[i] = list.get(i).toArray(i);
		}
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

	protected void actionPerformedBtnAddbook(ActionEvent e) {
		AddBookUI frame = new AddBookUI();
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSearch) {
			actionPerformedBtnSearch(e);
		}
		if (e.getSource() == btnAddbook) {
			actionPerformedBtnAddbook(e);
		}
	}
	protected void actionPerformedBtnSearch(ActionEvent e) {			
		int num = cbkBig.getSelectedIndex()-1;
		int num2 = cbkMiddle.getSelectedIndex();
		List<Category> biglist = cateService.selectBigCategoryByAllWithAPI();
		List<Category> midlist = cateService.selectMidCategoryByAllWithAPI();
		Category cate1 = selectBigCategory(biglist.get(num));
		Category cate2 = selectMidCategory(midlist.get(num2));
		String str1 = cate1.getNum();
		String str2 = cate2.getNum();
		String loca_num = str1 + str2;
		Location loca = new Location();
		loca.setLoca_num(loca_num);
		Book book = new Book();
		book.setLocation(loca);
		table.setModel(new DefaultTableModel(getRow2(book),getColunmNames()));	
	}
	private Category selectMidCategory(Category mid) {
		return cateService.selectCategoryByNameWithAPI(mid);
	}
	private Category selectBigCategory(Category big) {
		return cateService.selectCategoryByNameWithAPI(big);
	}
	public void focusGained(FocusEvent arg0) {
		if (arg0.getSource() == tfSearch) {
			focusGainedTfSearch(arg0);
		}
	}
	public void focusLost(FocusEvent arg0) {
	}
	protected void focusGainedTfSearch(FocusEvent arg0) {		tfSearch.setText("");
	}
}
