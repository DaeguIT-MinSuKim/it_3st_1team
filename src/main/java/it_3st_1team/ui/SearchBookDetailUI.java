package it_3st_1team.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class SearchBookDetailUI extends JPanel implements ActionListener {
	private JTextField tfBookcode;
	private JTextField tfauthor;
	private JTextField tfpublish;
	private JTextField tfpubyear;
	private JTextField tfisbn;
	private JButton btnSearch;
	private JButton btnReset;
	private JButton btnClose;
	private JPanel panel;

	public SearchBookDetailUI() {
		initComponents();
	}
	
	private void initComponents() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(224,224,224));
		panel.setBounds(0, 0, 1080, 250);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblBookcode = new JLabel("도서코드");
		lblBookcode.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblBookcode.setBounds(270, 38, 73, 15);
		panel.add(lblBookcode);
		
		JLabel lblauthor = new JLabel("저자");
		lblauthor.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblauthor.setBounds(270, 77, 73, 15);
		panel.add(lblauthor);
		
		JLabel lblpublish = new JLabel("출판사");
		lblpublish.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblpublish.setBounds(270, 117, 73, 15);
		panel.add(lblpublish);
		
		JLabel lblpubyear = new JLabel("출판년도");
		lblpubyear.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblpubyear.setBounds(270, 157, 73, 15);
		panel.add(lblpubyear);
		
		JLabel lblIsbn = new JLabel("ISBN");
		lblIsbn.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblIsbn.setBounds(270, 197, 73, 15);
		panel.add(lblIsbn);
		
		tfBookcode = new JTextField();
		tfBookcode.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfBookcode.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfBookcode.setBounds(355, 30, 404, 30);
		panel.add(tfBookcode);
		tfBookcode.setColumns(10);
		
		tfauthor = new JTextField();
		tfauthor.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfauthor.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfauthor.setBounds(355, 70, 404, 30);
		panel.add(tfauthor);
		tfauthor.setColumns(10);
		
		tfpublish = new JTextField();
		tfpublish.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfpublish.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfpublish.setBounds(355, 110, 404, 30);
		panel.add(tfpublish);
		tfpublish.setColumns(10);
		
		tfpubyear = new JTextField();
		tfpubyear.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfpubyear.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfpubyear.setBounds(355, 150, 404, 30);
		panel.add(tfpubyear);
		tfpubyear.setColumns(10);
		
		tfisbn = new JTextField();
		tfisbn.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfisbn.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfisbn.setBounds(355, 190, 404, 30);
		panel.add(tfisbn);
		tfisbn.setColumns(10);
		
		btnSearch = new JButton("검색");
		btnSearch.setBorder(null);
		btnSearch.addActionListener(this);
		btnSearch.setBackground(new Color(52,152,219));
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btnSearch.setBounds(800, 190, 70, 30);
		panel.add(btnSearch);
		
		btnReset = new JButton("초기화");
		btnReset.setBorder(null);
		
		btnReset.addActionListener(this);
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btnReset.setBackground(new Color(128, 128, 128));
		btnReset.setBounds(890, 190, 90, 30);
		panel.add(btnReset);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnReset) {
			actionPerformedBtnReset(e);
		}
	}
	protected void actionPerformedBtnReset(ActionEvent e) {
		tfauthor.setText("");
		tfBookcode.setText("");
		tfisbn.setText("");
		tfpublish.setText("");
		tfpubyear.setText("");
	}
}
