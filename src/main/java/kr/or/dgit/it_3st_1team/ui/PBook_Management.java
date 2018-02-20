package kr.or.dgit.it_3st_1team.ui;

import javax.swing.JPanel;
import javax.swing.JTable;

import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PBook_Management extends JPanel implements ActionListener {
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	private JButton btnNewButton_1;

	/**
	 * Create the panel.
	 */
	public PBook_Management() {

		initComponents();
	}
	private void initComponents() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("검색");
		panel_2.add(lblNewLabel);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(40);
		
		JButton btnNewButton = new JButton("검색");
		panel_2.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("전체현황");
		panel_3.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("대여현황");
		panel_3.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("반납현황");
		panel_3.add(rdbtnNewRadioButton_2);
		
		btnNewButton_1 = new JButton("추가");
		btnNewButton_1.addActionListener(this);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("삭제");
		panel_3.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		table_1 = new JTable();
		panel_1.add(table_1);
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"번호", "도서코드", "회원ID", "도서명", "저자", "출판사", "출판년도", "대여일", "반납일"},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"\uBC88\uD638", "\uB3C4\uC11C\uCF54\uB4DC", "\uD68C\uC6D0ID", "\uB3C4\uC11C\uBA85", "\uC800\uC790", "\uCD9C\uD310\uC0AC", "\uCD9C\uD310\uB144\uB3C4", "\uB300\uC5EC\uC77C", "\uBC18\uB0A9\uC77C"
			}
		));
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			actionPerformedBtnNewButton_1(e);
		}
	}
	protected void actionPerformedBtnNewButton_1(ActionEvent e) {
		Jf_InsertBook ib = new Jf_InsertBook();
		ib.setVisible(true);
	}
}
