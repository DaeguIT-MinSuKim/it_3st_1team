package kr.or.dgit.it_3st_1team.ui.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import kr.or.dgit.it_3st_1team.dto.Book;
import kr.or.dgit.it_3st_1team.dto.Category;
import kr.or.dgit.it_3st_1team.dto.Location;
import kr.or.dgit.it_3st_1team.dto.Reserve;
import kr.or.dgit.it_3st_1team.service.BookService;
import kr.or.dgit.it_3st_1team.service.CategoryService;
import kr.or.dgit.it_3st_1team.service.LocationService;
import kr.or.dgit.it_3st_1team.service.ReserveService;
import kr.or.dgit.it_3st_1team.service.TakeinoutService;
import kr.or.dgit.it_3st_1team.ui.StartUI;

@SuppressWarnings("serial")
public class SearchBookUI extends JPanel implements ActionListener, ItemListener, MouseListener {
	public JTextField tfbookname;
	private SearchBtn btnSearch = new SearchBtn();
	public JTable table;
	private JScrollPane scrollPane;
	private JButton btnSearchDe;
	private SearchBookDetailUI search;
	private JPanel panel_1;
	int flag = 1;
	private JComboBox<Category> cbbbig;
	private JComboBox<Category> cbbmid;
	private JCheckBox cblistview;
	private List<Book> rentableList = new ArrayList<>();
	private StartUI staui;

	public SearchBookUI() {
		initComponents();
	}

	public void setStartUI(StartUI staui) {
		this.staui = staui;
	}

