package it_3st_1team.ui.join;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import it_3st_1team.ui.service.EmployeeService;
import it_3st_1team.ui.service.PostService;
import kr.or.dgit.it_3st_1team.dto.Employee;
import kr.or.dgit.it_3st_1team.dto.Post;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

@SuppressWarnings("serial")
public class SearchAddrdetailUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfAddrName;
	private JTable table;
	private JScrollPane scrollPane;
	private JComboBox<String> comboBox;
	private JButton btnSearch;


	public SearchAddrdetailUI() {
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
		table.setRowHeight(30);
		table.getTableHeader().setBackground(new Color(245,245,245));
		table.getTableHeader().setFont(new Font("맑은 고딕", Font.BOLD, 18));
		table.setModel(new DefaultTableModel(getRow(),getColunmNames()));
		table.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.getColumnModel().getColumn(0).setPreferredWidth(10);	//번호
		table.getColumnModel().getColumn(1).setPreferredWidth(500); //주소
		table.getColumnModel().getColumn(2).setPreferredWidth(30); //우편번호		
		scrollPane.setViewportView(table);
	}
	private Object[][] getRow() {
		PostService service = new PostService();
		List<Post> findpost = service.selectPostByAll1();
		Object[][] rows = new Object[findpost.size()][3];
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
		Post post = new Post();
		if(box == "도로명 주소") {
			PostService service = new PostService();
			post.setSigungu(tfAddrName.getText());
			post.setDoro(tfAddrName.getText());
			List<Post> findpost = service.selectPostByAll1();
			Object[][] rows = new Object[findpost.size()][3];
			for(int i = 0 ; i < findpost.size() ; i++){
				rows[i][0] = i+1;
				rows[i][1] = post.getSido()+post.getSigungu()+post.getDoro()+ post.getBuild_num1()+ post.getBuild_num2();
				rows[i][2] = post.getZipcode();
				/*table.setModel();*/
			}
		}else {
			PostService service = new PostService();
			List<Post> findpost = service.selectPostByAll2();
		}
	}
}
