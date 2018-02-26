package it_3st_1team.ui.user;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class RequestBookUI extends JPanel {
	private JTextField tfBookcode;
	private JTextField tfauthor;
	private JTextField tfpublish;
	private JTextField tfpubyear;
	private JTextField tfisbn;
	private JButton btnSave;
	private JButton btnCancel;
	private JPanel panel;
	private JLabel lblprice;
	private JTextField textField;
	private JLabel label;

	public RequestBookUI() {
		initComponents();
	}
	private void initComponents() {
		setBackground(new Color(224,224,224));
		setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(224,224,224));
		panel.setBounds(130, 100, 950, 400);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblBookcode = new JLabel("도서명");
		lblBookcode.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblBookcode.setBounds(173, 94, 73, 15);
		panel.add(lblBookcode);
		
		JLabel lblauthor = new JLabel("저자");
		lblauthor.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblauthor.setBounds(173, 133, 73, 15);
		panel.add(lblauthor);
		
		JLabel lblpublish = new JLabel("출판사");
		lblpublish.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblpublish.setBounds(173, 173, 73, 15);
		panel.add(lblpublish);
		
		JLabel lblpubyear = new JLabel("출판년도");
		lblpubyear.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblpubyear.setBounds(173, 213, 73, 15);
		panel.add(lblpubyear);
		
		JLabel lblIsbn = new JLabel("ISBN");
		lblIsbn.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblIsbn.setBounds(173, 253, 73, 15);
		panel.add(lblIsbn);
		
		lblprice = new JLabel("가격");
		lblprice.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblprice.setBounds(173, 293, 73, 15);
		panel.add(lblprice);
		
		tfBookcode = new JTextField();
		tfBookcode.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfBookcode.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfBookcode.setBounds(258, 86, 404, 30);
		panel.add(tfBookcode);
		tfBookcode.setColumns(10);
		
		tfauthor = new JTextField();
		tfauthor.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfauthor.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfauthor.setBounds(258, 126, 404, 30);
		panel.add(tfauthor);
		tfauthor.setColumns(10);
		
		tfpublish = new JTextField();
		tfpublish.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfpublish.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfpublish.setBounds(258, 166, 404, 30);
		panel.add(tfpublish);
		tfpublish.setColumns(10);
		
		tfpubyear = new JTextField();
		tfpubyear.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfpubyear.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfpubyear.setBounds(258, 206, 404, 30);
		panel.add(tfpubyear);
		tfpubyear.setColumns(10);
		
		tfisbn = new JTextField();
		tfisbn.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfisbn.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfisbn.setBounds(258, 246, 404, 30);
		panel.add(tfisbn);
		tfisbn.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		textField.setBounds(258, 286, 404, 30);
		panel.add(textField);
		
		btnSave = new JButton("저장");
		btnSave.setBorder(null);
		btnSave.setBackground(new Color(52,152,219));
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btnSave.setBounds(592, 326, 70, 30);
		panel.add(btnSave);
		
		btnCancel = new JButton("취소");
		btnCancel.setBorder(null);
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btnCancel.setBackground(new Color(128, 128, 128));
		btnCancel.setBounds(499, 326, 70, 30);
		panel.add(btnCancel);
		
		label = new JLabel("희망 도서 입력");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 36));
		label.setBounds(173, 21, 360, 53);
		panel.add(label);
	}

}
