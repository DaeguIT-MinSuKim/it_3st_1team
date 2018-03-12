package kr.or.dgit.it_3st_1team.ui.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import kr.or.dgit.it_3st_1team.dto.Request;
import kr.or.dgit.it_3st_1team.dto.User;
import kr.or.dgit.it_3st_1team.service.RequestService;
import kr.or.dgit.it_3st_1team.ui.StartUI;

@SuppressWarnings("serial")
public class RequestBookUI extends JPanel implements ActionListener {
	private JTextField tfBkname;
	private JTextField tfauthor;
	private JTextField tfpublish;
	private JTextField tfpubyear;
	private JTextField tfisbn;
	private JButton btnSave;
	private JButton btnCancel;
	private JPanel panel;
	private JLabel lblprice;
	private JTextField tfprice;
	private JLabel label;
	private JButton btnKyobo;
	private JButton btnYes24;
	private JButton btnAladin;
	private JButton btnBandinlunis;

	public RequestBookUI() {
		initComponents();
	}

	private void initComponents() {
		setBounds(new Rectangle(0, 0, 1150, 800));
		setBackground(new Color(224, 224, 224));
		setLayout(null);

		panel = new JPanel();
		panel.setBackground(new Color(224, 224, 224));
		panel.setBounds(130, 100, 950, 385);
		add(panel);
		panel.setLayout(null);

		JLabel lblBkname = new JLabel("도서명");
		lblBkname.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblBkname.setBounds(173, 94, 73, 15);
		panel.add(lblBkname);

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

		tfBkname = new JTextField();
		tfBkname.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfBkname.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfBkname.setBounds(258, 86, 404, 30);
		panel.add(tfBkname);
		tfBkname.setColumns(10);

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

		tfprice = new JTextField();
		tfprice.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfprice.setColumns(10);
		tfprice.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfprice.setBounds(258, 286, 404, 30);
		panel.add(tfprice);

		btnSave = new JButton("저장");
		btnSave.addActionListener(this);
		btnSave.setBackground(new Color(52, 152, 219));
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btnSave.setBounds(592, 326, 70, 30);
		panel.add(btnSave);

		btnCancel = new JButton("취소");
		btnCancel.addActionListener(this);
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btnCancel.setBackground(new Color(128, 128, 128));
		btnCancel.setBounds(499, 326, 70, 30);
		panel.add(btnCancel);

		label = new JLabel("희망 도서 입력");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 36));
		label.setBounds(173, 21, 360, 53);
		panel.add(label);

		String imgPath = System.getProperty("user.dir") + "/images/";

		btnKyobo = new JButton("");
		btnKyobo.addActionListener(this);
		btnKyobo.setIcon(new ImageIcon(imgPath + "logo_kyobo.png"));
		btnKyobo.setBounds(88, 566, 200, 100);
		add(btnKyobo);

		btnYes24 = new JButton("");
		btnYes24.addActionListener(this);
		btnYes24.setIcon(new ImageIcon(imgPath + "logo_yes24.png"));
		btnYes24.setBounds(350, 566, 200, 100);
		add(btnYes24);

		btnAladin = new JButton("");
		btnAladin.addActionListener(this);
		btnAladin.setIcon(new ImageIcon(imgPath + "aladinlogo_kor_len.png"));
		btnAladin.setBounds(612, 566, 200, 100);
		add(btnAladin);

		btnBandinlunis = new JButton("");
		btnBandinlunis.addActionListener(this);
		btnBandinlunis.setIcon(new ImageIcon(imgPath + "interpark_01.png"));
		btnBandinlunis.setBounds(880, 566, 200, 100);
		add(btnBandinlunis);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancel) {
			actionPerformedBtnCancel(e);
		}
		if (e.getSource() == btnSave) {
			actionPerformedBtnSave(e);
		}
		if (e.getSource() == btnAladin) {
			actionPerformedBtnAladin(e);
		}
		if (e.getSource() == btnKyobo) {
			actionPerformedBtnKyobo(e);
		}
		if (e.getSource() == btnYes24) {
			actionPerformedBtnYes24(e);
		}
		if (e.getSource() == btnBandinlunis) {
			actionPerformedBtnBandinlunis(e);
		}
	}

	protected void actionPerformedBtnBandinlunis(ActionEvent e) {
		// interpark
		String url = "http://www.interpark.com";
		String[] cmds = { "CMD.EXE", "/C", "explorer", url };
		try {
			Process process = Runtime.getRuntime().exec(cmds);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	protected void actionPerformedBtnYes24(ActionEvent e) {
		// yes24
		String url = "http://www.yes24.com";
		String[] cmds = { "CMD.EXE", "/C", "explorer", url };
		try {
			Process process = Runtime.getRuntime().exec(cmds);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	protected void actionPerformedBtnKyobo(ActionEvent e) {
		// kyobo
		String url = "http://www.kyobobook.co.kr";
		String[] cmds = { "CMD.EXE", "/C", "explorer", url };
		try {
			Process process = Runtime.getRuntime().exec(cmds);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

	protected void actionPerformedBtnAladin(ActionEvent e) {
		// aladin
		String url = "http://www.aladin.co.kr";
		String[] cmds = { "CMD.EXE", "/C", "explorer", url };
		try {
			Process process = Runtime.getRuntime().exec(cmds);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	protected void actionPerformedBtnSave(ActionEvent e) {
		if (tfBkname.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "도서명을 입력해주세요.");
			tfBkname.requestFocus();
			return;
		} else if (tfauthor.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "저자를 입력해주세요.");
			tfauthor.requestFocus();
			return;
		} else if (tfpublish.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "출판사를 입력해주세요.");
			tfpublish.requestFocus();
			return;
		} else if (tfpubyear.getText().trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "출판년도를 입력해주세요.");
			tfpubyear.requestFocus();
			return;
		}
		User user = StartUI.LOGINUSER;
		Request req = new Request();
		req.setAuthor(tfauthor.getText());
		req.setBkname(tfBkname.getText());
		req.setIsbn(tfisbn.getText());
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		Date today = new Date();
		sd.format(today);
		req.setReqday(today);
		
		if(tfprice.getText().trim().isEmpty()) {
			req.setPrice(0);
		}else {
			req.setPrice(Integer.parseInt(tfprice.getText()));
		}
		
		req.setPubyear(Integer.parseInt(tfpubyear.getText()));
		req.setPublish(tfpublish.getText());
		req.setCode(user.getCode());
		RequestService service = new RequestService();
		if(service.selectRequestByCodeIsbn(req)==null) {
			service.insertRequest(req);
			JOptionPane.showMessageDialog(null, "도서신청이 완료되었습니다.");
		}else {
			JOptionPane.showMessageDialog(null, "이미 신청한 도서입니다.");
		}
		resetfield();
	}

	protected void actionPerformedBtnCancel(ActionEvent e) {
		resetfield();
	}
	private void resetfield() {
		tfBkname.setText("");
		tfauthor.setText("");
		tfpublish.setText("");
		tfpubyear.setText("");
		tfisbn.setText("");
		tfprice.setText("");
	}

}
