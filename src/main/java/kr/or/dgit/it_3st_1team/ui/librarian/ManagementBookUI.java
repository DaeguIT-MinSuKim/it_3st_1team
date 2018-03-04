package kr.or.dgit.it_3st_1team.ui.librarian;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
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
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import kr.or.dgit.it_3st_1team.dto.Book;
import kr.or.dgit.it_3st_1team.dto.Category;
import kr.or.dgit.it_3st_1team.dto.Location;
import kr.or.dgit.it_3st_1team.service.CategoryService;
import kr.or.dgit.it_3st_1team.service.ManageBookService;

@SuppressWarnings("serial")
public class ManagementBookUI extends JPanel implements ActionListener, ItemListener{
	private JTextField tfSearch;
	private JTable table;
	private JButton btnAddbook;
	private JComboBox<Category> cbkBig;
	private JComboBox<Category> cbkMiddle;
	private JButton btnSearch;
	private List<Category> bigListCategory;
	private List<Category> midListCategory;
	private JRadioButton rdbtnOut;
	private JRadioButton rdbtnAll;
	private JRadioButton rdbtnIn;
	

	public ManagementBookUI() {
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
		
		JPanel pSearch = new JPanel();
		pSearch.setBackground(new Color(255,255,255));
		pNorth.add(pSearch);
		pSearch.setLayout(null);
		
		List<Category> cateBig = new ArrayList<>();
		Category decate = new Category();
		decate.setCatename("대분류 전체");
		cateBig.add(decate);
		CategoryService service = new CategoryService();
		bigListCategory = service.selectCategoryBig();
		for(Category cate: bigListCategory) {
			cateBig.add(cate);
		}
		DefaultComboBoxModel<Category> model = new DefaultComboBoxModel<>(cateBig.toArray(new Category[cateBig.size()]));
		cbkBig = new JComboBox<>();
		cbkBig.addItemListener(this);
		cbkBig.setModel(model);
		cbkBig.setBorder(null);
		cbkBig.setMaximumRowCount(10);
		cbkBig.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		cbkBig.setBounds(new Rectangle(30, 10, 150, 50));
		pSearch.add(cbkBig);
		
		Category decate2 = new Category();
		decate2.setCatename("중분류 전체");
		cbkMiddle = new JComboBox<>();
		cbkMiddle.addItem(decate2);
		cbkMiddle.setBorder(null);
		cbkMiddle.setMaximumRowCount(5);
		cbkMiddle.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		cbkMiddle.setBounds(200, 10, 150, 50);
		pSearch.add(cbkMiddle);
		
		tfSearch = new JTextField();
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
		
		rdbtnAll = new JRadioButton("모두보기");
		rdbtnAll.addItemListener(this);
		rdbtnAll.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		rdbtnAll.setBackground(Color.WHITE);
		rdbtnAll.setBounds(10, 30, 100, 30);
		group.add(rdbtnAll);
		pState.add(rdbtnAll);
		
		rdbtnOut = new JRadioButton("대여");
		rdbtnOut.addItemListener(this);
		rdbtnOut.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		rdbtnOut.setBackground(Color.WHITE);
		rdbtnOut.setBounds(110, 30, 70, 30);
		group.add(rdbtnOut);
		pState.add(rdbtnOut);
		
		rdbtnIn = new JRadioButton("반납");
		rdbtnIn.addItemListener(this);
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
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		loadDatas();
		table.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		scrollPane.setViewportView(table);
		
	}
	
	private Object[][] getRow() {
		return new Object[][] {
			{null,null,null,null,null,null,null,null}			
		};
	}
	
