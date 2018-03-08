package kr.or.dgit.it_3st_1team.ui.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import kr.or.dgit.it_3st_1team.dto.History;
import kr.or.dgit.it_3st_1team.dto.Request;
import kr.or.dgit.it_3st_1team.service.HistoryService;
import kr.or.dgit.it_3st_1team.service.RequestService;
import kr.or.dgit.it_3st_1team.ui.StartUI;
import kr.or.dgit.it_3st_1team.ui.user.SearchBookUI.NonEditableModel;

@SuppressWarnings("serial")
public class HistoryUI extends JPanel implements ActionListener {
	private JTable table;
	private JScrollPane scrollPane;
	private JRadioButton rdbtnAll;
	private JRadioButton rdbtnout;
	private JRadioButton rdbtnin;
	private JRadioButton rdbrequest;
	private JRadioButton rdbreserve;

	public HistoryUI() {
		initComponents();
	}
	
	private void initComponents() {
		setBackground(Color.white);
		setLayout(null);
		
		JPanel pTableHistory = new JPanel();
		pTableHistory.setBackground(Color.WHITE);
		pTableHistory.setBounds(20, 10, 1140, 542);
		add(pTableHistory);
		pTableHistory.setLayout(null);
				
		JPanel pPage = new JPanel();
		pPage.setBackground(Color.WHITE);
		pPage.setBounds(5, 611, 1150, 80);
		add(pPage);
		pPage.setLayout(null);
		
		ButtonGroup group = new ButtonGroup();
		
		rdbtnAll = new JRadioButton("모두보기");
		rdbtnAll.addActionListener(this);
		rdbtnAll.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		rdbtnAll.setBackground(Color.WHITE);
		rdbtnAll.setBounds(0, 0, 100, 30);
		rdbtnAll.setSelected(true);
		pTableHistory.add(rdbtnAll);
		group.add(rdbtnAll);
		
		rdbtnout = new JRadioButton("대출");
		rdbtnout.addActionListener(this);
		rdbtnout.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		rdbtnout.setBackground(Color.WHITE);
		rdbtnout.setBounds(100, 0, 60, 30);
		pTableHistory.add(rdbtnout);
		group.add(rdbtnout);
		
		rdbtnin = new JRadioButton("반납");
		rdbtnin.addActionListener(this);
		rdbtnin.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		rdbtnin.setBackground(Color.WHITE);
		rdbtnin.setBounds(160, 0, 60, 30);
		pTableHistory.add(rdbtnin);
		group.add(rdbtnin);
		
		JLabel label = new JLabel("/");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		label.setBounds(225, 0, 30, 30);
		pTableHistory.add(label);
		
		rdbreserve = new JRadioButton("예약");
		rdbreserve.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		rdbreserve.setBackground(Color.WHITE);
		rdbreserve.setBounds(240, 0, 60, 30);
		group.add(rdbreserve);
		pTableHistory.add(rdbreserve);
		
		rdbrequest = new JRadioButton("신청");
		rdbrequest.addActionListener(this);
		rdbrequest.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		rdbrequest.setBackground(Color.WHITE);
		rdbrequest.setBounds(300, 0, 58, 30);
		group.add(rdbrequest);
		pTableHistory.add(rdbrequest);
		
		scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(0, 35, 1110, 542);
		scrollPane.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		pTableHistory.add(scrollPane);
		
		table = new JTable();
		table.setRowHeight(30);
		table.setBackground(Color.WHITE);
		table.getTableHeader().setBackground(new Color(245,245,245));
		table.getTableHeader().setFont(new Font("맑은 고딕", Font.BOLD, 18));
		loadDatas(Collections.emptyList());
		table.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		scrollPane.setViewportView(table);
		cellAlign(SwingConstants.CENTER, 0, 3, 4, 5, 6);
		cellAlign(SwingConstants.LEFT, 1, 2);
		PreferredWidth(50,410,200,150,150,150,100,120);
		rdbtnAll.setSelected(true);
		selectStartAllrdb();
	}
	
	private Object[][] getRow(List<History> list) {
		Object[][] rows = null;
		rows = new Object[list.size()][];
			for (int i = 0; i < rows.length; i++) {
				rows[i] = list.get(i).historyAll(i);
			}
		return rows;
	}
	
