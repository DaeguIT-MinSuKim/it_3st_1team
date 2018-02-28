package it_3st_1team.ui.librarian;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddBook extends JFrame implements ActionListener {

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

	public AddBook() {
		
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
		
		JComboBox catebig = new JComboBox();
		catebig.setBounds(150, 190, 150, 30);
		contentPane.add(catebig);
		
		JComboBox catemid = new JComboBox();
		catemid.setBounds(310, 190, 150, 30);
		contentPane.add(catemid);
		
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
		
		btnAdd = new JButton("도서 추가");
		btnAdd.setBorder(null);
		btnAdd.setForeground(new Color(64,64,64));
		btnAdd.setBackground(new Color(52,152,219));
		btnAdd.setBounds(453, 372, 97, 30);
		contentPane.add(btnAdd);
	}
	public void actionPerformed(ActionEvent e) {
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
}
