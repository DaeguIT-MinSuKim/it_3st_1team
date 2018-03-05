package kr.or.dgit.it_3st_1team.ui.join;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


import kr.or.dgit.it_3st_1team.dto.Post;
import kr.or.dgit.it_3st_1team.service.PostService;

@SuppressWarnings("serial")
public class SearchAddrdetailUI extends JFrame implements ActionListener, MouseListener {

	private JPanel contentPane;
	private JTextField tfAddrName;
	private JTable table;
	private JScrollPane scrollPane;
	private JComboBox<String> comboBox;
	private JButton btnSearch;
	private String value;
	private String value2;
	private JTextField tfone;
	private JTextField tftwo;


	public SearchAddrdetailUI() {
		initComponents();
	}
	
	
	
	public SearchAddrdetailUI(JTextField value, JTextField value2) {
		this.tfone = value;
		this.tftwo = value2;
		initComponents();
	}



	private void initComponents() {
		setTitle("주소 찾기");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(415, 260, 800, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"도로명 주소", "구 주소"}));
		comboBox.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		comboBox.setBounds(32, 23, 129, 37);
		contentPane.add(comboBox);
		
		tfAddrName = new JTextField();
		tfAddrName.setBounds(173, 23, 419, 42);
		tfAddrName.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfAddrName.setColumns(10);
		tfAddrName.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		contentPane.add(tfAddrName);
		
		btnSearch = new JButton("검색");
		btnSearch.addActionListener(this);
		btnSearch.setForeground(Color.BLACK);
		btnSearch.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btnSearch.setBorder(null);
		btnSearch.setBackground(new Color(52, 152, 219));
		btnSearch.setBounds(615, 24, 129, 40);
		contentPane.add(btnSearch);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 86, 708, 215);
		getContentPane().add(scrollPane);
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		
		table = new JTable();
		table.addMouseListener(this);
		table.setRowHeight(30);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.getTableHeader().setBackground(new Color(245,245,245));
		table.getTableHeader().setFont(new Font("맑은 고딕", Font.BOLD, 18));
		table.setModel(new DefaultTableModel(getRow3(),getColunmNames()));
		table.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		table.setEnabled(true);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.getColumnModel().getColumn(0).setPreferredWidth(10);	//번호
		table.getColumnModel().getColumn(1).setPreferredWidth(500); //주소
		table.getColumnModel().getColumn(2).setPreferredWidth(30); //우편번호
		
		scrollPane.setViewportView(table);
	}
	private Object[][] getRow() {
		PostService service = new PostService();
		Post post = new Post();
		post.setBubjung_name(tfAddrName.getText());
		List<Post> findpost = service.selectPostByAll1(post);
		Object[][] rows = new Object[findpost.size()][];
		for(int i = 0 ; i < rows.length ; i++){
			rows[i] = findpost.get(i).toArray1(i);
		}
		System.out.println(rows);
		return rows;
	}
	private Object[][] getRow2() {
		PostService service = new PostService();
		Post post = new Post();
		post.setDoro(tfAddrName.getText()+"%");
		List<Post> findpost = service.selectPostByAll2(post);
		Object[][] rows = new Object[findpost.size()][];
		for(int i = 0 ; i < rows.length ; i++){
			rows[i] = findpost.get(i).toArray(i);
		}
		System.out.println(rows);
		return rows;
	}
	private Object[][] getRow3() {
		Object[][] rows = null;
		
		return rows;
	}

	private Object[] getColunmNames() {
		return new String[] {"No", "주소", "우편번호"};
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
		if (e.getSource() == btnSearch) {
			actionPerformedBtnSearch(e);
		}
	}
	protected void actionPerformedBtnSearch(ActionEvent e) {
		String box = (String) comboBox.getSelectedItem();
		System.out.println(box);
		if(box.equals("도로명 주소")) {
			/*post.setSigungu(tfAddrName.getText());
			post.setDoro(tfAddrName.getText());*/
			table.setModel(new NonEditableModel(getRow2(),getColunmNames()));
			table.getColumnModel().getColumn(0).setPreferredWidth(10);	//번호
			table.getColumnModel().getColumn(1).setPreferredWidth(500); //주소
			table.getColumnModel().getColumn(2).setPreferredWidth(30); //우편번호
			
			table.repaint();
			table.revalidate();
		}else if(box.equals("구 주소")){
			table.setModel(new NonEditableModel(getRow(),getColunmNames()));
			table.getColumnModel().getColumn(0).setPreferredWidth(10);	//번호
			table.getColumnModel().getColumn(1).setPreferredWidth(500); //주소
			table.getColumnModel().getColumn(2).setPreferredWidth(30); //우편번호
			
			table.repaint();
			table.revalidate();
		}
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
		int 선택된행 = table.getSelectedRow();
		int nextCol = table.getSelectedColumn()+1;
		if (e.getClickCount() == 2) { 
			int 선택된열 = table.getSelectedColumn();
			
			DefaultTableModel tm=(DefaultTableModel) table.getModel();			
			tfone.setText((String) tm.getValueAt(선택된행, 선택된열));
			tftwo.setText((String) tm.getValueAt(선택된행, nextCol));

		/*	System.out.println(value.toString());
			System.out.println(value2.toString());	*/		
		} // 더블클릭
		
	}
	public void getTfPostAddr(JTextField addr) {
		addr.setText(value);
	}
	public void getTfPostNum(JTextField postnum) {
		postnum.setText(value2);
	}
	
	//테이블 내용을 수정하지 못하게 하는 클래스
		class NonEditableModel extends DefaultTableModel{

			public NonEditableModel(Object[][] data, Object[] columnNames) {
				super(data, columnNames);
				
			}
			public boolean isCellEditable(int row, int column) {
				return false;
			}
			
		}

	
}