	private Object[][] getRow2() {
		Object[][] rows = null;
		ManageBookService mbService = new ManageBookService();
		Book book = new Book();
		if(tfSearch.getText().equals("")) {
			book.setBkname(null);
		}else {
			book.setBkname("%"+tfSearch.getText()+"%");
		}
		Location loca = new Location();
		book.setLocation(loca);
		if(cbkBig.getSelectedIndex() > 0) {
			int bigIdx = cbkBig.getSelectedIndex();
			int midIdx = cbkMiddle.getSelectedIndex();
			if(cbkMiddle.getSelectedIndex() > 0) {
				loca.setLoca_num(bigListCategory.get(bigIdx-1).getNum() + midListCategory.get(midIdx-1).getNum()+"%");				
			}else {
				loca.setLoca_num(bigListCategory.get(bigIdx-1).getNum() + "%");
			}
			book.setLocation(loca);
		}
		List<Book> list = mbService.selectBookByAllForResultMapExtendsWithAPI(book);
		rows = new Object[list.size()][];
		for(int i=0;i<rows.length;i++){
			rows[i] = list.get(i).toArrayTakeinout(i);
		}
		return rows;
	}
	
	private Object[][] getRow3() {
		Object[][] rows = null;
		ManageBookService mbService = new ManageBookService();
		Book book = new Book("%"+tfSearch.getText()+"%");
		Location loca = new Location();
		book.setLocation(loca);
		if(cbkBig.getSelectedIndex() > 0) {
			int bigIdx = cbkBig.getSelectedIndex();
			int midIdx = cbkMiddle.getSelectedIndex();
			if(cbkMiddle.getSelectedIndex() > 0) {
				loca.setLoca_num(bigListCategory.get(bigIdx-1).getNum() + midListCategory.get(midIdx-1).getNum()+"%");				
			}else {
				loca.setLoca_num(bigListCategory.get(bigIdx-1).getNum() + "%");
			}
			book.setLocation(loca);
		}
		List<Book> list = mbService.selectBookByNameForResultMapExtendsWithAPI(book);
		rows = new Object[list.size()][];
		for(int i=0;i<rows.length;i++){
			rows[i] = list.get(i).toArrayTakeinout(i);
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
	
	protected void tableCellAlign(int align, int... idx) {
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); // 각각의 셀의 틀
		dtcr.setHorizontalAlignment(align);
		TableColumnModel model = table.getColumnModel();
		for (int i = 0; i < idx.length; i++) {
			model.getColumn(idx[i]).setCellRenderer(dtcr);
		}
	}
	
	public void loadDatas() {
		NonEditableModel model = new NonEditableModel(getRow(), getColunmNames());
		table.setModel(model);
		setAlignWidth();
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
	
	private void loadCategoryMid(Category selectedItem) {
		List<Category> categoryMid = new ArrayList<>();
		Category decate2 = new Category("중분류 전체");
		categoryMid.add(decate2);
		
		CategoryService service = new CategoryService();
		midListCategory = service.selectCategoryMid(selectedItem);
		for(Category cate: midListCategory) {
			categoryMid.add(cate);
		}
		DefaultComboBoxModel<Category> model = 
				new DefaultComboBoxModel<>(categoryMid.toArray(new Category[categoryMid.size()]));
		cbkMiddle.setModel(model);
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == rdbtnIn) {
			itemStateChangedRdbtnIn(e);
		}
		if (e.getSource() == rdbtnAll) {
			itemStateChangedRdbtnAll(e);
		}
		if (e.getSource() == rdbtnOut) {
			itemStateChangedRdbtnOut(e);
		}
		if (e.getSource() == cbkBig) {
			itemStateChangedCbkBig(e);
		}
	}
	protected void itemStateChangedCbkBig(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			loadCategoryMid((Category)cbkBig.getSelectedItem());
		}
	}
	protected void actionPerformedBtnSearch(ActionEvent e) {
		NonEditableModel model = new NonEditableModel(getRow2(), getColunmNames()); 
		table.setModel(model);
		setAlignWidth();
	}
	protected void itemStateChangedRdbtnOut(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			NonEditableModel model = new NonEditableModel(getRow(), getColunmNames()); 
			table.setModel(model);
			setAlignWidth();
		}
	}
	protected void itemStateChangedRdbtnAll(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			NonEditableModel model = new NonEditableModel(getRow(), getColunmNames()); 
			table.setModel(model);
			setAlignWidth();
		}
	}
	protected void itemStateChangedRdbtnIn(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			NonEditableModel model = new NonEditableModel(getRow(), getColunmNames()); 
			table.setModel(model);
			setAlignWidth();
		}
	}
}
