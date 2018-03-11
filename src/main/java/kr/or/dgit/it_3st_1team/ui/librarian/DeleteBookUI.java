package kr.or.dgit.it_3st_1team.ui.librarian;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import kr.or.dgit.it_3st_1team.dto.Book;
import kr.or.dgit.it_3st_1team.dto.Category;
import kr.or.dgit.it_3st_1team.service.CategoryService;
import kr.or.dgit.it_3st_1team.service.ManageBookService;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class DeleteBookUI extends JFrame implements ActionListener, ItemListener, KeyListener {

	private JPanel contentPane;
	private JTextField tfcode;
	private JTextField tfname;
	private JTextField tfpubyear;
	private JButton btnAdd;
	private JTextField tfisbn;
	private JLabel lblinfo;
	private JButton btnReset;
	private JTextField tfauthor;
	private JTextField tfpublish;
	private JTextPane tpinfo;
	private JComboBox<Category> cbkMiddle;
	private JComboBox<Category> cbkBig;
	private List<Category> bigListCategory;
	private List<Category> midListCategory;

	public DeleteBookUI() {
		initComponents();
	}
	private void initComponents() {
		setTitle("도서 추가");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(450, 200, 618, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblcode = new JLabel("도서코드");
		lblcode.setHorizontalAlignment(SwingConstants.RIGHT);
		lblcode.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblcode.setBounds(20, 25, 120, 40);
		contentPane.add(lblcode);
		
		JLabel lblname = new JLabel("도서명");
		lblname.setHorizontalAlignment(SwingConstants.RIGHT);
		lblname.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblname.setBounds(20, 65, 120, 40);
		contentPane.add(lblname);
		
		JLabel lblauthor = new JLabel("저자");
		lblauthor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblauthor.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblauthor.setBounds(20, 105, 120, 40);
		contentPane.add(lblauthor);
		
		JLabel lblpublish = new JLabel("출판사");
		lblpublish.setHorizontalAlignment(SwingConstants.RIGHT);
		lblpublish.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblpublish.setBounds(20, 145, 120, 40);
		contentPane.add(lblpublish);
		
		JLabel lblpubyear = new JLabel("출판년도");
		lblpubyear.setHorizontalAlignment(SwingConstants.RIGHT);
		lblpubyear.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblpubyear.setBounds(312, 145, 64, 40);
		contentPane.add(lblpubyear);
		
		JLabel lblcategory = new JLabel("도서분류");
		lblcategory.setHorizontalAlignment(SwingConstants.RIGHT);
		lblcategory.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblcategory.setBounds(20, 185, 120, 40);
		contentPane.add(lblcategory);
		
		JLabel lblisbn = new JLabel("ISBN");
		lblisbn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblisbn.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblisbn.setBounds(20, 225, 120, 40);
		contentPane.add(lblisbn);
		
		lblinfo = new JLabel("도서 정보");
		lblinfo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblinfo.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblinfo.setBounds(20, 265, 120, 40);
		contentPane.add(lblinfo);
		
		tfcode = new JTextField();
		tfcode.addKeyListener(this);
		tfcode.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfcode.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfcode.setBounds(150, 30, 150, 30);
		contentPane.add(tfcode);
		tfcode.setColumns(10);
		
		tfname = new JTextField();
		tfname.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfname.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfname.setBounds(150, 70, 150, 30);
		contentPane.add(tfname);
		tfname.setColumns(10);
		
		tfauthor = new JTextField();
		tfauthor.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfauthor.setColumns(10);
		tfauthor.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfauthor.setBounds(150, 110, 150, 30);
		contentPane.add(tfauthor);
		
		tfpublish = new JTextField();
		tfpublish.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfpublish.setColumns(10);
		tfpublish.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfpublish.setBounds(150, 150, 150, 30);
		contentPane.add(tfpublish);
		
		tfpubyear = new JTextField();
		tfpubyear.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfpubyear.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfpubyear.setBounds(386, 150, 80, 30);
		contentPane.add(tfpubyear);
		tfpubyear.setColumns(10);
		
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
		cbkBig.setBounds(150, 190, 150, 30);
		contentPane.add(cbkBig);
		
		
		Category decate2 = new Category();
		decate2.setCatename("중분류 전체");
		cbkMiddle = new JComboBox<>();
		cbkMiddle.addItem(decate2);
		cbkMiddle.setBorder(null);
		cbkMiddle.setMaximumRowCount(5);
		cbkMiddle.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		cbkMiddle.setBounds(310, 190, 150, 30);
		contentPane.add(cbkMiddle);
		
		tfisbn = new JTextField();
		tfisbn.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfisbn.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfisbn.setBounds(150, 230, 150, 30);
		contentPane.add(tfisbn);
		tfisbn.setColumns(10);
		
		tpinfo = new JTextPane();
		tpinfo.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		tpinfo.setBounds(150, 270, 400, 80);
		contentPane.add(tpinfo);
		
		btnReset = new JButton("초기화");
		btnReset.addActionListener(this);
		btnReset.setForeground(Color.DARK_GRAY);
		btnReset.setBorder(null);
		btnReset.setBackground(new Color(190, 190, 190));
		btnReset.setBounds(344, 372, 97, 30);
		contentPane.add(btnReset);
		
		btnAdd = new JButton("도서 삭제");
		btnAdd.addActionListener(this);
		btnAdd.setBorder(null);
		btnAdd.setForeground(new Color(64,64,64));
		btnAdd.setBackground(new Color(52,152,219));
		btnAdd.setBounds(453, 372, 97, 30);
		contentPane.add(btnAdd);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAdd) {
			actionPerformedBtnAdd(e);
		}
		if (e.getSource() == btnReset) {
			actionPerformedButton(e);
		}
	}
	protected void actionPerformedButton(ActionEvent e) {
		tfauthor.setText("");
		tfcode.setText("");
		tfisbn.setText("");
		tfname.setText("");
		tfpublish.setText("");
		tfpubyear.setText("");
		tpinfo.setText("");
	}
	public void itemStateChanged(ItemEvent arg0) {
		if (arg0.getSource() == cbkBig) {
			loadCategoryMid((Category)cbkBig.getSelectedItem());
		}
	}
	protected void itemStateChangedCatebig(ItemEvent arg0) {
	}
	
	private void loadCategoryMid(Category selectedItem) {
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
	protected void actionPerformedBtnAdd(ActionEvent e) {
		Book book = new Book();
		if(!(tfcode.getText().equals(""))) {
			String str = tfcode.getText().substring(1, 19);
			book.setBkCode(str);
			ManageBookService service = new ManageBookService();
			service.deleteBookWithAPI(book);
			JOptionPane.showMessageDialog(null, "도서가 삭제되었습니다");
		}
	}
	public void keyPressed(KeyEvent arg0) {
	}
	public void keyReleased(KeyEvent arg0) {
		if (arg0.getSource() == tfcode) {
			keyReleasedTfcode(arg0);
		}
	}
	public void keyTyped(KeyEvent arg0) {
	}
	protected void keyReleasedTfcode(KeyEvent e) {
		Book book = new Book();
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			if(!(tfcode.getText().equals(""))) {
				String str = tfcode.getText().substring(1, 19);
				book.setBkCode(str);
				ManageBookService service = new ManageBookService();
				book = service.selectBookByCodeWithAPI(book);
				tfname.setText(book.getBkname());
				tfauthor.setText(book.getAuthor());
				tfisbn.setText(book.getIsbn());
				tfpublish.setText(book.getPublish());
				int num = Integer.parseInt(book.getLocation().getLoca_num().substring(0, 1));
				int num2 = Integer.parseInt(book.getLocation().getLoca_num().substring(4, 5));
				cbkBig.setSelectedIndex(num+1);
				cbkMiddle.setSelectedIndex(num2);
				tfpubyear.setText(Integer.toString(book.getPubyear()));
				tpinfo.setText(book.getInfo());
			}
		}
	}
}