	private Object[][] getRow2(List<Request> list) {
		Object[][] rows = null;
		rows = new Object[list.size()][];
			for (int i = 0; i < rows.length; i++) {
				rows[i] = list.get(i).RequestToArray(i);
			}
		return rows;
	}
	private Object[] getColunmNames() {
		String[] names = null;
		if(rdbtnAll.isSelected()||rdbtnin.isSelected()||rdbtnout.isSelected()) {
			names = new String[] {"NO", "도서명", "저자", "대출일","반납예정일","실반납일", "연체일수","상태"}; 
		}else if(rdbreserve.isSelected()) {
			names = new String[] {"NO", "도서명", "저자", "대출일","반납예정일","실반납일", "연체일수","상태"};
		}else if(rdbrequest.isSelected()) {
			names = new String[] {"NO", "도서명", "저자", "출판사", "출판년도", "isbn", "신청일"};
		}
		return names;
	}
	public void loadDatas(List<History> list) {
		NonEditableModel model = new NonEditableModel(getRow(list), getColunmNames());
		table.setModel(model);
		cellAlign(SwingConstants.CENTER, 0, 3, 4, 5, 6,7);
		cellAlign(SwingConstants.LEFT, 1, 2);
		PreferredWidth(50,410,200,150,150,150,100,120);
		invalidate();
	}
	public void loadDatasHistory(List<History> list) {
		NonEditableModel model = new NonEditableModel(getRow(list), getColunmNames());
		table.setModel(model);
		cellAlign(SwingConstants.CENTER, 0, 3, 4, 5, 6,7);
		cellAlign(SwingConstants.LEFT, 1, 2);
		PreferredWidth(50,410,200,150,150,150,100,120);
		invalidate();
	}
	public void loadDatasRequest(List<Request> list) {
		NonEditableModel model = new NonEditableModel(getRow2(list), getColunmNames());
		table.setModel(model);
		cellAlign(SwingConstants.CENTER, 0, 3, 4, 5, 6);
		cellAlign(SwingConstants.LEFT, 1, 2);
		PreferredWidth(50,410,200,150,150,150,120);
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
	private void cellAlign(int align, int...idx) {
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(align);
		
		TableColumnModel model = table.getColumnModel();
		for(int i=0; i<idx.length; i++) {
			model.getColumn(idx[i]).setCellRenderer(dtcr);
		}
	}
	public void PreferredWidth(int... width) {
		TableColumnModel model1 = table.getColumnModel();
		for (int i = 0; i < width.length; i++) {
			model1.getColumn(i).setPreferredWidth(width[i]);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == rdbrequest) {
			actionPerformedRdbrequest(e);
		}
		if (e.getSource() == rdbtnin) {
			actionPerformedRdbtnin(e);
		}
		if (e.getSource() == rdbtnout) {
			actionPerformedRdbtnout(e);
		}
		if (e.getSource() == rdbtnAll) {
			actionPerformedRdbtnAll(e);
		}
	}
	protected void actionPerformedRdbtnAll(ActionEvent e) {
		selectStartAllrdb();
	}

	private void selectStartAllrdb() {
		History his = new History();
		his.setCode(StartUI.LOGINUSER.getCode());
		List<History> list = HistoryService.getInstance().selectAllhistory(his);
		loadDatasHistory(list);
	}
	protected void actionPerformedRdbtnout(ActionEvent e) {
		History his = new History();
		his.setCode(StartUI.LOGINUSER.getCode());
		List<History> list = HistoryService.getInstance().selectOuthistory(his);
		loadDatasHistory(list);
	}
	protected void actionPerformedRdbtnin(ActionEvent e) {
		History his = new History();
		his.setCode(StartUI.LOGINUSER.getCode());
		List<History> list = HistoryService.getInstance().selectInhistory(his);
		loadDatasHistory(list);
	}
	protected void actionPerformedRdbrequest(ActionEvent e) {
		Request req = new Request();
		req.setCode(StartUI.LOGINUSER.getCode());
		RequestService service = new RequestService();
		List<Request> list = service.selectRequestByCode(req);
		loadDatasRequest(list);
	}
}
