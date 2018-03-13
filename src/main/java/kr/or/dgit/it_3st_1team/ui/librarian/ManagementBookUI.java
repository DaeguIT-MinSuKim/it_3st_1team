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
import kr.or.dgit.it_3st_1team.dto.History;
import kr.or.dgit.it_3st_1team.dto.Location;
import kr.or.dgit.it_3st_1team.dto.Request;
import kr.or.dgit.it_3st_1team.dto.Reserve;
import kr.or.dgit.it_3st_1team.service.CategoryService;
import kr.or.dgit.it_3st_1team.service.HistoryService;
import kr.or.dgit.it_3st_1team.service.ManageBookService;
import kr.or.dgit.it_3st_1team.service.RequestService;
import kr.or.dgit.it_3st_1team.service.ReserveService;

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
	private JButton btnDeleteBook;
	

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
		bigListCategory = CategoryService.getInstance().selectCategoryBig();
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
		rdbtnAll.addItemListener(item);
		rdbtnAll.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		rdbtnAll.setBackground(Color.WHITE);
		rdbtnAll.setBounds(10, 30, 90, 30);
		group.add(rdbtnAll);
		pState.add(rdbtnAll);
		
		rdbtnOut = new JRadioButton("대여");
		rdbtnOut.addItemListener(item);
		rdbtnOut.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		rdbtnOut.setBackground(Color.WHITE);
		rdbtnOut.setBounds(104, 30, 70, 30);
		group.add(rdbtnOut);
		pState.add(rdbtnOut);
		
		rdbtnIn = new JRadioButton("반납");
		rdbtnIn.addItemListener(item);
		rdbtnIn.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		rdbtnIn.setBackground(Color.WHITE);
		rdbtnIn.setBounds(178, 30, 60, 30);
		group.add(rdbtnIn);
		pState.add(rdbtnIn);
		
		btnAddbook = new JButton("도서추가");
		btnAddbook.addActionListener(this);
		
		rdbtnReserve = new JRadioButton("예약");
		rdbtnReserve.addItemListener(this);
		rdbtnReserve.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		rdbtnReserve.setBackground(Color.WHITE);
		rdbtnReserve.setBounds(251, 30, 60, 30);
		group.add(rdbtnReserve);
		pState.add(rdbtnReserve);
		
		rdbtnReQ = new JRadioButton("신청");
		rdbtnReQ.addItemListener(this);
		rdbtnReQ.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		rdbtnReQ.setBackground(Color.WHITE);
		rdbtnReQ.setBounds(319, 30, 60, 30);
		group.add(rdbtnReQ);
		pState.add(rdbtnReQ);
		
		btnAddbook.setBorder(null);
		btnAddbook.setBackground(new Color(94,94,94));
		btnAddbook.setForeground(new Color(255, 255, 255));
		btnAddbook.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btnAddbook.setBounds(905, 15, 90, 40);
		pState.add(btnAddbook);
		
		btnDeleteBook = new JButton("도서삭제");
		btnDeleteBook.addActionListener(this);
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
	
	ItemListener item = new ItemListener() {
		
		@Override
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
		}
		
	};
	private JRadioButton rdbtnReserve;
	private JRadioButton rdbtnReQ;
	
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
		List<Book> list = mbService.selectBookForTakeinoutWithAPI(book);
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
	protected void actionPerformedBtnDeleteBook(ActionEvent e) {
		DeleteBookUI frame = new DeleteBookUI();
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnDeleteBook) {
			actionPerformedBtnDeleteBook(e);
		}
		if (e.getSource() == btnSearch) {
			actionPerformedBtnSearch(e);
		}
		if (e.getSource() == btnAddbook) {
			actionPerformedBtnAddbook(e);
		}
	}
	
	private void loadCategoryMid(Category selectedItem) {
		if(selectedItem.getCatename().equals("대분류 전체")) {
			List<Category> categoryMid = new ArrayList<>();
			Category decate2 = new Category("중분류 전체");
			categoryMid.add(decate2);
			
			DefaultComboBoxModel<Category> model = 
					new DefaultComboBoxModel<>(categoryMid.toArray(new Category[categoryMid.size()]));
			cbkMiddle.setModel(model);
		}else {
			List<Category> categoryMid = new ArrayList<>();
			Category decate2 = new Category("중분류 전체");
			categoryMid.add(decate2);
			
			midListCategory = CategoryService.getInstance().selectCategoryMid(selectedItem);
			for(Category cate: midListCategory) {
				categoryMid.add(cate);
			}
			DefaultComboBoxModel<Category> model = 
					new DefaultComboBoxModel<>(categoryMid.toArray(new Category[categoryMid.size()]));
			cbkMiddle.setModel(model);
		}
		
	}
	
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == rdbtnReQ) {
			itemStateChangedRdbtnReQ(e);
		}
		if (e.getSource() == rdbtnReserve) {
			itemStateChangedRdbtnReserve(e);
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
		if(rdbtnOut.isSelected()) {	// 대여
			NonEditableModel model = new NonEditableModel(getRow3(), getColunmNames()); 
			table.setModel(model);
			setAlignWidth();
		}else if(rdbtnAll.isSelected()) {	//모두 보기
			NonEditableModel model = new NonEditableModel(getRow2(), getColunmNames()); 
			table.setModel(model);
			setAlignWidth();			
		}else if(rdbtnIn.isSelected()) {	// 반납
			NonEditableModel model = new NonEditableModel(getHisRow(),getHisColunmNames()); 
			table.setModel(model);
			cellAlign(SwingConstants.CENTER, 0, 1, 3, 4, 5, 6,7,8);
			cellAlign(SwingConstants.LEFT, 2);
			PreferredWidth(50,100,170,400,170,130,130,110,100);
			invalidate();
		}else if(rdbtnReserve.isSelected()) {	// 예약
			NonEditableModel model = new NonEditableModel(getResRow(), getResColunmNames()); 
			table.setModel(model);
			cellAlign(SwingConstants.CENTER, 0, 3, 4, 5, 6);
			cellAlign(SwingConstants.LEFT, 1, 2);
			PreferredWidth(50,410,200,150,150,150,100,120);
			invalidate();
		}else if(rdbtnReQ.isSelected()){
			NonEditableModel model = new NonEditableModel(getReqRow(), getReqColunmNames()); 
			table.setModel(model);
			cellAlign(SwingConstants.CENTER, 0, 3, 4, 5, 6);
			cellAlign(SwingConstants.LEFT, 1, 2);
			PreferredWidth(50,410,200,150,150,150,100,120);
			invalidate();
		}else {
			NonEditableModel model = new NonEditableModel(getRow2(), getColunmNames()); 
			table.setModel(model);
			setAlignWidth();
		}
	}
	protected void itemStateChangedRdbtnOut(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			NonEditableModel model = new NonEditableModel(getRow3(), getColunmNames()); 
			table.setModel(model);
			setAlignWidth();
		}
	}
	protected void itemStateChangedRdbtnAll(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			NonEditableModel model = new NonEditableModel(getRow2(), getColunmNames()); 
			table.setModel(model);
			setAlignWidth();
		}
	}
	protected void itemStateChangedRdbtnIn(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			NonEditableModel model = new NonEditableModel(getHisRow(), getHisColunmNames()); 
			table.setModel(model);
			cellAlign(SwingConstants.CENTER, 0, 1, 3, 4, 5, 6,7,8);
			cellAlign(SwingConstants.LEFT, 2);
			PreferredWidth(50,100,170,400,170,130,130,110,100);
			invalidate();
		}
	}
	protected void itemStateChangedRdbtnReserve(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			NonEditableModel model = new NonEditableModel(getResRow(), getResColunmNames()); 
			table.setModel(model);
			cellAlign(SwingConstants.CENTER, 0, 3, 4, 5, 6);
			cellAlign(SwingConstants.LEFT, 1, 2);
			PreferredWidth(50,410,200,150,150,150,100);
			invalidate();
		}
	}
	protected void itemStateChangedRdbtnReQ(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			NonEditableModel model = new NonEditableModel(getReqRow(), getReqColunmNames()); 
			table.setModel(model);
			cellAlign(SwingConstants.CENTER, 0, 3, 4, 5, 6);
			cellAlign(SwingConstants.LEFT, 1, 2);
			PreferredWidth(50,410,200,150,150,150,100);
			invalidate();
		}
	}
	
	private Object[][] getReqRow() {
		Object[][] rows = null;
		RequestService service = new RequestService();
		List<Request> list = service.selectAllRequest();
		rows = new Object[list.size()][];
		for(int i=0;i<rows.length;i++){
			rows[i] = list.get(i).RequestToArray(i);
		}
		return rows;
	}
	private Object[][] getResRow() {
		Object[][] rows = null;
		Reserve res = new Reserve();
		if(tfSearch.getText().equals("")) {
			res.setBkName(null);
		}else {
			res.setBkName("%"+tfSearch.getText()+"%");
		}
		
		if(cbkBig.getSelectedIndex() > 0) {
			int bigIdx = cbkBig.getSelectedIndex();
			int midIdx = cbkMiddle.getSelectedIndex();
			if(cbkMiddle.getSelectedIndex() > 0) {
				res.setLoca_num(bigListCategory.get(bigIdx-1).getNum() + midListCategory.get(midIdx-1).getNum()+"%");				
			}else {
				res.setLoca_num(bigListCategory.get(bigIdx-1).getNum() + "%");
			}
		}
		List<Reserve> list = ReserveService.getInstance().selectCategoryByReserve(res);
		rows = new Object[list.size()][];
		for(int i=0;i<rows.length;i++){
			rows[i] = list.get(i).ReserveToArray(i);
		}
		return rows;
	}
	private Object[] getReqColunmNames() {
		return new String[] {"NO","도서명", "저자", "출판사", "출판년도", "isbn","신청일"};
	}
	private Object[] getResColunmNames() {
		return new String[] {"NO", "도서명", "저자", "출판사", "출판년도", "isbn","예약일"};
	}
	private Object[] getHisColunmNames() {
		return new String[] {"NO", "회원코드", "도서코드", "도서명", "저자", "대여일", "반납예정일", "반납일","연체일수"};
	}
	private Object[][] getHisRow() {
		Object[][] rows = null;
		History his = new History();
		if(tfSearch.getText().equals("")) {
			his.setBkname(null);
		}else {
			his.setBkname("%"+tfSearch.getText()+"%");
		}
		
		if(cbkBig.getSelectedIndex() > 0) {
			int bigIdx = cbkBig.getSelectedIndex();
			int midIdx = cbkMiddle.getSelectedIndex();
			if(cbkMiddle.getSelectedIndex() > 0) {
				his.setLoca_num(bigListCategory.get(bigIdx-1).getNum() + midListCategory.get(midIdx-1).getNum()+"%");				
			}else {
				his.setLoca_num(bigListCategory.get(bigIdx-1).getNum() + "%");
			}
		}
		List<History> list = HistoryService.getInstance().selectCategoryByInhistory(his);
		rows = new Object[list.size()][];
		for(int i=0;i<rows.length;i++){
			rows[i] = list.get(i).toHisAll(i);
		}
		return rows;
	}
	
	
	public void PreferredWidth(int... width) {
		TableColumnModel model1 = table.getColumnModel();
		for (int i = 0; i < width.length; i++) {
			model1.getColumn(i).setPreferredWidth(width[i]);
		}
	}
	
}