	private void initComponents() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);

		cbbbig = new JComboBox<>();
		cbbbig.addItemListener(this);
		cbbbig.setBorder(null);
		cbbbig.setMaximumRowCount(10);
		cbbbig.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		cbbbig.setBounds(30, 50, 150, 50);
		add(cbbbig);

		cbbmid = new JComboBox<>();
		cbbmid.setBorder(null);
		cbbmid.setMaximumRowCount(5);
		cbbmid.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		cbbmid.setBounds(200, 50, 150, 50);
		add(cbbmid);

		tfbookname = new JTextField();
		tfbookname.addActionListener(this);
		tfbookname.addMouseListener(this);
		tfbookname
				.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfbookname.setText("책 제목을 입력해주세요.");
		tfbookname.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfbookname.setBounds(370, 50, 500, 50);
		add(tfbookname);
		tfbookname.setColumns(10);

		btnSearch.setBounds(880, 50, 45, 45);
		btnSearch.addActionListener(this);
		btnSearch.setBackground(null);
		btnSearch.setBorder(null);
		add(btnSearch);

		btnSearchDe = new JButton("상세검색");
		btnSearchDe.addActionListener(this);
		btnSearchDe.setBorder(null);
		btnSearchDe.setBackground(new Color(52, 152, 219));
		btnSearchDe.setForeground(new Color(255, 255, 255));
		btnSearchDe.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btnSearchDe.setBounds(950, 55, 90, 40);
		add(btnSearchDe);

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(10, 120, 1110, 600);
		add(panel_1);
		panel_1.setLayout(null);

		cblistview = new JCheckBox();
		cblistview.addItemListener(this);
		cblistview.setBounds(870, 0, 21, 21);
		panel_1.add(cblistview);
		cblistview.setBackground(Color.WHITE);
		cblistview.setSelected(false);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 30, 1110, 570);
		panel_1.add(scrollPane);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setFont(new Font("맑은 고딕", Font.BOLD, 16));

		table = new JTable();
		table.setBackground(Color.WHITE);
		table.addMouseListener(this);
		table.setRowHeight(30);
		table.getTableHeader().setBackground(new Color(245, 245, 245));
		table.getTableHeader().setFont(new Font("맑은 고딕", Font.BOLD, 18));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		JLabel lblListview = new JLabel("대출 가능한 도서만 보기");
		lblListview.setBounds(900, 0, 178, 22);
		panel_1.add(lblListview);
		lblListview.setFont(new Font("맑은 고딕", Font.BOLD, 16));

		List<Book> list = BookService.getInstance().selectBookStartAll();
		for (Book b : list) {
			rentableList.add(b);
		}
		loadDatas(list);
		table.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		cellAlign(SwingConstants.CENTER, 0, 3, 4, 5, 6);
		cellAlign(SwingConstants.LEFT, 1, 2);
		PreferredWidth(40, 400, 160, 150, 100, 130, 130);
		scrollPane.setViewportView(table);

		initcmb();
	}

	public void cellAlign(int align, int... idx) {
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(align);

		TableColumnModel model = table.getColumnModel(); // 각각 컬럼에 적용
		for (int i = 0; i < idx.length; i++) {
			model.getColumn(idx[i]).setCellRenderer(dtcr);
		}
	}

	public void PreferredWidth(int... width) {
		TableColumnModel model1 = table.getColumnModel();
		for (int i = 0; i < width.length; i++) {
			model1.getColumn(i).setPreferredWidth(width[i]);
		}
	}

	private void initcmb() {
		List<Category> categoryBig = new ArrayList<>();
		Category decate = new Category();
		decate.setCatename("대분류 전체");
		categoryBig.add(decate);
		List<Category> listcate = CategoryService.getInstance().selectCategoryBig();
		for (Category cate : listcate) {
			categoryBig.add(cate);
		}
		DefaultComboBoxModel<Category> model = new DefaultComboBoxModel<>(
				categoryBig.toArray(new Category[categoryBig.size()]));
		cbbbig.setModel(model);

		Category decate2 = new Category();
		decate2.setCatename("중분류 전체");
		Category[] mid = new Category[] { decate2 };
		cbbmid.setModel(new DefaultComboBoxModel<>(mid));
	}

	public Object[][] getRow(List<Book> list) {
		Object[][] rows = null;
		rows = new Object[list.size()][];
		for (int i = 0; i < rows.length; i++) {
			rows[i] = list.get(i).toArray(i);
		}
		return rows;
	}

	public Object[] getColunmNames() {
		return new String[] { "NO", "도서명", "저자", "출판사", "출판년도", "비치수/보유수", "대여가능여부" };
	}


	public void loadDatas(List<Book> list) {
		List<Book> lists = new ArrayList<>();
		if (cblistview.isSelected()) {
			for (Book b : list) {
				if (b.isRentable().equals("대여가능")) {
					lists.add(b);
				}
			}
			NonEditableModel model = new NonEditableModel(getRow(lists), getColunmNames());
			table.setModel(model);
		} else {
			NonEditableModel model = new NonEditableModel(getRow(list), getColunmNames());
			table.setModel(model);
		}

		if (table.getRowCount() > 18) {
			panel_1.setBounds(panel_1.getX(), panel_1.getY(), 1110, 600);
			scrollPane.setBounds(scrollPane.getX(), scrollPane.getY(), 1110, 570);
		} else {
			int height = table.getRowHeight();
			int count = table.getRowCount();
			panel_1.setBounds(panel_1.getX(), panel_1.getY(), 1110, height * (count + 2));
			scrollPane.setBounds(scrollPane.getX(), scrollPane.getY(), 1110, height * (count + 1));
		}
		cellAlign(SwingConstants.CENTER, 0, 1, 3, 4, 5, 6);
		cellAlign(SwingConstants.LEFT, 1, 2);
		PreferredWidth(40, 400, 160, 150, 100, 130, 130);
		invalidate();
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

	class SearchBtn extends JButton {
		private ImageIcon icon = new ImageIcon("images/search.png");
		private Image img = icon.getImage();

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tfbookname) {
			actionPerformedTfbookname(e);
		}
		if (e.getSource() == btnSearchDe) {
			actionPerformedBtnSearchDe(e);
		}
		if (e.getSource() == btnSearch) {
			actionPerformedBtnSearch(e);
		}
	}

	private void actionPerformedBtnSearch(ActionEvent e) {
		Book book = new Book();
		Location loca = new Location();
		Category cate = (Category) cbbbig.getSelectedItem();
		String num = "";

		if (cbbbig.getSelectedIndex() > 0) { // 대분류 있음
			List<Category> biglist = CategoryService.getInstance().selectCategoryBig();
			int cbnum = cbbbig.getSelectedIndex();
			cate = biglist.get(cbnum - 1);
			num = CategoryService.getInstance().selectCateNum(cate);
			if (num.equals("0")) {
				num = "000";
			}

			if (cbbmid.getSelectedIndex() == 0) { // 중분류 없음
				loca.setLoca_num("%" + num + "%");
				book.setLocation(loca);
				if (!(tfbookname.getText().trim().isEmpty()) && !(tfbookname.getText().equals("책 제목을 입력해주세요."))) {
					book.setBkname("%" + tfbookname.getText() + "%");
					return;
				} else {
					rentableList = getFilterListData(book);
					return;
				}
			} else { // 중분류 있음
				getCategory(book, loca, cate, num);
				if (!(tfbookname.getText().trim().isEmpty()) && !(tfbookname.getText().equals("책 제목을 입력해주세요."))) {
					book.setBkname("%" + tfbookname.getText() + "%");
					getFilterListData(book);
					return;
				} else {

					rentableList = getFilterListData(book);
					return;
				}
			}
		} else {
			if (!(tfbookname.getText().trim().isEmpty()) && !(tfbookname.getText().equals("책 제목을 입력해주세요."))) { // 책 제목만
																												// 검색했을
																												// 때
				loca.setLoca_num(null);
				book.setLocation(loca);
				book.setBkname("%" + tfbookname.getText() + "%");
				List<Book> list = BookService.getInstance().selectBookAll(book);
				rentableList = list;
				loadDatas(list);
				return;
			} else {
				List<Book> list = BookService.getInstance().selectBookStartAll(); // 아무것도 입력안함
				rentableList = list;
				loadDatas(list);
				return;
			}
		}
	}

	private void getCategory(Book book, Location loca, Category cate, String num) {
		Category cate2 = new Category();
		String num2 = "";
		List<Category> midlist = CategoryService.getInstance().selectCategoryMid(cate);
		int cbnum2 = cbbmid.getSelectedIndex() - 1;
		cate2 = midlist.get(cbnum2);
		num2 = CategoryService.getInstance().selectCateNum(cate2);
		String fullCate = String.format("%s%s", num, num2);
		loca.setLoca_num(fullCate);
		book.setLocation(loca);
	}

	private List<Book> getFilterListData(Book book) {
		List<Book> list = BookService.getInstance().selectBookAll(book); // 대분류만
		rentableList = list;
		loadDatas(list);
		return list;
	}

	protected void actionPerformedBtnSearchDe(ActionEvent e) {
		if (flag == 1) {
			search = new SearchBookDetailUI();
			search.setBounds(20, 120, 1080, 250);
			search.setBookui(this);
			panel_1.setBounds(10, 380, 1110, 330);
			scrollPane.setBounds(0, 30, 1110, 300);
			loadDatas(rentableList);
			if (table.getRowCount() > 9) {
				panel_1.setBounds(10, 380, 1110, 330);
				scrollPane.setBounds(0, 30, 1110, 300);
			} else {
				int height = table.getRowHeight();
				int count = table.getRowCount();
				panel_1.setBounds(10, 380, 1140, height * (count + 2)+5);
				scrollPane.setBounds(0, 30, 1110, height * (count + 1)+5);
			}
			add(search);
			flag = 0;
			repaint();
		} else {
			remove(search);
			panel_1.setBounds(10, 120, 1110, 600);
			scrollPane.setBounds(0, 30, 1110, 570);
			loadDatas(rentableList);
			repaint();
			flag = 1;
		}
		repaint();
		revalidate();
		scrollPane.repaint();
		table.repaint();
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cblistview) {
			itemStateChangedCblistview(e);
		}
		if (e.getSource() == cbbbig) {
			itemStateChangedCbbbig(e);
		}
	}

	protected void itemStateChangedCbbbig(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			if (cbbbig.getSelectedIndex() == 0) {
				cbbmid.removeAllItems();
				cbbmid.addItem(new Category("중분류 전체"));
			} else {
				loadCategoryMid((Category) cbbbig.getSelectedItem());
			}
		}
	}

	private void loadCategoryMid(Category selectedItem) {
		System.out.println(selectedItem);
		List<Category> categoryMid = new ArrayList<>();
		Category decate2 = new Category();
		decate2.setCatename("중분류 전체");
		categoryMid.add(decate2);

		List<Category> listcate = CategoryService.getInstance().selectCategoryMid(selectedItem);
		for (Category cate : listcate) {
			categoryMid.add(cate);
		}
		DefaultComboBoxModel<Category> model = new DefaultComboBoxModel<>(
				categoryMid.toArray(new Category[categoryMid.size()]));
		cbbmid.setModel(model);
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == table) {
			mouseClickedTable(e);
		}
		if (e.getSource() == tfbookname) {
			mouseClickedTfbookname(e);
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

	protected void mouseClickedTfbookname(MouseEvent e) {
		tfbookname.setText("");
	}

	protected void itemStateChangedCblistview(ItemEvent e) {
		if (cblistview.isSelected()) {
			loadDatas(rentableList);
		} else {
			loadDatas(rentableList);
		}
	}

	protected void mouseClickedTable(MouseEvent e) {
		if (e.getClickCount() == 2) {
			table = (JTable) e.getSource();
			String name = table.getModel().getValueAt(table.getSelectedRow(), 1).toString();
			String author = table.getModel().getValueAt(table.getSelectedRow(), 2).toString();
			String publish = table.getModel().getValueAt(table.getSelectedRow(), 3).toString();
			int pubyear = Integer.parseInt(table.getModel().getValueAt(table.getSelectedRow(), 4).toString());
			Book book = new Book();
			book.setBkname(name);
			book.setAuthor(author);
			book.setPublish(publish);
			book.setPubyear(pubyear);
			String isbn = BookService.getInstance().selectIsbn(book);
			Book resultBook = BookService.getInstance().selectByIsbn(isbn);
			BookinfoUI info = new BookinfoUI();
			info.setStartUI(staui);
			info.setVisible(true);
			info.tfBookcode.setText(resultBook.getBkCode());
			info.tfauthor.setText(resultBook.getAuthor());
			info.tfpublish.setText(resultBook.getPublish());
			info.tfBookname.setText(resultBook.getBkname());
			info.tpinfo.setText(resultBook.getInfo());
			info.tfisbn.setText(resultBook.getIsbn());
			info.tfpubyear.setText(Integer.toString(resultBook.getPubyear()));
			int ExistNum = BookService.getInstance().selectExistNum(isbn);
			TakeinoutService service = new TakeinoutService();
			int Num = service.selectOutNum(isbn);
			int inNum = ExistNum - Num;
			info.tfnum.setText(String.format("%s / %s", inNum, ExistNum));
			Location loca = new Location();
			loca.setLoca_num(resultBook.getLocation().getLoca_num());
			String section = LocationService.getInstance().selectSectionBynum(loca);
			info.tfLocation.setText(String.format("%s%s", section, loca.getLoca_num()));
			Reserve res = new Reserve();
			res.setIsbn(isbn);
			int num = ReserveService.getInstance().selectReserveNum(res);
			info.tfreservenum.setText(Integer.toString(num));
		}
	}

	protected void actionPerformedTfbookname(ActionEvent e) {
		actionPerformedBtnSearch(e);
	}
}
